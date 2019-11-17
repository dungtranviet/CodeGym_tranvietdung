package MangVaPhuongThuc;

import java.util.Scanner;

public class ThucHanh_DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size :");
        int size;
        int count=0;
        do {
            size=scanner.nextInt();
            if (size>30) {
                System.out.println("size does not exceed 30");
            }
        } while (size>30);
        int []arrMark=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter a mark for student "+(i+1)+" : ");
            arrMark[i]=scanner.nextInt();
        }
        System.out.println("List of mark :");
        for (int i=0;i<size;i++) {
            System.out.print(arrMark[i]+"\t");
            if (arrMark[i]>=5&&arrMark[i]<=10) {
                count++;
            }
        }
        System.out.println("\nthe number student passing the exam is : "+count);
    }
}
