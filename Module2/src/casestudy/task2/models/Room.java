package casestudy.task2.models;

import java.util.Scanner;

public class Room extends Service {
    private String freeService;
    public Room(){
    }
    public Room(String id){
        this.setId(id);
    }
    public String getFreeService(){
        return freeService;
    }
    public void setFreeService(String freeService){
        this.freeService=freeService;
    }
    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ :" + this.getName());
        System.out.println("diện tích sử dụng :" + this.getArea());
        System.out.println("chi phí thuê/ngày :" + this.getMoneyPerDay());
        System.out.println("số lượng người thuê tối đa : " + this.getMaxOfNumberPeople());
        System.out.println("kiểu thuê :" + this.getRentType());
        System.out.println("dịch vụ miễn phí : " + this.getFreeService());
    }
    @Override
    public void addNewService(String service){
        super.addNewService(service);
    Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào dịch vụ miễn phí đi kèm :");
        this.freeService=scanner.nextLine();
}

    @Override
    public String toString() {
        String data;
        data = super.toString()+ ","+this.getFreeService()+",";
        return data;
    }
    @Override
    public void convertToProperties(String data, int index){
        super.convertToProperties(data,index);
        if(index==7){
            this.setFreeService(data);
        }
    }
}
