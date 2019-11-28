package models;

import java.util.Scanner;

public class Villa extends VipService {
    private int poolArea;

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public Villa() {
    }

    public Villa(String id) {
        this.setId(id);
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ :" + this.getName()+
        "\ndiện tích sử dụng :" + this.getArea()+
        "\nchi phí thuê/ngày :" + this.getRentalCost()+
        "\nsố lượng người thuê tối đa : " + this.getMaxOfNumberPeople()+
        "\nkiểu thuê :" + this.getRentType()+
        "\ntiêu chuẩn của phòng: " + this.getStandardOfRoom()+
        "\ntiện ích kèm theo : " + this.getOtherFacilities()+
        "\nsố tầng :"+this.getNumberOfFloor()+
       "\ndiện tích hồ bơi :"+this.poolArea);
    }
    @Override
    public void addNewService(String service){
        super.addNewService(service);
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào diện tích hồ bơi :");
        boolean isValid=false;
        while (!isValid){
            this.poolArea=scanner.nextInt();
            if (this.poolArea>30) {
                isValid=true;
            }
            else {
                System.out.println("diện tích hồ bơi phải lớn hơn 30 m2!!!");
            }
        }
    }
    @Override
    public String toString() {
        String data =super.toString()+this.getPoolArea()+",";
        return data;
    }

    @Override
    public void convertToProperties(String []data){
        super.convertToProperties(data);
        this.setPoolArea(Integer.parseInt(data[9]));
    }
}
