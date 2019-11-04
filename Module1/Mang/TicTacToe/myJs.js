let rowValue = 10;
let colValue = 10;
let luot_choi = "X";
let arr = [];
let gameOver=false;
function cell(x, y) {
    let cellHtml = "<div id='" + x + "-" + y + "' class='cell'" +
        " style='position: absolute;width: 40px ;height: 40px;left:" + y * 40 + "px;top:" + x * 40 + "px'" +
        " onclick='setXY(this.id)'></div>";
    return cellHtml;
}

function setXY(id) {
    let curentValue = document.getElementById(id).innerHTML;
    if (curentValue == ''&&!gameOver) {
        let toaDoX = id.charAt(0);
        toaDoX = parseInt(toaDoX);
        let toaDoY = id.charAt(2);
        toaDoY = parseInt(toaDoY);
        if (luot_choi == "X") {
            document.getElementById(id).innerHTML = "X";
            luot_choi = "O";
            arr[toaDoX][toaDoY] = "X";
            gameOver=checkEndGame(toaDoX,toaDoY,"X");


        } else {
            document.getElementById(id).innerHTML = "O";
            luot_choi = "X";
            arr[toaDoX][toaDoY] = "O";
        }

    }
}

function rawBoard() {
    for (let i = 0; i < rowValue; i++) {
        arr[i] = new Array();
        for (let j = 0; j < colValue; j++) {
            document.write(cell(i, j));
            arr[i][j] = '';
        }
        document.write("<br>")
    }
}

function checkEndGame(toadoX, toadoY, checkValue) {
    let counter = 1;
    let x = toadoX;
    let y = toadoY;
    //Check theo cot
    while ((x - 1) > 0) {
        if(arr[x - 1][y] == checkValue){
            counter++;
        }
        else break;
        x--;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    x = toadoX;
    while ((x + 1) < 10) {
        if(arr[x + 1][y] == checkValue){
            counter++;
        }
        else break;
        x++;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }

    //check theo hang
     x = toadoX;
    y = toadoY;
    counter=1;
    while ((y- 1) > 0) {
        if(arr[x][y-1] == checkValue){
            counter++;
        }
        else break;
        y--;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    y = toadoY;
    while ((y + 1) < 10) {
        if(arr[x][y+1] == checkValue){
            counter++;
        }
        else break;
        y++;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    //check theo duong cheo 1
    x = toadoX;
    y = toadoY;
    counter=1;
    while ((y- 1) > 0&&(x-1)>0) {
        if(arr[x-1][y-1] == checkValue){
            counter++;
        }
        else break;
        y--;
        x--;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    x=toadoX;
    y = toadoY;
    while ((y + 1) < 10&&(x + 1) < 10) {
        if(arr[x+1][y+1] == checkValue){
            counter++;
        }
        else break;
        y++;
        x++;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    //check theo duong cheo 2
    x = toadoX;
    y = toadoY;
    counter=1;
    while ((y- 1) > 0&&(x+1)<10) {
        if(arr[x+1][y-1] == checkValue){
            counter++;
        }
        else break;
        y--;
        x++;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
    x=toadoX;
    y = toadoY;
    while ((y + 1) < 10&&(x - 1) > 0) {
        if(arr[x-1][y+1] == checkValue){
            counter++;
        }
        else break;
        y++;
        x--;
    }
    if(counter>=5){
        alert("game over");
        return true;
    }
}
rawBoard();