package casestudy.models;

public class Villa extends VipService {

    public Villa() {
        this.setName("Villa");
        this.setMoneyPerDay(500);
        this.setArea(500);
        this.setMaxOfNumberPeople(8);
        this.setRentType("theo năm");
        this.setNumberOfFloor(4);
        this.setStandardOfRoom("Vip");
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ :" + this.getName());
        System.out.println("diện tích sử dụng :" + this.getArea());
        System.out.println("chi phí thuê/ngày :" + this.getMoneyPerDay());
        System.out.println("số lượng người thuê tối đa : " + this.getMaxOfNumberPeople());
        System.out.println("kiểu thuê :" + this.getRentType());
        System.out.println("tiêu chuẩn của phòng: "+this.getStandardOfRoom());
        System.out.println("tiện ích kèm theo : "+this.otherFacilities());
    }

    @Override
    public String otherFacilities() {
        return "có hồ bơi, view biển cực đẹp,có sân golf";
    }
}
