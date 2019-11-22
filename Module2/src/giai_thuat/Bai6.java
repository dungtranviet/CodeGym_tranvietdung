package giai_thuat;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int n = scanner.nextInt();
        int result = 1;
        boolean isChan = (n % 2 == 0);
        int i;
        if (isChan) {
            i = 2;
        } else {
            i = 1;
        }
        for (; i <= n; ) {
            result *= i;
            i += 2;
        }
        System.out.println("n!! = "+result);
    }
}
