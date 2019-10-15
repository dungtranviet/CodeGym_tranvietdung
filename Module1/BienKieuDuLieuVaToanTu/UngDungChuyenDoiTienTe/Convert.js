function Convert() {
    let Amount = document.getElementById("Amount").value;
    Amount = parseInt(Amount)
    let ToCurr = document.getElementById("ToCurr").value;
    let FromCurr = document.getElementById("FromCurr").value;
    //Ty Gia:
    let USDtoVND = 23000;
    let USDtoYEN = 108;
    //quy doi ra USD
    switch (FromCurr) {
        case "VND":
            Amount = Amount / USDtoVND
            break;
        case "USD":
            break;
        case "Yen":
            Amount = Amount / USDtoYEN;
            break;

    }
//quy doi ra don vi tien mong muon
    switch (ToCurr) {
        case "VND":
            Amount = Amount * USDtoVND;
            break;
        case "USD":
            break;
        case  "Yen":
            Amount = Amount * USDtoYEN;
            break;

    }
    document.getElementById("so tien").innerHTML = Amount;

}