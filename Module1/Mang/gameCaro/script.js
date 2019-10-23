let luotChoi = 1;
let toaDoGanNhat = 0;

function Back(){
    if(toaDoGanNhat!=0){
        document.getElementById(toaDoGanNhat).innerHTML = '';
        luotChoi--;
    }
}

function dienXO(toaDo){
    let giaTriToaDo = document.getElementById(toaDo);
    if(luotChoi%2!=0&&giaTriToaDo.innerHTML==''){
        giaTriToaDo.innerHTML = 'X';
        giaTriToaDo.style.color = 'brown';
        luotChoi++;
        xacDinhWiner();
        toaDoGanNhat = toaDo;
        console.log(toaDoGanNhat);

    };
    if(luotChoi%2==0&&giaTriToaDo.innerHTML==''){
        giaTriToaDo.innerHTML = 'O';
        giaTriToaDo.style.color = 'blue';
        luotChoi++;
        xacDinhWiner();
        toaDoGanNhat = toaDo;
    }
}

function xacDinhWiner(){
    for(y=1;y<=12;y++){
        for(x=1;x<=8;x++){
            let idOCaRoNgang1 = y+'-'+x;
            let idOCaRoNgang2 = y+'-'+(x+1);
            let idOCaRoNgang3 = y+'-'+(x+2);
            let idOCaRoNgang4 = y+'-'+(x+3);
            let idOCaRoNgang5 = y+'-'+(x+4);


            let giaTriOCaRo1 = document.getElementById(idOCaRoNgang1).innerHTML;
            let giaTriOCaRo2 = document.getElementById(idOCaRoNgang2).innerHTML;
            let giaTriOCaRo3 = document.getElementById(idOCaRoNgang3).innerHTML;
            let giaTriOCaRo4 = document.getElementById(idOCaRoNgang4).innerHTML;
            let giaTriOCaRo5 = document.getElementById(idOCaRoNgang5).innerHTML;


            if((giaTriOCaRo1=='X'&&giaTriOCaRo2=='X'&&giaTriOCaRo3=='X'&&giaTriOCaRo4=='X'&&giaTriOCaRo5=='X')||(giaTriOCaRo1=='O'&&giaTriOCaRo2=='O'&&giaTriOCaRo3=='O'&&giaTriOCaRo4=='O'&&giaTriOCaRo5=='O')){
                let ketQua = document.getElementById('ketQua');
                ketQua.innerHTML = 'Game Over'
                break;
            }
        }
    }


    for(y=1;y<=8;y++){
        for(x=1;x<=12;x++){
            let idOCaRoNgang1 = y+'-'+x;
            let idOCaRoNgang2 = (y+1)+'-'+x;
            let idOCaRoNgang3 = (y+2)+'-'+x;
            let idOCaRoNgang4 = (y+3)+'-'+x;
            let idOCaRoNgang5 = (y+4)+'-'+x;


            let giaTriOCaRo1 = document.getElementById(idOCaRoNgang1).innerHTML;
            let giaTriOCaRo2 = document.getElementById(idOCaRoNgang2).innerHTML;
            let giaTriOCaRo3 = document.getElementById(idOCaRoNgang3).innerHTML;
            let giaTriOCaRo4 = document.getElementById(idOCaRoNgang4).innerHTML;
            let giaTriOCaRo5 = document.getElementById(idOCaRoNgang5).innerHTML;


            if((giaTriOCaRo1=='X'&&giaTriOCaRo2=='X'&&giaTriOCaRo3=='X'&&giaTriOCaRo4=='X'&&giaTriOCaRo5=='X')||(giaTriOCaRo1=='O'&&giaTriOCaRo2=='O'&&giaTriOCaRo3=='O'&&giaTriOCaRo4=='O'&&giaTriOCaRo5=='O')){
                let ketQua = document.getElementById('ketQua');
                ketQua.innerHTML = 'Game Over'
                break;
            }
        }
    }


    for(y=1;y<=8;y++){
        for(x=1;x<=8;x++){
            let idOCaRoNgang1 = y+'-'+x;
            let idOCaRoNgang2 = (y+1)+'-'+(x+1);
            let idOCaRoNgang3 = (y+2)+'-'+(x+2);
            let idOCaRoNgang4 = (y+3)+'-'+(x+3);
            let idOCaRoNgang5 = (y+4)+'-'+(x+4);


            let giaTriOCaRo1 = document.getElementById(idOCaRoNgang1).innerHTML;
            let giaTriOCaRo2 = document.getElementById(idOCaRoNgang2).innerHTML;
            let giaTriOCaRo3 = document.getElementById(idOCaRoNgang3).innerHTML;
            let giaTriOCaRo4 = document.getElementById(idOCaRoNgang4).innerHTML;
            let giaTriOCaRo5 = document.getElementById(idOCaRoNgang5).innerHTML;


            if((giaTriOCaRo1=='X'&&giaTriOCaRo2=='X'&&giaTriOCaRo3=='X'&&giaTriOCaRo4=='X'&&giaTriOCaRo5=='X')||(giaTriOCaRo1=='O'&&giaTriOCaRo2=='O'&&giaTriOCaRo3=='O'&&giaTriOCaRo4=='O'&&giaTriOCaRo5=='O')){
                let ketQua = document.getElementById('ketQua');
                ketQua.innerHTML = 'Game Over'
                break;
            }
        }
    }


    for(y=1;y<=8;y++){
        for(x=5;x<=12;x++){
            let idOCaRoNgang1 = y+'-'+x;
            let idOCaRoNgang2 = (y+1)+'-'+(x-1);
            let idOCaRoNgang3 = (y+2)+'-'+(x-2);
            let idOCaRoNgang4 = (y+3)+'-'+(x-3);
            let idOCaRoNgang5 = (y+4)+'-'+(x-4);


            let giaTriOCaRo1 = document.getElementById(idOCaRoNgang1).innerHTML;
            let giaTriOCaRo2 = document.getElementById(idOCaRoNgang2).innerHTML;
            let giaTriOCaRo3 = document.getElementById(idOCaRoNgang3).innerHTML;
            let giaTriOCaRo4 = document.getElementById(idOCaRoNgang4).innerHTML;
            let giaTriOCaRo5 = document.getElementById(idOCaRoNgang5).innerHTML;


            if((giaTriOCaRo1=='X'&&giaTriOCaRo2=='X'&&giaTriOCaRo3=='X'&&giaTriOCaRo4=='X'&&giaTriOCaRo5=='X')||(giaTriOCaRo1=='O'&&giaTriOCaRo2=='O'&&giaTriOCaRo3=='O'&&giaTriOCaRo4=='O'&&giaTriOCaRo5=='O')){
                let ketQua = document.getElementById('ketQua');
                ketQua.innerHTML = 'Game Over'
                break;
            }
        }
    }
}