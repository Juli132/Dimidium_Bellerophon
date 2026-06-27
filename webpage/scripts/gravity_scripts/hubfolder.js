// This program is for the hub folder button.
// it allows users to select the specific file from their computer
// since Mainsail has its own drag n drop, the user can just drag the file into the webpage
// good for demonstrative PURPOSES

document.getElementById("open-folder-btn").addEventListener("click", () => {
  const input = document.createElement("input");
  input.type = "file";
  input.accept = ".cfg, .stl, .obj, .gcode"; // specific file types
  input.multiple = false; //  one file at a time
  input.onchange = (e) => {
    const file = input.files[0];
    if (!file) return;
    console.log("Selected file:", file.name);
    const reader = new FileReader();
    reader.onload = function (event) {
      const fileContents = event.target.result;
      console.log("File content:", fileContents);
    };

    if (file.name.endsWith(".cfg")) {
      reader.readAsText(file); // text-based
    } else {
      reader.readAsArrayBuffer(file); // binary files .stl/.obj
    }
  };
  input.click();
});
