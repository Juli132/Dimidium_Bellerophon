// one of our essential scripts, this is the main one for the info tab. it allows users to compile their code and see the gcode output.

document.addEventListener('DOMContentLoaded', () => {
    const runBtn = document.getElementById('compile-btn');
    const outputDiv = document.getElementById('gcode-output');
    const codeInput = document.getElementById('code-input');
    const lineNumbers = document.getElementById('line-numbers');

    // Update line numbers dynamically
    codeInput.addEventListener('input', () => {
        const lines = codeInput.value.split('\n').length;
        lineNumbers.textContent = Array.from({length: lines}, (_, i) => i + 1).join('\n');
    });

    // Fetch compiled G-code on RUN
    runBtn.addEventListener('click', () => {
        fetch('output.cfg') // Make sure Java compiler writes here....
            .then(res => res.text())
            .then(gcode => {
                outputDiv.textContent = gcode;
            })
            .catch(err => {
                outputDiv.textContent = "Error loading G-code: " + err; // basic error handling
            });
    });
});
