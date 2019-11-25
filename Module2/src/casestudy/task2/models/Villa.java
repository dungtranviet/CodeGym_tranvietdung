package casestudy.task2.models;

public class Villa extends VipService {

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
    }
}
