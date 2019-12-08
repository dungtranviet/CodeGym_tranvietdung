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
                "6.Show Information Employee '\n" +
                "7.Movie Ticket'\n" +
                "8.Search Employee Information'\n" +
                "9.exit");
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
                showInforEmployee();
                break;
            case 7:
                buyMovieTicket();
                break;
            case 8:
                searchEmployee();
                break;
            case 9:
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
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                Villa villa = new Villa();
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
        ArrayList<House> listHouse = new ArrayList<House>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                House house = new House();
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
        ArrayList<Room> listRoom = new ArrayList<Room>();
        FileReader reader = new FileReader(sourceCSV);
        String dataString = "";
        int i;
        while ((i = reader.read()) != -1) {
            if ((char) i == '\n') {
                Room room = new Room();
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
        TreeSet<String> tree = nameOfAllService(pathVilla);
        Iterator iterator = tree.iterator();
        System.out.println("danh sách tên villa không trùng nhau :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    private static void showAllHouseDuplicate() throws IOException {
        TreeSet<String> tree = nameOfAllService(pathHouse);
        Iterator iterator = tree.iterator();
        System.out.println("danh sách tên house không trùng nhau :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    private static void showAllRoomDuplicate() throws IOException {
        TreeSet<String> tree = nameOfAllService(pathRoom);
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

    private static void showInforEmployee() {
        Employee employee1 = new Employee("1", "trandung", "12/12/1994", "da nang");
        Employee employee2 = new Employee("2", "nguyen hao", "12/12/1993", "vinh");
        Employee employee3 = new Employee("3", "cong phuong", "12/12/1997", "hue");
        Employee employee4 = new Employee("4", "van binh", "12/12/1992", "nha trang");
        Employee employee5 = new Employee("5", "hai hoa", "12/12/1999", "ha noi");
        Employee employee6 = new Employee("6", "viet anh", "12/12/1991", "quang binh");
        Employee employee7 = new Employee("7", "lam binh", "12/12/1992", "quang nam");
        Employee employee8 = new Employee("8", "doan binh", "12/12/1993", "da nang");
        Employee employee9 = new Employee("9", "van hanh", "12/12/1994", "da nang");
        Employee employee10 = new Employee("10", "viet huong", "12/12/1981", "da nang");
        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee3.getId(), employee3);
        map.put(employee4.getId(), employee4);
        map.put(employee5.getId(), employee5);
        map.put(employee6.getId(), employee6);
        map.put(employee7.getId(), employee7);
        map.put(employee8.getId(), employee8);
        map.put(employee9.getId(), employee9);
        map.put(employee10.getId(), employee10);
        Set<String> set = map.keySet();
        int i = 1;
        System.out.println("thông tin nhân viên :");
        for (Object key : set) {
            System.out.println("No" + i);
            System.out.println(map.get(key).toString());
            System.out.println("----------------------------");
            i++;
        }
    }

    static void buyMovieTicket() {
        int ticketNumber = 12;
        Customer cus1 = new Customer("1", "hai", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus2 = new Customer("2", "nguyen thuy linh", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus3 = new Customer("3", "vuong bao hien", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus4 = new Customer("4", "thanh nguyen", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus5 = new Customer("5", "hanh le", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus6 = new Customer("6", "bao nguyen", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus7 = new Customer("7", "vuong thi", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus8 = new Customer("8", "tien nguyen", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus9 = new Customer("9", "dung tran", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus10 = new Customer("10", "anh tuyet", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus11 = new Customer("11", "luong nguyen", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Customer cus12 = new Customer("12", "hai ga", "28/11/1992", "male", 123456789, 983723423, "hai@gmai.com", "Vip", "da nang");
        Queue<Customer> waitingQueue = new <Customer>LinkedList();
        waitingQueue.add(cus1);
        waitingQueue.add(cus2);
        waitingQueue.add(cus3);
        waitingQueue.add(cus4);
        waitingQueue.add(cus5);
        waitingQueue.add(cus6);
        waitingQueue.add(cus7);
        waitingQueue.add(cus8);
        waitingQueue.add(cus9);
        waitingQueue.add(cus10);
        waitingQueue.add(cus11);
        waitingQueue.add(cus12);
        System.out.println("danh sach khach hang mua ve ");
        int i = 1;
        for (Customer cus : waitingQueue) {
            System.out.println("số ghế " + i + ":" + cus.getId() + ", " + cus.getName() + ", " + cus.getBirthday() + ", " + cus.getEmail() + ", " + cus.getAddress());
            i++;
        }
    }

    static void searchEmployee() {
        Employee employee1 = new Employee("1", "tran dung", "12/12/1994", "da nang");
        Employee employee2 = new Employee("2", "tran dung", "12/12/1993", "vinh");
        Employee employee3 = new Employee("3", "cong phuong", "12/12/1997", "hue");
        Employee employee4 = new Employee("4", "van binh", "12/12/1992", "nha trang");
        Employee employee5 = new Employee("5", "cong phuong", "12/12/1999", "ha noi");
        Employee employee6 = new Employee("6", "viet anh", "12/12/1991", "quang binh");
        Employee employee7 = new Employee("7", "cong phuong", "12/12/1992", "quang nam");
        Employee employee8 = new Employee("8", "doan binh", "12/12/1993", "da nang");
        Employee employee9 = new Employee("9", "van hanh", "12/12/1994", "da nang");
        Employee employee10 = new Employee("10", "viet huong", "12/12/1981", "da nang");
        FileCabinet fileCabinet = new FileCabinet();
        fileCabinet.add(employee1);
        fileCabinet.add(employee2);
        fileCabinet.add(employee3);
        fileCabinet.add(employee4);
        fileCabinet.add(employee5);
        fileCabinet.add(employee6);
        fileCabinet.add(employee7);
        fileCabinet.add(employee8);
        fileCabinet.add(employee9);
        fileCabinet.add(employee10);
        System.out.println("nhập tên nhân viên bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        ArrayList<Employee> employees = fileCabinet.search(name);
        if(employees.size()==0){
            System.out.println("không nhân viên nào được tìm thấy");
        }
        else {
            System.out.println(employees.size()+" nhân viên được tìm thấy");
            System.out.println("thông tin của nhân viên");
            for (Employee employee:employees) {
                System.out.println(
                        "id: "+employee.getId()+ "\n" +
                                "name: " + employee.getName() + "\n" +
                                "birthday: " + employee.getBirthday() + "\n" +
                                "address : " + employee.getAddress()
                );
                System.out.println("----------------------------");
            }
        }
    }
}
