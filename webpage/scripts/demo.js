const PI_HOST = "something.local"; 
const API_URL = `http://${PI_HOST}:7125/api/printer/command`;
const STATUS_URL = `http://${PI_HOST}:7125/printer/objects/query?query=toolhead`;

function setButtonActive(btn) {
    btn.style.backgroundColor = "var(--accent-green)";
    btn.style.color = "#000";
}

function resetButton(btn) {
    btn.style.backgroundColor = "rgba(0,0,0,0.35)";
    btn.style.color = "var(--text-bright)";
}

// check if printer is idle
async function isPrinterIdle() {
    try {
        const res = await fetch(STATUS_URL);
        const data = await res.json();

        // check movement state
        const moving = data.result.toolhead?.moving;
        return !moving; // idle if not moving
    } catch (err) {
        console.error("Error checking printer status:", err);
        return false; // assume busy on error
    }
}

// wait until printer stops moving
async function waitForIdle() {
    while (true) {
        const idle = await isPrinterIdle();
        if (idle) return;
        await new Promise(r => setTimeout(r, 500)); // check every 0.5s
    }
}

async function callMacro(macroName, btn) {
    try {
        setButtonActive(btn);

        const response = await fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ commands: [macroName] })
        });

        if (!response.ok) throw new Error(`HTTP error ${response.status}`);
        const data = await response.json();
        console.log(`Macro "${macroName}" sent:`, data);

        // wait until printer finishes moving
        await waitForIdle();

    } catch (err) {
        console.error(`Error calling macro "${macroName}":`, err);
        alert(`Failed to call macro "${macroName}". Check console.`);
    } finally {
        resetButton(btn); // always reset
    }
}

document.querySelectorAll(".macro-btn").forEach(btn => {
    const macroName = btn.dataset.macro;
    if (!macroName) return;
    btn.addEventListener("click", () => callMacro(macroName, btn));
});

// Toggle between bph and G-code views 3/15/2026
document.querySelectorAll('.toggle-btn').forEach(btn => {
    btn.addEventListener('click', function(e) {
        e.stopPropagation();
        const card = this.closest('.macro-card');
        const view = this.dataset.view;
        
        // Update toggle buttons
        card.querySelectorAll('.toggle-btn').forEach(b => {
            b.classList.remove('active');
        });
        this.classList.add('active');
        
        // Update views
        card.querySelector('.source-view').classList.toggle('active', view === 'source');
        card.querySelector('.gcode-view').classList.toggle('active', view === 'gcode');
    });
});