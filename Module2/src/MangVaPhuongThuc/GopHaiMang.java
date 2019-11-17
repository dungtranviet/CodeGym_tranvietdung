package MangVaPhuongThuc;

import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr1=new int[3];
        int []arr2=new int[5];
        int []arr3=new int[(arr1.length+arr2.length)];
        System.out.println("nhập vào các phần tử của mảng thứ nhất :");
        for (int i=0;i<arr1.length;i++) {
            System.out.print("arr1["+i+"]: ");
            arr1[i]=scanner.nextInt();
            System.out.print("\n");
        }
        System.out.println("nhập vào các phần tử của mảng thứ hai :");
        for (int i=0;i<arr2.length;i++) {
            System.out.print("arr2["+i+"]: ");
            arr2[i]=scanner.nextInt();
            System.out.print("\n");
        }
        System.out.println("các phần tử của mảng đã nhập :");
        System.out.print("mảng thứ nhất: ");
        for (int element:arr1) {
            System.out.print(element+", ");
        }
        System.out.print("\nmảng thứ hai: ");
        for (int element:arr2) {
            System.out.print(element+", ");
        }
        int index=0;
        for (int element:arr1) {
            arr3[index]=element;
            index++;
        }
        for (int element:arr2) {
            arr3[index]=element;
            index++;
        }
        System.out.print("\nmảng gộp từ hai mảng trên là : ");
        for (int element:arr3) {
            System.out.print(element+", ");
        }
    }
}
