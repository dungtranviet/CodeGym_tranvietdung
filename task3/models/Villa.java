package casestudy.task3.models;

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
        System.out.println("Tên dịch vụ :" + this.getName());
        System.out.println("diện tích sử dụng :" + this.getArea());
        System.out.println("chi phí thuê/ngày :" + this.getMoneyPerDay());
        System.out.println("số lượng người thuê tối đa : " + this.getMaxOfNumberPeople());
        System.out.println("kiểu thuê :" + this.getRentType());
        System.out.println("tiêu chuẩn của phòng: " + this.getStandardOfRoom());
        System.out.println("tiện ích kèm theo : " + this.getOtherFacilities());
        System.out.println("số tầng :"+this.getNumberOfFloor());
        System.out.println("diện tích hồ bơi :"+this.poolArea);
    }
    @Override
    public void addNewService(String service){
        super.addNewService(service);
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào diện tích hồ bơi :");
        this.poolArea=scanner.nextInt();
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
