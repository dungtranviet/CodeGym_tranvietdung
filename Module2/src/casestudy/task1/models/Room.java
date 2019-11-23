package casestudy.models;

public class Room extends Service {
    public Room(){
        this.setName("Room");
        this.setMoneyPerDay(100);
        this.setArea(50);
        this.setMaxOfNumberPeople(2);
        this.setRentType("theo ngày");
    }
    public String freeService(){
        return "bữa ăn sáng, nước nóng,bồn tắm";
    }
    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ :" + this.getName());
        System.out.println("diện tích sử dụng :" + this.getArea());
        System.out.println("chi phí thuê/ngày :" + this.getMoneyPerDay());
        System.out.println("số lượng người thuê tối đa : " + this.getMaxOfNumberPeople());
        System.out.println("kiểu thuê :" + this.getRentType());
        System.out.println("dịch vụ miễn phí : " + this.freeService());
    }
}
