package models;

import commons.FuncValidate;
import commons.StringFormat;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name="";
    private String birthday;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String email;
    private String type;
    private String address;
    private Service service;
    private Scanner scanner = new Scanner(System.in);

    public Customer() {

    }

    public Customer(String id) {
        this.id = id;
        this.addInfor();
    }
    public Customer(String id, String name, String birthday, String gender, int idCard, int phoneNumber, String email, String type, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.address = address;
    }
    public Customer(String id, String name, String birthday, String gender, int idCard, int phoneNumber, String email, String type, String address, Service service) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.address = address;
        this.service = service;
    }

    public void addInfor() {
        boolean isValid=false;
        System.out.println("Nhập thông tin khách hàng :");
        String name;
        do {
            System.out.println("name :");
            name=scanner.nextLine();
            isValid= FuncValidate.chekName(name);
            if(!isValid){
                System.out.println("Tên khách hàng phải in hoa ký tự đầu tiên của mỗi từ");
            }
        }
        while (!isValid);
        this.setName(name);
        String birthday;
        do {
            System.out.println("birthday :");
            birthday=scanner.nextLine();
            isValid=FuncValidate.checkBirthday(birthday);
            if(!isValid){
                System.out.println("ngày sinh phải theo định dạng dd/mm/yyyy và lớn hơn 18 tuổi");
            }
        } while (!isValid);
        this.setBirthday(birthday);
        System.out.println("gender: ");
        String gender;
        do {
            gender=scanner.nextLine();
            isValid=FuncValidate.checkGender(gender);
            if(!isValid){
                System.out.println("giới tính phải là male, female, hoặc unknow");
            }
        } while (!isValid);
        gender= StringFormat.get(gender);
        this.setGender(gender);
        System.out.println("id card :");
        int idCard;
        do {
            idCard=scanner.nextInt();
            isValid=FuncValidate.checkIdCard(idCard);
            if (!isValid) {
                System.out.println("id card phải có 9 chữ số !!");
            }
        } while (!isValid);
        this.setIdCard(idCard);
        System.out.println("phone number :");
        this.setPhoneNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("email :");
        String email;
        do {
            email=scanner.nextLine();
            isValid=FuncValidate.checkEmail(email);
            if(!isValid){
                System.out.println("email phải đúng định dạng abc@abc.abc");
            }
        } while (!isValid);
        this.setEmail(email);
        System.out.println("type customer :");
        this.setType(scanner.nextLine());
        System.out.println("address of customer :");
        this.setAddress(scanner.nextLine());
    }

    public void showInfor() {
        System.out.println("Thông tin khách hàng : " +
                "\nname: " + name +
                "\nbirthday: " + birthday +
                "\ngender: " + gender +
                "\nidCard: " + idCard +
                "\nphoneNumber: " + phoneNumber +
                "\nemail: " + email +
                "\ntype: " + type +
                "\naddress: " + address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "" + id + "," + name + "," + birthday + "," + gender + "," + idCard + "," + phoneNumber + "," + email + "," + type + "," + address + ",";
    }
    public void convertToProperties(String[] data) {
        this.setId(data[0]);
        this.setName(data[1]);
       this.setBirthday(data[2]);
       this.setGender(data[3]);
        this.setIdCard(Integer.parseInt(data[4]));
        this.setPhoneNumber(Integer.parseInt(data[5]));
        this.setEmail(data[6]);
        this.setType(data[7]);
        this.setAddress(data[8]);
    }
}
