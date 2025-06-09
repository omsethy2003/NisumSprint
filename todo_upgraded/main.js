// main.js
import { TaskManager } from './taskManager.js';

const taskManager = new TaskManager();
const inputBox = document.getElementById("input-box");
const addButton = document.getElementById("add-button");
const listContainer = document.getElementById("list-container");

const createTaskElement = (task) => {
  const li = document.createElement("li");
  li.innerHTML = `${task.text}`;
  if (task.done) li.classList.add("checked");

  const span = document.createElement("span");
  span.textContent = "\u00d7";
  span.addEventListener("click", () => {
    taskManager.removeTask(task.id);
    render();
  });

  li.addEventListener("click", () => {
    taskManager.toggleTask(task.id);
    render();
  });

  li.appendChild(span);
  return li;
};

const render = () => {
  listContainer.innerHTML = "";
  for (const task of taskManager.getTasks()) {
    listContainer.appendChild(createTaskElement(task));
  }
};

addButton.addEventListener("click", () => {
  const text = inputBox.value.trim();
  if (text) {
    taskManager.addTask(text);
    inputBox.value = "";
    render();
  }
});

render();
