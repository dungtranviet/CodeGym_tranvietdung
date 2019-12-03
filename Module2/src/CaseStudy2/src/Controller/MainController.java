package Controller;

import commons.SortName;
import models.*;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainController {
    private static String pathVilla = "src/data/Villa.csv";
    private static String pathHouse = "src/data/House.csv";
    private static String pathRoom = "src/data/Room.csv";
    private static String pathCustomer = "src/data/Customer.csv";
    private static String pathBooking = "src/data/Booking.csv";
    private static Scanner scanner = new Scanner(System.in);
    private Service villa = null;

    public static void displayMainMenu() throws IOException {
        System.out.println("1.Add Service\n" +
                "2.Show Service\n" +
                "3.Add new customer\n" +
                "4.Show information customer'\n" +
                "5.Add New Booking Resort '\n" +
                "6.exit");
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
                addNewBookingResort();
                break;
            case 6:
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
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Name Not Duplicate\n" +
                "4.Back to menu\n" +
                "5.Exit");
        switch (scanner.nextInt()) {
            case 1:
                showAllVilla();
                displayMainMenu();
                break;
            case 2:
                showAllHouse();
                displayMainMenu();
                break;
            case 3:
                showAllRoom();
                displayMainMenu();
                break;
            case 4:
                showAllVillaDuplicate();
                break;
            case 5:
                showAllHouseDuplicate();
                break;
            case 6:
                showAllRoomDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ, hãy nhập lại ");
                showService();
        }
        scanner.close();
    }

    private static void showAllVilla() throws IOException {
        ArrayList<Villa> villaData = readFromVillaCsv(pathVilla);
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
    }

    private static void showAllHouse() throws IOException {
        ArrayList<House> houseData = readFromHouseCsv(pathHouse);
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
    }

    private static void showAllRoom() throws IOException {
        ArrayList<Room> roomData = readFromRoomCsv(pathRoom);
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
    }
    private static ArrayList<Villa> readFromVillaCsv(String sourceCSV) throws IOException {
        ArrayList<Villa> listVilla=new ArrayList<Villa>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                Villa villa =new Villa();
                String[] data = dataString.split(",");
                villa.convertToProperties(data);
                listVilla.add(villa);
                dataString = "";
            }
            dataString += (char) i;
        }
        reader.close();
        return listVilla;
    }
    private static ArrayList<House> readFromHouseCsv(String sourceCSV) throws IOException {
        ArrayList<House> listHouse=new ArrayList<House>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                House house =new House();
                String[] data = dataString.split(",");
                house.convertToProperties(data);
                listHouse.add(house);
                dataString = "";
            }
            dataString += (char) i;
        }
        reader.close();
        return listHouse;
    }
    private static ArrayList<Room> readFromRoomCsv(String sourceCSV) throws IOException {
        ArrayList<Room> listRoom=new ArrayList<Room>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                Room room =new Room();
                String[] data = dataString.split(",");
                room.convertToProperties(data);
                listRoom.add(room);
                dataString = "";
            }
            dataString += (char) i;
        }
        reader.close();
        return listRoom;
    }
    public static void addNewCustomer() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        Customer customer = new Customer(id);
        String data = customer.toString();
        funcWriteFileCvs(data, pathCustomer);
        displayMainMenu();
    }

    public static void showInforCustomer() throws IOException {
        ArrayList<Customer> listCustomer = readCustomerFromCSV();
        if (listCustomer.size() == 0) {
            System.out.println("không có khách hàng nào");
        }
        Collections.sort(listCustomer, new SortName());
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("khách hàng thứ " + i);
            customer.showInfor();
            System.out.println("----------------------------");
        }
    }

    public static ArrayList<Customer> readCustomerFromCSV() throws IOException {
        ArrayList<Customer> customerArray = new ArrayList<>();
        FileReader reader = new FileReader(pathCustomer);
        String stringBuffer = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                Customer customer = new Customer();
                String[] data = stringBuffer.split(",");
                customer.convertToProperties(data);
                customerArray.add(customer);
                stringBuffer = "";
            }
            stringBuffer += (char) i;
        }
        reader.close();
        return customerArray;
    }

    public static void addNewBookingResort() throws IOException {
        ArrayList<Customer> listCustomer = readCustomerFromCSV();
        System.out.println("danh sách khách hàng :");
        System.out.println("----------------------------");
        showInforCustomer();
        System.out.println("vui lòng chọn khách hàng bạn muốn thêm dịch vụ");
        Customer customer = listCustomer.get(scanner.nextInt() - 1);
        Service service = null;
        System.out.println("1.  Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n");
        switch (scanner.nextInt()) {
            case 1:
                service = bookingVilla();
                break;
            case 2:
                service = bookingHouse();
                break;
            case 3:
                service = bookingRoom();
                break;
        }
        customer.setService(service);
        writeBookingToCsv(customer);
        displayMainMenu();
    }

    private static Service bookingVilla() throws IOException {
        showAllVilla();
        System.out.println("chọn Villa booking");
        ArrayList<Villa> villaData = readFromVillaCsv(pathVilla);
        Service villa = villaData.get(scanner.nextInt() - 1);
        return villa;
    }

    private static Service bookingHouse() throws IOException {
        showAllHouse();
        System.out.println("chọn House booking");
        ArrayList<House> houseData = readFromHouseCsv(pathVilla);
        Service house = houseData.get(scanner.nextInt() - 1);
        return house;
    }

    private static Service bookingRoom() throws IOException {
        showAllRoom();
        System.out.println("chọn Room booking");
        ArrayList<Room> roomData = readFromRoomCsv(pathVilla);
        Service room = roomData.get(scanner.nextInt() - 1);
        return room;
    }

    private static String readBookingCsv() {
        return "dfds";
    }

    private static void writeBookingToCsv(Customer customer) throws IOException {
        String data = customer.toString() + customer.getService().toString();
        System.out.println(data);
        funcWriteFileCvs(data, pathBooking);
    }

    private static void showAllVillaDuplicate() throws IOException {
        TreeSet<String> tree=nameOfAllService(pathVilla);
        Iterator iterator = tree.iterator();
        System.out.println("danh sách tên villa không trùng nhau :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    private static void showAllHouseDuplicate() throws IOException {
        TreeSet<String> tree=nameOfAllService(pathHouse);
        Iterator iterator = tree.iterator();
        System.out.println("danh sách tên house không trùng nhau :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    private static void showAllRoomDuplicate() throws IOException {
        TreeSet<String> tree=nameOfAllService(pathRoom);
        Iterator iterator = tree.iterator();
        System.out.println("danh sách tên room không trùng nhau :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
    private static TreeSet<String> nameOfAllService(String pathCSV) throws IOException {
        TreeSet<String> tree = new TreeSet<String>();
        FileReader reader = new FileReader(pathCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                String[] data = dataString.split(",");
                tree.add(data[1]);
                dataString = "";
            }
            dataString += (char) i;
        }
        reader.close();
        return tree;
    }
}
