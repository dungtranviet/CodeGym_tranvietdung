
let arrCell=[];
let luotChoi="X";
let Cell = function (x, y) {
    this.toaDoX = x;
    this.toaDoY = y;
    this.Value='';
    this.cellHtml = '<div id="' + this.toaDoX + '-' + this.toaDoY + '" class="cell" style="position: absolute;height: 40px;width: 40px;' +
        'top:'+x*40+'px;left:  '+y*40+'px" onclick="this.setValue()"></div>'
};
 this.setValue=function () {
    if(this.Value==''){
        if(luotChoi=="X"){
            this.Value="X";
            luotChoi="O";
        }
        else {
            this.value="O";
            luotChoi="X";
        }
    }
    this.value=1;
}
function drawBoard() {
    let cell=new Array();
    for(let i=0;i<10;i++){
        arrCell[i]=cell;
        for(let j=0;j<10;j++){
            arrCell[i][j]=new Cell(i,j);
            document.write(arrCell[i][j].cellHtml);
        }
    }
}
drawBoard();