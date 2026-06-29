document.addEventListener("DOMContentLoaded", () => {
  const settingsBtn = document.getElementById("settings-btn");
  const modal = document.getElementById("settingsModal");
  const closeBtn = document.getElementById("closeSettingsBtn");
  const closeX = document.querySelector(".close-settings-modal");

  // GCODE FOLDER SETTINGS VARIABLES
  let gcodeFolderPath = localStorage.getItem("bellerophon-gcode-folder") || "";
  let gcodeFileList = [];
  let fileListOpen = false;

  function getThemeLabel(key) {
    return window.THEME_MAP?.[key]?.label || key;
  }

  function renderThemes() {
    const container = document.getElementById("themeSelector");
    if (!container || !window.THEME_MAP) return;

    container.innerHTML = "";

    Object.entries(window.THEME_MAP).forEach(([key, theme]) => {
      const div = document.createElement("div");
      div.className = "theme-option";
      div.dataset.theme = key;

      const previewColor = theme.preview || "#666";

      div.innerHTML = `
                <div class="theme-preview" style="background-color: ${previewColor};"></div>
                <span>${theme.label}</span>
            `;

      div.addEventListener("click", () => {
        if (window.applyTheme) {
          window.applyTheme(key);
        }
        setActiveTheme(key);
        localStorage.setItem("bellerophon-theme", key);
      });

      container.appendChild(div);
    });
  }

  function setActiveTheme(themeKey) {
    document.querySelectorAll(".theme-option").forEach((el) => {
      el.classList.toggle("active", el.dataset.theme === themeKey);
    });

    const desc = document.getElementById("themeDescription");
    if (desc) {
      desc.textContent = `Current theme: ${getThemeLabel(themeKey)}`;
    }
  }

  function renderGcodeSettings() {
    const container = document.getElementById("gcodeSettingsContainer");
    if (!container) return;

    const hasFolder = gcodeFolderPath && gcodeFolderPath.length > 0;
    const hasFiles = gcodeFileList && gcodeFileList.length > 0;
    const fileCount = gcodeFileList.length;

    container.innerHTML = `
      <div class="gcode-folder-setting">
        <div class="folder-status-row">
          <div class="folder-status">
            ${hasFolder ? 
              `<span class="folder-active">${gcodeFolderPath}</span>` : 
              `<span class="folder-inactive">No folder selected</span>`
            }
          </div>
          <div class="folder-actions">
            <button id="browseFolderBtn" class="browse-folder-btn">${hasFolder ? 'Change Folder' : 'Select Folder'}</button>
            ${hasFolder ? `<button id="removeFolderBtn" class="remove-folder-btn">✕ Remove</button>` : ''}
          </div>
        </div>
        
        ${hasFolder ? `
          <div class="folder-file-count">
            ${hasFiles ? 
              `<span class="file-count">${fileCount} .gcode files found</span>` : 
              `<span class="file-count-empty">No .gcode files in this folder</span>`
            }
          </div>
        ` : ''}
        
        ${hasFolder && hasFiles ? `
          <div class="gcode-file-list-container">
            <button id="gcodeFileToggle" class="gcode-file-list-toggle">
              <span> Show Files (${fileCount})</span>
              <span class="arrow ${fileListOpen ? 'open' : ''}">▼</span>
            </button>
            <div id="gcodeFileDropdown" class="gcode-file-list-dropdown ${fileListOpen ? 'open' : ''}">
              ${gcodeFileList.map(f => `
                <div class="file-item">
                  <span class="file-icon"></span>
                  <span class="file-name">${f}</span>
                </div>
              `).join('')}
            </div>
          </div>
        ` : ''}
      </div>
    `;

    const browseBtn = document.getElementById("browseFolderBtn");
    if (browseBtn) {
      browseBtn.addEventListener("click", selectFolder);
    }

    const removeBtn = document.getElementById("removeFolderBtn");
    if (removeBtn) {
      removeBtn.addEventListener("click", removeFolder);
    }

    const toggleBtn = document.getElementById("gcodeFileToggle");
    if (toggleBtn) {
      toggleBtn.addEventListener("click", () => {
        fileListOpen = !fileListOpen;
        renderGcodeSettings();
      });
    }
  }

  function removeFolder() {
    // Clear the folder path
    gcodeFolderPath = "";
    gcodeFileList = [];
    fileListOpen = false;
    
    // Remove from localStorage
    localStorage.removeItem("bellerophon-gcode-folder");
    localStorage.removeItem("bellerophon-gcode-files");
    
    // Clear the autocomplete list
    window.gcodeFileList = [];
    
    // Re-render the settings
    renderGcodeSettings();
    
    // Log the action
    addLogMessage("G-code folder removed.");
  }

  function selectFolder() {
    if (window.showDirectoryPicker) {
      window.showDirectoryPicker()
        .then(dirHandle => {
          const folderName = dirHandle.name;
          window.gcodeDirectoryHandle = dirHandle;
          gcodeFolderPath = folderName;
          localStorage.setItem("bellerophon-gcode-folder", folderName);
          scanDirectoryHandle(dirHandle);
          renderGcodeSettings();
          addLogMessage(`G-code folder set to: ${folderName}`);
        })
        .catch(err => {
          if (err.name !== 'AbortError' && err.name !== 'SecurityError') {
            console.error("Folder selection error:", err);
            addLogMessage("Failed to select folder: " + err.message);
          }
        });
    } else {
      const input = document.createElement('input');
      input.type = 'file';
      input.webkitdirectory = true;
      input.multiple = true;
      
      input.addEventListener('change', (e) => {
        const files = e.target.files;
        if (files.length === 0) return;
        
        const firstFile = files[0];
        const path = firstFile.webkitRelativePath;
        const folderName = path.split('/')[0];
        
        gcodeFolderPath = folderName;
        localStorage.setItem("bellerophon-gcode-folder", folderName);
        
        const gcodeFiles = [];
        for (let i = 0; i < files.length; i++) {
          const file = files[i];
          if (file.name.toLowerCase().endsWith('.gcode') || 
              file.name.toLowerCase().endsWith('.g') ||
              file.name.toLowerCase().endsWith('.gc')) {
            gcodeFiles.push(file.name);
          }
        }
        
        gcodeFileList = gcodeFiles;
        localStorage.setItem("bellerophon-gcode-files", JSON.stringify(gcodeFileList));
        updateGcodeAutocomplete(gcodeFileList);
        renderGcodeSettings();
        addLogMessage(`Found ${gcodeFiles.length} .gcode files in "${folderName}"`);
      });
      
      input.click();
    }
  }

  async function scanDirectoryHandle(dirHandle) {
    try {
      const gcodeFiles = [];
      const entries = dirHandle.values();
      
      for await (const entry of entries) {
        if (entry.kind === 'file') {
          const name = entry.name;
          if (name.toLowerCase().endsWith('.gcode') || 
              name.toLowerCase().endsWith('.g') ||
              name.toLowerCase().endsWith('.gc')) {
            gcodeFiles.push(name);
          }
        }
      }
      
      gcodeFileList = gcodeFiles;
      localStorage.setItem("bellerophon-gcode-files", JSON.stringify(gcodeFileList));
      updateGcodeAutocomplete(gcodeFileList);
      renderGcodeSettings();
      
      if (gcodeFiles.length > 0) {
        addLogMessage(`Found ${gcodeFiles.length} .gcode files in folder`);
      } else {
        addLogMessage("No .gcode files found in selected folder");
      }
    } catch (err) {
      console.error("Error scanning directory:", err);
      addLogMessage("Error scanning folder: " + err.message);
    }
  }

  function updateGcodeAutocomplete(files) {
    window.gcodeFileList = files;
  }

  function open() {
    modal.style.display = "block";
    const current = localStorage.getItem("bellerophon-theme") || "starter";
    renderThemes();
    setActiveTheme(current);
    renderGcodeSettings();
  }

  function close() {
    modal.style.display = "none";
  }

  settingsBtn?.addEventListener("click", open);
  closeBtn?.addEventListener("click", close);
  closeX?.addEventListener("click", close);

  window.addEventListener("click", (e) => {
    if (e.target === modal) close();
  });
});