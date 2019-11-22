package giai_thuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNumber = new ArrayList<Integer>();
        System.out.println("nhập vào số phần tử của mảng");
        int n = scanner.nextInt();
        int sum_sole = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào phần tử thứ " + i);
            int number = scanner.nextInt();
            if (number % 2 == 1) {
                sum_sole += number;
            }
            arrNumber.add(number);
        }
        System.out.println("tổng các số lẻ trong mảng đã nhập là " + sum_sole);
        System.out.println("nhập vào một số nguyên k =");
        int k = scanner.nextInt();
        int index = arrNumber.indexOf(k);
        System.out.print("mảng đã nhập vào là : ");
        System.out.println(arrNumber.toString());
        System.out.println("k ở vị trí đầu tiên có chỉ số index là " + index);
        Collections.sort(arrNumber);
        System.out.println("mảng sau khi sắp xếp : " + arrNumber.toString());
        System.out.println("nhập vào số nguyên cần chèn vào mảng p= ");
        int p = scanner.nextInt();
        if (p < arrNumber.get(0)) {
            arrNumber.add(0, p);
        } else if (p >= arrNumber.get(arrNumber.size() - 1)) {
            arrNumber.add(p);
        } else {
            index = Bai11.InsertIndex(arrNumber, p);
            arrNumber.add(index, p);
        }
        System.out.println("mảng sau khi chèn: " + arrNumber.toString());
    }

    static int InsertIndex(ArrayList<Integer> arrNumber, int p) {
        int index = 0;
        for (int i = 0; i < arrNumber.size(); i++) {
            if (p >= arrNumber.get(i)) {
                index = i + 1;
            } else break;
        }
        return index;

    }

}
