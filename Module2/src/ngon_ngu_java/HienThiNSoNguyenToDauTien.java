package ngon_ngu_java;

import java.util.Scanner;

public class HienThiNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số số nguyên tố cần hiển thị:");
        int numbers = scanner.nextInt();
        int counter = 1;
        int N = 3;
        String result = numbers + " số nguyên tố đầu tiên là :2, ";
        while (counter < numbers) {
            double endNumber = Math.sqrt(N);
            boolean isPrime = true;
            for (int i = 3; i < endNumber; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result += N + ", ";
                counter++;
            }
            N += 2;
        }
        if (numbers == 0) {
            result = "";
        }
        System.out.println(result);
    }
}
