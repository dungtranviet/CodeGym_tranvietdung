package casestudy.models;

public class House extends VipService {
    public House(){
        this.setName("House");
        this.setMoneyPerDay(300);
        this.setArea(200);
        this.setMaxOfNumberPeople(5);
        this.setRentType("theo tháng");
        this.setNumberOfFloor(2);
        this.setStandardOfRoom("business");
    }
    @Override
    public String otherFacilities() {
        return "có vườn hoa, có nơi đỗ xe";
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ :" + this.getName());
        System.out.println("diện tích sử dụng :" + this.getArea());
        System.out.println("chi phí thuê/ngày :" + this.getMoneyPerDay());
        System.out.println("số lượng người thuê tối đa : " + this.getMaxOfNumberPeople());
        System.out.println("kiểu thuê :" + this.getRentType());
        System.out.println("tiêu chuẩn của phòng "+this.getStandardOfRoom());
        System.out.println("tiện ích kèm theo: "+this.otherFacilities());
    }
}
