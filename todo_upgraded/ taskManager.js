// taskManager.js
const generateId = (() => {
  let id = 0;
  return () => ++id;
})();

const symbolKey = Symbol("taskMeta");

export class Task {
  constructor(text, done = false) {
    this.id = generateId();
    this.text = text;
    this.done = done;
    this[symbolKey] = { created: new Date() };
  }
}

export class TaskManager {
  #tasks = new Map();
  #taskSet = new Set();
  #weakTaskMeta = new WeakMap();

  constructor() {
    this.loadTasks();
  }

  addTask = (text = "New Task") => {
    const task = new Task(text);
    this.#tasks.set(task.id, task);
    this.#taskSet.add(task);
    this.#weakTaskMeta.set(task, { updated: new Date() });
    this.saveTasks();
  };

  removeTask = (id) => {
    const task = this.#tasks.get(id);
    if (task) {
      this.#tasks.delete(id);
      this.#taskSet.delete(task);
      this.#weakTaskMeta.delete(task);
    }
    this.saveTasks();
  };

  toggleTask = (id) => {
    const task = this.#tasks.get(id);
    if (task) {
      task.done = !task.done;
      this.#weakTaskMeta.set(task, { updated: new Date() });
      this.saveTasks();
    }
  };

  getTasks = () => Array.from(this.#tasks.values());

  saveTasks = () => {
    const plainTasks = Array.from(this.#tasks.values()).map(({ id, text, done }) => ({ id, text, done }));
    localStorage.setItem("es6_todos", JSON.stringify(plainTasks));
  };

  loadTasks = () => {
    const tasks = JSON.parse(localStorage.getItem("es6_todos")) || [];
    for (const { id, text, done } of tasks) {
      const task = new Task(text, done);
      task.id = id; // override generated ID
      this.#tasks.set(task.id, task);
      this.#taskSet.add(task);
      this.#weakTaskMeta.set(task, { restored: true });
    }
  };
}
