package casestudy.task2.controller;

import casestudy.task2.models.House;
import casestudy.task2.models.Room;
import casestudy.task2.models.Service;
import casestudy.task2.models.Villa;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    static String villaCSV = "src/casestudy/task2/data/Villa.csv";
    static String houseCSV = "src/casestudy/task2/data/House.csv";
    static String roomCSV = "src/casestudy/task2/data/Room.csv";
    //static String roomCSV = "../task2/data/Room.csv";

    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }

    static void displayMainMenu() throws IOException {
        System.out.println("1.Add Service");
        System.out.println("2.Show Service");
        System.out.println("3.exit");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                addNewService();
        }
        scanner.close();
    }

    static void addNewService() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back To Menu\n" +
                "5.Exit\n");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                addNewService();
        }
        scanner.close();
    }

    static void addNewVilla() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Villa villa = new Villa(id);
        villa.addNewService("Villa");
        String data = villa.toString();
        funcWriteFileCvs(data, villaCSV);
        displayMainMenu();
    }

    static void addNewHouse() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        House house = new House(id);
        house.addNewService("House");
        String data = house.toString();
        funcWriteFileCvs(data, houseCSV);
        displayMainMenu();
    }

    static void addNewRoom() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Room room = new Room(id);
        room.addNewService("Room");
        String data = room.toString();
        funcWriteFileCvs(data, roomCSV);
        displayMainMenu();
    }

    static void funcWriteFileCvs(String data, String source) throws IOException {
        System.out.println(source);
        FileWriter writer = new FileWriter(source, true);
        writer.append(data);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    static void showService() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1.Show All Villa\n" +
                "2.Show All House\n" +
                "3.Show All Room\n" +
                "4.Back to menu\n" +
                "5.Exit");

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                showService();
        }
        scanner.close();
    }

    static void showAllVilla() throws IOException {
        ArrayList<Service> villaData = readCvsFile("Villa",villaCSV);
        System.out.println("/////////Thông tin của các Villa ////////////");
        if(villaData.size()==0){
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : villaData) {
            System.out.println("thông tin villa thứ " + couter);
            ((Villa) element).showInfor();
            couter++;
            System.out.println("/////////////////////////////////////////////////////");
        }
    }

    static void showAllHouse() throws IOException {
        ArrayList<Service> houseData = readCvsFile("Villa",houseCSV);
        System.out.println("/////////Thông tin của các House ////////////");
        if(houseData.size()==0){
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : houseData) {
            System.out.println("thông tin house thứ " + couter);
            ((House) element).showInfor();
            couter++;
            System.out.println("/////////////////////////////////////////////////////");
        }
    }

    static void showAllRoom() throws IOException {
        ArrayList<Service> roomData = readCvsFile("Room",roomCSV);
        System.out.println("/////////Thông tin của các Room ////////////");
        if(roomData.size()==0){
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : roomData) {
            System.out.println("thông tin Room thứ " + couter);
            ((Room) element).showInfor();
            couter++;
            System.out.println("/////////////////////////////////////////////////////");
        }
    }

    static ArrayList<Service> readCvsFile(String typeService, String source) throws IOException {
        ArrayList<Service> serviceDataArray=new ArrayList<>();
        FileReader reader = new FileReader(source);
        int i;
        Service service = null;
        switch (typeService) {
            case "Villa":service=new Villa();
                break;
            case "House":service=new House();
                break;
            case "Room":service=new Room();
                break;
        }
        String dataElement = "";
        int index = 1;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                serviceDataArray.add(service);
                dataElement = "";
            } else if ((char) i == ',') {
                service.convertToProperties(dataElement, index);
                dataElement = "";
                index++;
            } else {
                dataElement += (char) i;
            }
        }
        reader.close();
        return serviceDataArray;
    }
}
