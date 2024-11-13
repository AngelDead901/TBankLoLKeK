const metricBox = document.getElementById("metricBox");
const detectButton = document.getElementById("detectButton");
const display = document.getElementById("display");

const displayMetric = () => {
    console.clear();
    console.log(coords, inCard, inButton);
    display.innerText = `Cursor Enter/Leave Cord: x=${coords[0]} y=${coords[1]}\n
                         Cursor in Card: ${inCard}    Cursor in Button: ${inButton}`;
}

let inCard = false;
let inButton = false;
let coords = [0, 0];

metricBox.addEventListener("mousemove", (e) => {
    coords[0] = [e.offsetX, e.offsetY];
    inCard = true;
    displayMetric();
})

metricBox.addEventListener("mouseleave", (e) => {
    inCard = false;
    coords = [0, 0];
    displayMetric();
})

detectButton.addEventListener("mouseenter", (e) => {
    inButton = true;
    displayMetric();
})

detectButton.addEventListener("mouseleave", (e) => {
    inButton = false;
    displayMetric();
})