package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String birthday;
    private String Address;
    private String image;
    private static List<Customer> list;

    static {
        list = new ArrayList<>();
        list.add(new Customer("Tran Dung", "20/11/1999", "Da Nang", "/ddd"));
        list.add(new Customer("Bui Toan", "09/12/1987", "Da Nang", "/ddd"));
        list.add(new Customer("Anh Huy", "23/11/1981", "Da Nang", "/ddd"));
        list.add(new Customer("Hai Hoang", "1/1/1992", "Da Nang", "/ddd"));
        list.add(new Customer("Vuong Hai", "1/1/1989", "Da Nang", "/ddd"));
        list.add(new Customer("Tran Cuong", "1/1/1999", "Da Nang", "/ddd"));
    }

    public static List<Customer> getCustomers() {
        return list;
    }

    public Customer(String name, String birthday, String address, String image) {
        this.name = name;
        this.birthday = birthday;
        Address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
