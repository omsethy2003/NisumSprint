const inputBox = document.getElementById("input-box");
const addButton = document.getElementById("add-button");
const listContainer = document.getElementById("list-container");

addButton.addEventListener("click", addTask);

function addTask() {
  const taskText = inputBox.value.trim();
  if (taskText === "") {
    alert("You must write something!");
    return;
  }

  let li = document.createElement("li");
  li.innerText = taskText;

  li.addEventListener("click", () => {
    li.classList.toggle("checked");
    saveData();
  });

  let span = document.createElement("span");
  span.innerText = "\u00d7";
  span.classList.add("close");
  span.addEventListener("click", () => {
    li.remove();
    saveData();
  });

  li.appendChild(span);
  listContainer.appendChild(li);
  inputBox.value = "";
  saveData();
}

function saveData() {
  localStorage.setItem("tasks", listContainer.innerHTML);
}

function loadTasks() {
  listContainer.innerHTML = localStorage.getItem("tasks") || "";
  // Reattach event listeners
  document.querySelectorAll("#list-container li").forEach(li => {
    li.addEventListener("click", () => {
      li.classList.toggle("checked");
      saveData();
    });

    let span = li.querySelector("span");
    if (span) {
      span.addEventListener("click", () => {
        li.remove();
        saveData();
      });
    }
  });
}

loadTasks();
