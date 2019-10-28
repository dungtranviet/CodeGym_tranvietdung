let ValueArrays = new Array(13);
let Victory = false;
let toaDo_Hang = new Array();
let toaDo_Cot = new Array();
let luotChoi = 1;
let Counter = 0;
//Display();
//GamePlay();

function Begin() {
    for (let i = 0; i < 13; i++) {
        ValueArrays[i] = new Array(13);
    }
}

function dienXO(IdToaDo) {
    let giaTriToaDo = document.getElementById(IdToaDo);
    IdToaDo = IdToaDo.split('');
    tinhToaDo(IdToaDo);
    if (luotChoi % 2 != 0 && giaTriToaDo.innerHTML == '') {
        giaTriToaDo.innerHTML = 'X';
        giaTriToaDo.style.color = 'brown';
        ValueArrays[toaDo_Hang][toaDo_Cot] = 'X';
        CheckVictory(toaDo_Hang, toaDo_Cot, 'X');
    }
    if (luotChoi % 2 == 0 && giaTriToaDo.innerHTML == '') {
        giaTriToaDo.innerHTML = 'O';
        giaTriToaDo.style.color = 'blue';
        ValueArrays[toaDo_Hang][toaDo_Cot] = 'O';
        CheckVictory(toaDo_Hang, toaDo_Cot, 'O');
    }
    luotChoi++;
    toaDo_Hang = [];
    toaDo_Cot = [];
}

function tinhToaDo(IdToaDo) {
    let temp = IdToaDo.pop();
    while (temp != "-") {
        toaDo_Cot.push(temp);
        temp = IdToaDo.pop();
    }
    toaDo_Hang = IdToaDo;
    toaDo_Cot = toaDo_Cot.reverse();
    toaDo_Cot = parseInt(toaDo_Cot.join(""));
    toaDo_Hang = parseInt(toaDo_Hang.join(""));
}

function CheckVictory(a, b, value) {
    checkRow_chieuDuong(a, b, value);
    checkRow_chieuAm(a, b, value);
    if (Counter >= 4) {
        alert("Chien thang theo hang");
        Counter = 0;
    } else {
        checkColumm_chieuDuong(a, b, value);
        checkColumm_chieuAm(a, b, value);
        if (Counter >= 4) {
            alert("Chien thang theo cot");
            Counter = 0;
        } else Counter = 0;
    }

}

//GIẢ SỬ XÉT 1 ĐIỂM Ở HÀNG A CỘT B
//Check theo hang
function checkRow_chieuDuong(a, b, value) {
    if (ValueArrays[a][b + 1] == value) {
        Counter += 1;
        if (Counter >= 4) return 0;
        else {
            checkRow_chieuDuong(a, b + 1, value);
        }
    }
}

function checkRow_chieuAm(a, b, value) {
    if (ValueArrays[a][b - 1] == value) {
        Counter += 1;
        if (Counter >= 4) return 0;
        else {
            checkRow_chieuAm(a, b - 1, value);
        }
    }
}

//Check theo cot
function checkColumm_chieuDuong(a, b, value) {
    if (a + 1 < 13) {
        if (ValueArrays[a + 1][b] == value) {
            Counter += 1;
            if (Counter >= 4) return 0;
            else {
                checkColumm_chieuDuong(a + 1, b, value);
            }
        }
    }
}

function checkColumm_chieuAm(a, b, value) {
    if (a - 1 >= 0) {
        if (ValueArrays[a - 1][b] == value) {
            Counter += 1;
            if (Counter >= 4) return 0;
            else {
                checkColumm_chieuAm(a - 1, b, value);
            }
        }
    }

}

//Check theo duong cheo1
function checkCheo1_chieuDuong(a, b, value) {

    if (ValueArrays[a + 1][b+1] == value) {
        Counter += 1;
        if (Counter >= 4) return 0;
        else {
            checkColumm_chieuAm(a +1, b+1, value);

        }

    }
}
    function checkCheo1_chieuAm(a, b, value) {

        if (ValueArrays[a - 1][b-1] == value) {
            Counter += 1;
            if (Counter >= 4) return 0;
            else {
                checkColumm_chieuAm(a -1, b-1, value);

            }

        }
    }

//Check theo duong cheo 2
    function CheckCheo2_Duong() {

    }

    function CheckCheo2_Am() {

    }