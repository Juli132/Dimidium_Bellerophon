// Data Retrieval
const urlParams = new URLSearchParams(window.location.search);
const groupId = parseInt(urlParams.get("id"));
let groups = JSON.parse(localStorage.getItem("gravity_groups")) || [];
let currentGroup = groups[groupId];

// Redirect if something goes wrong
if (!currentGroup) {
  window.location.href = "hub.html";
}

// UI Elements
const title = document.getElementById("group-title");
const dashboard = document.getElementById("printer-dashboard");
const modal = document.getElementById("printer-modal");
const typeDisplay = document.getElementById("display-machine-type");

title.textContent = `${currentGroup.name} Dashboard`;
typeDisplay.value = currentGroup.type;

function renderPrinters() {
  dashboard.innerHTML = "";

  if (!currentGroup.printers) currentGroup.printers = [];

  currentGroup.printers.forEach((printer, index) => {
    const card = document.createElement("div");
    card.className = "printer-card";

    // Removed the IP address line from the innerHTML
    card.innerHTML = `
            <button class="delete-btn" title="Delete Printer">×</button>
            <div class="status-dot"></div>
            <h3>${printer.name}</h3>
            <p>Status: <span class="status-text">Ready</span></p>
        `;

    // It still knows the IP because it's captured in this closure
    card.onclick = () => {
      window.location.href = `dash.html?ip=${encodeURIComponent(printer.ip)}`;
    };

    const delBtn = card.querySelector(".delete-btn");
    delBtn.onclick = (e) => {
      e.stopPropagation();
      deletePrinter(index);
    };

    dashboard.appendChild(card);
  });
}

function deletePrinter(index) {
  if (confirm("Delete this printer?")) {
    currentGroup.printers.splice(index, 1); // Remove from array
    groups[groupId] = currentGroup; // Update master list
    localStorage.setItem("gravity_groups", JSON.stringify(groups)); // Save
    renderPrinters(); // Refresh UI
  }
}

// Modal Controls
document.getElementById("add-printer-btn").onclick = () => {
  modal.style.display = "block";
};

document.getElementById("close-printer-modal").onclick = () => {
  modal.style.display = "none";
};

// Saving Logic
document.getElementById("save-printer-btn").onclick = () => {
  const pName = document.getElementById("printer-name-input").value.trim();
  const pIp = document.getElementById("printer-ip-input").value.trim();

  if (pName && pIp) {
    currentGroup.printers.push({ name: pName, ip: pIp });
    groups[groupId] = currentGroup;
    localStorage.setItem("gravity_groups", JSON.stringify(groups));

    renderPrinters();

    modal.style.display = "none";
    document.getElementById("printer-name-input").value = "";
    document.getElementById("printer-ip-input").value = "";
  } else {
    alert("Enter a name and IP.");
  }
};

renderPrinters();
