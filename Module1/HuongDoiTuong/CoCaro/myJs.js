

let luotChoi="X";
let arrCell=[];
let Cell = function (x, y) {
    this.toaDoX = x;
    this.toaDoY = y;
    this.Value='';
    this.cellHtml = "<div id='" +  this.toaDoX + "-" + this.toaDoY + "' class='cell'" + " style= 'position: absolute;height: 40px;width: 40px;" +
        "left:" +this.toaDoY*40+ "px ;top:" + this.toaDoX*40+ "px' onclick= setValue1("+this.toaDoX + "," + this.toaDoY +")></div>";
};

function begin() {
    for(let i=0;i<10;i++){
        let raw=[];
        for(let j=0;j<10;j++){
            raw.push(new Cell(i,j));
        }
        arrCell[i]=raw;
    }
    drawBoard();
}
function drawBoard() {
        for(let i=0;i<10;i++){
            for(let j=0;j<10;j++){
                document.write(arrCell[i][j].cellHtml);
            }
        }
}
function setValue1(x,y) {
    alert("ok");
    drawBoard();
 //arrCell[x][y]="X";
}
begin();