package models;

import java.util.Scanner;

public abstract class Service {
    private String name;
    private int area;
    private int rentalCost;
    private int maxOfNumberPeople;
    private String rentType;
    private String id;

    public abstract void showInfor();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRentalCost() {
        return this.rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOfNumberPeople() {
        return this.maxOfNumberPeople;
    }

    public void setMaxOfNumberPeople(int maxOfNumberPeople) {
        this.maxOfNumberPeople = maxOfNumberPeople;
    }

    public String getRentType() {
        return this.rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public void addNewService(String service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên dịch vụ " +":");
        this.name = scanner.nextLine();
        System.out.println("nhập vào số tiền thuê theo ngày");
        while (true){
            this.rentalCost = scanner.nextInt();
            if(rentalCost>0){
                break;
            }
            else {
                System.out.println("số tiền thuê phải lớn hơn 0");
            }
        }

        System.out.println("nhập vào diện tích của " + service);
        while (true){
            this.area = scanner.nextInt();
            if(this.area>30){
                break;
            }
            else {
                System.out.println("diện tích phải lớn hơn 30");
            }
        }

        System.out.println("nhập vào số người tối đa :");
        while (true){
            this.maxOfNumberPeople = scanner.nextInt();
            if(0<this.maxOfNumberPeople&&this.maxOfNumberPeople<20){
                break;
            }
            else {
                System.out.println("số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20");
            }
        }
        scanner.nextLine();
        System.out.println("nhập vào kiểu thuê (ngày-tháng-năm)");
        while (true){
            this.rentType = scanner.nextLine();
            if(this.rentType.equals("ngày")||this.rentType.equals("tháng")||this.rentType.equals("năm")){
                break;
            }
            else {
                System.out.println("kiểu thuê phải là ngày-tháng-năm");
            }
        }

    }

    @Override
    public String toString() {
        String data = "" + this.id + "," + this.getName() + "," + this.getMaxOfNumberPeople() + "," + this.getRentType() + "," +
                this.getArea() + "," + this.getRentalCost();
        return data;
    }
    public void convertToProperties(String []data) {
        this.setId(data[0]);
        this.setName(data[1]);
        this.setMaxOfNumberPeople(Integer.parseInt(data[2]));
        this.setRentType(data[3]);
        this.setArea(Integer.parseInt(data[4]));
        this.setRentalCost(Integer.parseInt(data[5]));
    }
}