let alertString = "";
let select = 0;
let customer;
function Menu() {
    select = parseInt(prompt("1.Add new customer" + "\n" + "2.Display information customer" + "\n"
        + "3.Display total pay of customer " + "\n" + "4.Edit information customer" + "\n" + "5.Delete customer" + "\n" + "6.Exit"));
    switch (select) {
        case 1:
            addCustomer();
            break;
        case 2:
            selectAction("display");
            break;
        case 3:
            selectAction("totalPays");
            break;
        case 4:
            selectAction("edit");
            break;
        case 5:
            selectAction("delete");
            break;
        case 6:
            break;
        default: {
            alert("Invalid");
            Menu();
        }
    }
}
function addCustomer() {
    customer = new Customer();
    customer.setInfor();
    listCustomer.push(customer);
    Menu();
}
function selectAction(action) {
    let valid=false;
    switch (action) {
        case "display":
            alertString = "Choose Customer you want display \n";
             valid = selectCustomer();
            if (valid) {
                DisplayInfor();
            }
            break;
        case "edit":
            alertString = "Choose Customer you want edit \n";
            valid = selectCustomer();
            if (valid) {
                editInfo();
            }
            break;
        case "delete":
            alertString = "Choose Customer you want delete \n";
            valid = selectCustomer();
            if (valid) {
                deleteCustomer(select);
            }
            break;
        case "totalPays":
            alertString = "Choose Customer you want calculate \n";
            valid = selectCustomer();
            if (valid) {
                alert("Total Pays of this customer :" + customer.TotalPays());
            }
            Menu();
            break;
        default:
            break;
    }
}
function selectCustomer() {
    for (let i = 0; i < listCustomer.length; i++) {
        alertString += (i + 1) + ". Name : " + listCustomer[i].getName() + " ;Id card : " + listCustomer[i].getIdcard() + "\n";
    }
    alertString += (listCustomer.length + 1) + ". Back";
    let valid = false;
    do {
        select = prompt(alertString);
        select = parseInt(select);
        select--;
        valid = select >= 0 && select <= listCustomer.length;
        if (!valid) {
            alert("Invalid!!!");
        }
    }
    while (!valid);
    if (select == listCustomer.length) {
        Menu();
    } else {
        customer = listCustomer[select];
        return true;
    }
}
function DisplayInfor() {
    alertString = "";
    alertString += customer.getInfor();
    alert(alertString);
    this.Menu();
}

function editInfo() {
    alertString = "Choose information you want change";
    alertString += customer.getInfor();
    alertString += "12.Back";
    select = prompt(alertString);
    let inValid = true;
    do {
        select = parseInt(select);
        if (1 <= select && select <= 12) {
            inValid = false;
            break;
        }
        alert("Invalid!!");
    }
    while (inValid);
    switch (select) {
        case 1:
            customer.setName();
            break;
        case 2:
            customer.setIdcard();
            break;
        case 3:
            customer.setBirthday();
            break;
        case 4:
            customer.setEmail();
            break;
        case 5:
            customer.setAddress();
            break;
        case 6:
            customer.setTypeCustomer();
            break;
        case 7:
            customer.setDiscount();
            break;
        case 8:
            customer.setNOA();
            break;
        case 9:
            customer.setTypeRoom();
            break;
        case 10:
            customer.setRentDay();
            break;
        case 11:
            customer.setTypeSevice();
            break;
        case 12:
            selectAction("edit");
    }
    Menu();
}

function deleteCustomer(index) {
    let agree = confirm("Are you sure??");
    if (agree) {
        listCustomer.splice(listCustomer[index]-1,1);
    }
    Menu();
}