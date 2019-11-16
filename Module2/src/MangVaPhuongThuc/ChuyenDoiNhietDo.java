package MangVaPhuongThuc;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        System.out.println("menu");
        System.out.println("1.chuyển từ độ C sang F");
        System.out.println("2.chuyển từ độ F sang C");
        System.out.println("3.exit");
        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhập vào nhiệt độ C  :");
                doC = scanner.nextDouble();
                System.out.println("Độ F là :" + CtoF(doC));
                break;
            case 2:
                System.out.println("Nhập vào nhiệt độ F :");
                doF=scanner.nextDouble();
                System.out.println("Độ C là :"+FtoC(doF));
                break;
            case 3:
                System.exit(0);
        }
    }

    public static double CtoF(double doC) {
        double result = (9.0 / 5) * doC + 32;
        return result;
    }
    public static double FtoC(double doF) {
        double result = (5.0 / 9) * (doF - 32);
        return result;
    }
}