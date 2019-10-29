

function Circle(x, y) {
    this.x = x;
    this.y = y;
    this.radius=getRandomHex();
    this.color=getRandomColor();
}

function getRandomHex() {
    return Math.floor(Math.random() * 255);
}

function getRandomColor() {
    let red = getRandomHex();
    let green = getRandomHex();
    let blue = getRandomHex();
    return "rgb(" + red + "," + blue  + "," + green + ")";
}

let Circles=[];
function createCircle() {
    let x=Math.random()*window.innerWidth;
    let y=Math.random()*window.innerHeight;
    let circle = new Circle(x, y);
    Circles.push(circle);
}

function createMultipleCricle() {
    for(let i=0;i<30;i++){
        createCircle();
    }
}
createMultipleCricle();

setInterval(function(){
    reLoad();
}, 100);

function reLoad() {
    clearDisplay();
    for(let i=0;i<Circles.length;i++){
        var num = Math.floor(Math.random()*6) + 1; // this will get a number between 1 and 99;
        num *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
        Circles[i].x+=num;
        var num = Math.floor(Math.random()*3) + 1; // this will get a number between 1 and 99;
        num *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
        Circles[i].y+=num;
        Display(Circles[i]);
    }
}
function clearDisplay() {
    let ctx = document.getElementById("myCanvas").getContext("2d");
    ctx.clearRect(0, 0, 1368, 768);
}
function Display(R) {
    let ctx = document.getElementById("myCanvas").getContext("2d");
    ctx.beginPath();
    ctx.arc(R.x, R.y, R.radius, 0, 2 * Math.PI);
    ctx.fillStyle = R.color;
    ctx.fill();
}