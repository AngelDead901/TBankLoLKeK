// alert("Hello World");
const squareIsLoh = document.getElementById("square");
const upgradeElement = document.getElementById("upgrade");
const counter = document.getElementById("squareText");
class_name = "squareColor";
color = 0;
upgrade = 1;
let count = 0;

squareIsLoh.addEventListener("click", function() {
    count+=upgrade;
    console.clear();
    console.log(count);
    squareIsLoh.classList.toggle("squareAnimColor" + color);
    setTimeout(function() {squareIsLoh.classList.toggle("squareAnimColor" + color);}, 1000);
    counter.textContent = "Clicks: " + count;
})

upgradeElement.addEventListener("click", function() {
    if(count >= upgrade * 100) {
        count -= upgrade * 100;
        upgrade++;
    }
    counter.textContent = "Clicks: " + count;
})