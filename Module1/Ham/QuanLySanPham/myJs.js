let product = new Array();
function addNew() {
    let newSp = document.getElementById("name").value;
    product.push(newSp);
    Display();
}
function deleteProduct(Index) {
    Index = parseInt(Index);
    for (let i = Index; i < product; i++) {
        product[i] = product[i + 1];
    }
    product.length--;
    Display();
}

function editProduct(Index) {
    Index = parseInt(Index);
    product[Index] = prompt("input name product you want to change");
    Display();
}
function Display() {

    let process = "";
    let soLuong = product.length;
    for (let i = 0; i < product.length; i++) {
        process += "<tr>" +
            "<td>" + product[i] + "</td>" +
            "<td> <input type='button' id='" + i + "' value='delete' onclick='deleteProduct(this.id)'></td>" +
            "<td> <input type='button' id='" + i + "' value='edit'onclick='editProduct(this.id)'></td>" +
            "</tr>"
    }
    let result = "<table border=1> " +
        "<tr> " +
        "<th>Display All Product</th>" +
        "<th>" + soLuong + " products</th>" +
        "</tr>" +
        process +
        "</table>";
    document.getElementById("inforProduct").innerHTML = result;
}