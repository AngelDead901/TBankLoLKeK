// alert("Hello World");
const squareIsLoh = document.getElementById("square");
let count = 0;

squareIsLoh.addEventListener("click", function() {
    count++;
    console.clear();
    console.log(count);
    squareIsLoh.classList.toggle("squareLoh");
})
