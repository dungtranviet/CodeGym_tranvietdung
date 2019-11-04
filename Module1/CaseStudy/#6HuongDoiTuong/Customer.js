let Customer = function () {
    this.setInfor = function () {
        this.setName();
        this.setIdcard();
        this.setBirthday();
        this.setEmail();
        this.setAddress();
        this.setTypeCustomer();
        this.setDiscount();
        this.setNOA();
        this.setTypeRoom();
        this.setRentDay();
        this.setTypeSevice();
    };
    this.getInfor = function () {
        let infor = "Information Of Customer" + "\n"
            + "1.Name Customer:" + " " + this.Name + "\n"
            + "2.Id Card Customer:" + " " + this.IdCard + "\n"
            + "3.Birthday Customer:" + " " + this.Birthday + "\n"
            + "4.Email Customer:" + " " + this.Email + "\n"
            + "5.Address Customer:" + " " + this.Address + "\n"
            + "6.Type Customer:" + " " + this.TypeCustomer + "\n"
            + "7.Discount:" + " " + this.Discount + "\n"
            + "8.Number Of Accompanying:" + " " + this.NOA + "\n"
            + "9.Type Room:" + " " + this.TypeRoom + "\n"
            + "10.Rent Day:" + " " + this.RentDay + "\n"
            + "11.Type Sevice:" + " " + this.TypeSevice + "\n";
        return infor;
    };
    this.setName = function () {
        this.Name = prompt("Enter Name Customer");
    };
    this.setIdcard = function () {
        //Regexpress
        this.IdCard = prompt("Enter Id Card Customer");
    };
    this.setBirthday = function () {
        let validateBirthday = /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/;
        let checkBirthday = false;
        do {
            this.Birthday = prompt("Enter Birthday Customer  (dd/MM/YYYY)");
            checkBirthday = validateBirthday.test(this.Birthday);
            if (!checkBirthday) {
                alert("Birthday is Invalid!!please try again")
            }
        }
        while (!checkBirthday)
    };
    this.setEmail = function () {
        let validEmail = /^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$/gm;
        let checkEmail = false;
        do {
            this.Email = prompt("Enter Email Customer");
            checkEmail = validEmail.test(this.Email);
            if (!checkEmail) {
                alert("Email is Invalid!!please try again")
            }
        }
        while (!checkEmail)
    };
    this.setAddress = function () {
        this.Address = prompt("Enter Address Customer");
    };
    this.setTypeCustomer = function () {
        this.TypeCustomer = prompt("Enter Type Customer");
    };
    this.setDiscount = function () {
        let checkDiscount=false;
        do{
            this.Discount = prompt("Enter Discount");
            this.Discount=parseInt(this.Discount);
            checkDiscount=0<=this.Discount&&this.Discount<100;
            if(!checkDiscount){
                alert("Invalid!!please try again")
            }
        }
        while (!checkDiscount)
    };
    this.setNOA = function () {
        this.NOA = prompt("Enter Number Of Acccompannying:");
    };
    this.setTypeRoom = function () {
        this.TypeRoom = prompt("Enter Type Room");
    };
    this.setRentDay = function () {
        //Regexpress
        this.RentDay = prompt("Enter Rent Day");
    };
    this.setTypeSevice = function () {
        this.TypeSevice = prompt("Enter Type Sevice");
    };
    this.getName = function () {
        return this.Name;
    };
    this.getIdcard = function () {
        return this.IdCard;
    };
    this.TotalPays = function () {
        if (this.TypeRoom == "Villa") {
            this.Tpay = 500 * this.RentDay * (1 - this.Discount / 100);
        } else if (this.TypeRoom == "House") {
            this.Tpay = 300 * this.RentDay * (1 - this.Discount / 100);

        } else if (this.TypeRoom == "Room") {
            this.Tpay = 100 * this.RentDay * (1 - this.Discount / 100);
        } else {
            this.Tpay = "OOPs!!Type Room is Invalid";
        }
        return this.Tpay;
    };
};