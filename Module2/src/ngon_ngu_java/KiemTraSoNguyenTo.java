package ngon_ngu_java;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình kiểm tra số nguyên tố");
        System.out.print("nhập số cần kiểm tra :");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("%d không phải là số nguyên tố", number);
        } else {
            int i = 2;
            boolean check = true;
            double end = Math.sqrt(number);
            while (i <= end) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("%d là số nguyên tố",number);
            }
            else {
                System.out.printf("%d là không phải là số nguyên tố",number);
            }
        }
    }
}
