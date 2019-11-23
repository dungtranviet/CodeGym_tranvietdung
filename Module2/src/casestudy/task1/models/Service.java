package casestudy.models;

public abstract class Service {
    private String name;
    private int area;
    private int moneyPerDay;
    private int maxOfNumberPeople;
    private String rentType;

    public abstract void showInfor();

    public  String getName() {
        return this.name;
    }

    protected  void setName(String name) {
        this.name = name;
    }

    public  int getArea() {
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

    public  String getRentType() {
        return this.rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
