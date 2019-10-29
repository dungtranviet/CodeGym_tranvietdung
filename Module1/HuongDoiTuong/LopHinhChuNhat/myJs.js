let Rectangle=function (a,b) {
    this.chieuDai=a;
    this.chieuRong=b;
    this.dienTich=function () {
        return this.chieuDai*this.chieuRong;
    };
    this.setChieuDai=function (a) {
        this.chieuDai=a;
    };
    this.setChieuRong=function (b) {
        this.chieuRong=b;
    };
};

function drawRect(){
    ctx=document.getElementById("myCanvas").getContext("2d");
    ctx.clearRect(0, 0, 800, 500);
    let a=hinhChuNhat.chieuDai;
    let b=hinhChuNhat.chieuRong;
    ctx.fillStyle = "#FF0000";
    ctx.fillRect(0,0,a,b);
    document.getElementById("dt").innerHTML="Diện tích hình chữ nhật là: "+hinhChuNhat.dienTich();
}
function editRect(){
    let a=document.getElementById("a").value;
    let b=document.getElementById("b").value;
    a=parseInt(a);
    b=parseInt(b);
    hinhChuNhat.setChieuDai(a);
    hinhChuNhat.setChieuRong(b);
    drawRect();
}
let hinhChuNhat=new Rectangle(300,150);
drawRect();