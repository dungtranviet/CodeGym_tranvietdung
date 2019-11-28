package casestudy.task1.views;
import casestudy.task1.models.House;
import casestudy.task1.models.Room;
import casestudy.task1.models.Villa;

public class Main {
    public static void main(String[] args) {
        Villa villa=new Villa();
        villa.showInfor();
        System.out.println("////////////////////////////////////////////////");
        House house=new House();
        house.showInfor();
        System.out.println("////////////////////////////////////////////////");
        Room room=new Room();
        room.showInfor();
    }

}
