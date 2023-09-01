function renderPetDataInTable(todos) {
    const mytable = document.getElementById("html-data-table");
    mytable.innerHTML = "";
    let labelRow = document.createElement("tr");
    let cell = document.createElement("th");
    cell.innerText = "Id";
    labelRow.appendChild(cell);
    cell = document.createElement("th");
    cell.innerText = "Name";
    labelRow.appendChild(cell);
    cell = document.createElement("th");
    cell.innerText = "Owner";
    labelRow.appendChild(cell);
    cell = document.createElement("th");
    cell.innerText = "Species";
    labelRow.appendChild(cell);
    cell = document.createElement("th");
    cell.innerText = "Birth Date";
    labelRow.appendChild(cell);
    cell = document.createElement("th");
    cell.innerText = "Death Date";
    labelRow.appendChild(cell);
    mytable.appendChild(labelRow);
    todos.forEach(todo => {
        let newRow = document.createElement("tr");
        Object.values(todo).forEach((value) => {
            let cell = document.createElement("td");
            cell.innerText = value;
            newRow.appendChild(cell);
        })
        mytable.appendChild(newRow);
    });
}