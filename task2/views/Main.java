package casestudy.task2.views;
import casestudy.task2.models.House;
import casestudy.task2.models.Room;
import casestudy.task2.models.Villa;

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
