var frames = ["Frame 1", "Frame 2", "Frame 3"];

// Prompt the user to select a frame
var selectedFrame = prompt("Select a frame:\n" + frames.join("\n"));

// Display the selected frame
if (selectedFrame && frames.includes(selectedFrame)) {
    console.log("You selected: " + selectedFrame);
} else {
    console.log("Invalid selection or canceled.");
}
