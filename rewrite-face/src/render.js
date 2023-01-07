// Modules to control application life and create native browser window
const {app, BrowserWindow} = require('electron')
const path = require('path')

app.whenReady().then(() => {
    createWindow()

    app.on('activate', function () {
        if (BrowserWindow.getAllWindows().length === 0) createWindow()
    })
})

function createWindow () {
    const mainWindow = new BrowserWindow({
        width: 800,
        height: 600,
        webPreferences: {
            preload: path.join(__dirname, 'preload.js')
        }
    })

    mainWindow.loadURL("http://localhost:8081")
}

app.on('window-all-closed', function () {
    if (process.platform !== 'darwin') app.quit()
})
