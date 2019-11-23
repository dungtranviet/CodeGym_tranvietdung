package casestudy.views;

import casestudy.models.House;
import casestudy.models.Room;
import casestudy.models.Villa;

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
