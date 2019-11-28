package casestudy.task2.models;

import java.util.Scanner;

public abstract class Service {
    private String name;
    private int area;
    private int moneyPerDay;
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

    public int getMoneyPerDay() {
        return this.moneyPerDay;
    }

    public void setMoneyPerDay(int moneyPerDay) {
        this.moneyPerDay = moneyPerDay;
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
        System.out.println("nhập vào tên " + service + ":");
        this.name = scanner.nextLine();
        System.out.println("nhập vào số tiền thuê theo ngày");
        this.moneyPerDay = scanner.nextInt();
        System.out.println("nhập vào diện tích của " + service);
        this.area = scanner.nextInt();
        System.out.println("nhập vào số người tối đa :");
        this.maxOfNumberPeople = scanner.nextInt();
        System.out.println("nhập vào kiểu thuê (ngày-tháng-năm)");
        scanner.nextLine();
        this.rentType = scanner.nextLine();
    }

    @Override
    public String toString() {
        String data = "" + this.id + "," + this.getName() + "," + this.getMaxOfNumberPeople() + "," + this.getRentType() + "," +
                this.getArea() + "," + this.getMoneyPerDay();
        return data;
    }

    public void convertToProperties(String data) {
        int number;
        switch (index) {
            case 1:
                this.setId(data);
                break;
            case 2:
                this.setName(data);
                break;
            case 3:
                number = Integer.parseInt(data);
                this.setMaxOfNumberPeople(number);
                break;
            case 4:
                this.setRentType(data);
                break;
            case 5:
                number = Integer.parseInt(data);
                this.setArea(number);
                break;
            case 6:
                number = Integer.parseInt(data);
                this.setMoneyPerDay(number);
                break;
            default:break;
        }
    }
}