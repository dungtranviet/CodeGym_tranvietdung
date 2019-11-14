package ngon_ngu_java;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn muốn đếm số ngày");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 ngày hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "30 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth="31 ngày";
                break;
            default:daysInMonth="";
        }
        if(daysInMonth!=""){
            System.out.printf("số ngày trong tháng '%d' là %s",month,daysInMonth);
        }
        else {
            System.out.println("đầu vào không hợp lệ");
        }
    }
}
