package casestudy.task3.models;

import java.util.Scanner;

public abstract class VipService extends Service {
    private String standardOfRoom;
    private int numberOfFloor;
    private String otherFacilities;

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void addNewService(String serviceType) {
        super.addNewService(serviceType);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhập vào số tầng của " + serviceType);
        this.setNumberOfFloor(scanner1.nextInt());
        scanner1.nextLine();
        System.out.println("nhập vào tiêu chuẩn của " + serviceType);
        this.setStandardOfRoom(scanner1.nextLine());
        System.out.println("nhập vào tiện ích khác ");
        this.otherFacilities=scanner1.nextLine();
    }
    @Override
    public String toString() {
        String data;
        data = super.toString()+ ","+this.getStandardOfRoom() + ","+
                this.getOtherFacilities() + ","+ this.getNumberOfFloor()+",";
        return data;
    }
    @Override
    public void convertToProperties(String []data){
        super.convertToProperties(data);
        this.setStandardOfRoom(data[6]);
        this.setOtherFacilities(data[7]);
        this.setNumberOfFloor(Integer.parseInt(data[8]));
        }
}

