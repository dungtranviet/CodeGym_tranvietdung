package Controller;

import models.*;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static String pathVilla = "src/data/Villa.csv";
    private static String pathHouse = "src/data/House.csv";
    private static String pathRoom = "src/data/Room.csv";
    private static String pathCustomer = "src/data/Customer.csv";
    private static Scanner scanner = new Scanner(System.in);
    private Service service = null;

    //static String roomCSV = "../task2/data/Room.csv";
    public static void displayMainMenu() throws IOException {
        System.out.println("1.Add Service\n" +
                "2.Show Service\n" +
                "3.Add new customer\n" +
                "4.Show information customer'\n" +
                "5.exit");
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
                addNewCustomer();
                break;
            case 4:
                showInforCustomer();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                displayMainMenu();
        }
        scanner.close();
    }

    private static void addNewService() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                "1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back To Menu\n" +
                "5.Exit\n");
        switch (scanner.nextInt()) {
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
                displayMainMenu();
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                addNewService();
        }
        scanner.close();
    }

    private static void addNewVilla() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Villa villa = new Villa(id);
        villa.addNewService("Villa");
        String data = villa.toString();
        funcWriteFileCvs(data, pathVilla);
        displayMainMenu();
    }

    private static void addNewHouse() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        House house = new House(id);
        house.addNewService("House");
        String data = house.toString();
        funcWriteFileCvs(data, pathHouse);
        displayMainMenu();
    }

    private static void addNewRoom() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Room room = new Room(id);
        room.addNewService("Room");
        String data = room.toString();
        funcWriteFileCvs(data, pathRoom);
        displayMainMenu();
    }

    private static void funcWriteFileCvs(String data, String source) throws IOException {
        FileWriter writer = new FileWriter(source, true);
        writer.append(data);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    private static void showService() throws IOException {
        System.out.println(" " +
                "1.Show All Villa\n" +
                "2.Show All House\n" +
                "3.Show All Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        switch (scanner.nextInt()) {
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

    private static void showAllVilla() throws IOException {
        ArrayList<Service> villaData = readCvsFile("Villa", pathVilla);
        System.out.println("/////////Thông tin của các Villa ////////////");
        if (villaData.size() == 0) {
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : villaData) {
            System.out.println("thông tin villa thứ " + couter);
            ((Villa) element).showInfor();
            couter++;
            System.out.println("----------------------------");
        }
        displayMainMenu();
    }

    private static void showAllHouse() throws IOException {
        ArrayList<Service> houseData = readCvsFile("House", pathHouse);
        System.out.println("/////////Thông tin của các House ////////////");
        if (houseData.size() == 0) {
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : houseData) {
            System.out.println("thông tin house thứ " + couter);
            ((House) element).showInfor();
            couter++;
            System.out.println("----------------------------");
        }
        displayMainMenu();
    }

    private static void showAllRoom() throws IOException {
        ArrayList<Service> roomData = readCvsFile("Room", pathRoom);
        System.out.println("/////////Thông tin của các Room ////////////");
        if (roomData.size() == 0) {
            System.out.println("không có dịch vụ nào");
        }
        int couter = 1;
        for (Service element : roomData) {
            System.out.println("thông tin Room thứ " + couter);
            ((Room) element).showInfor();
            couter++;
            System.out.println("----------------------------");
        }
        displayMainMenu();
    }

    private static ArrayList<Service> readCvsFile(String typeService, String sourceCSV) throws IOException {
        ArrayList<Service> serviceDataArray = new ArrayList<>();
        FileReader reader = new FileReader(sourceCSV);
        int i;
        Service service = null;
        switch (typeService) {
            case "Villa":
                service = new Villa();
                break;
            case "House":
                service = new House();
                break;
            case "Room":
                service = new Room();
                break;
        }
        String dataString = "";
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                String[] data = dataString.split(",");
                service.convertToProperties(data);
                serviceDataArray.add(service);
                dataString = "";
            }
            dataString += (char) i;
        }
        reader.close();
        return serviceDataArray;
    }

    public static void addNewCustomer() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Customer customer=new Customer(id);
        String data=customer.toString();
        funcWriteFileCvs(data,pathCustomer);
    }

    public static void showInforCustomer() throws IOException {
        ArrayList<Customer> customerArray = readCustomerCSV();
        if(customerArray.size()==0){
            System.out.println("không có dịch vụ nào ");
        }
        int couter=1;
        for (Customer customer:customerArray) {
            System.out.println("thông tin khách hàng thứ "+couter);
            customer.showInfor();
            System.out.println("----------------------------");
            couter++;
        }
    }
    public static ArrayList<Customer> readCustomerCSV() throws IOException {
        ArrayList<Customer> customerArray = new ArrayList<>();
        FileReader reader = new FileReader(pathCustomer);
        String stringBuffer = "";
        int i;
        Customer customer = new Customer();
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                String[] data = stringBuffer.split(",");
                System.out.println(stringBuffer);
                System.out.println(data[0]);
                customer.convertToProperties(data);
                customerArray.add(customer);
                stringBuffer = "";
            }
            stringBuffer += (char) i;
        }
        reader.close();
        return customerArray;
    }
}
