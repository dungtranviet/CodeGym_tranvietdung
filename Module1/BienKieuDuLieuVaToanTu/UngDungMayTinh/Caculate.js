

function Add() {
    let Result=234;
    let Num1 = document.getElementById("Num1").value;
    let Num2 = document.getElementById("Num2").value;
    Num1 = parseInt(Num1);
    Num2 = parseInt(Num2);
    Result = Num1 + Num2;
    document.getElementById("Result").innerHTML = Result;


}

function Sub() {
    let Result=234;
    let Num1 = document.getElementById("Num1").value;
    let Num2 = document.getElementById("Num2").value;
    Num1 = parseInt(Num1);
    Num2 = parseInt(Num2);
    Result = Num1 - Num2;
    document.getElementById("Result").innerHTML = Result;
}

function Multi() {
    let Result=234;
    let Num1 = document.getElementById("Num1").value;
    let Num2 = document.getElementById("Num2").value;
    Num1 = parseInt(Num1);
    Num2 = parseInt(Num2);
    Result = Num1 * Num2;
    document.getElementById("Result").innerHTML = Result;
}

function Divi() {
    let Result=234;
    let Num1 = document.getElementById("Num1").value;
    let Num2 = document.getElementById("Num2").value;
    Num1 = parseInt(Num1);
    Num2 = parseInt(Num2);
    Result = Num1 / Num2;
    document.getElementById("Result").innerHTML = Result;
}

