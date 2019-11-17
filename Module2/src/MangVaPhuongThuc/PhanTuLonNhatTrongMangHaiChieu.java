package MangVaPhuongThuc;

import java.util.Scanner;

public class PhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row;
        int col;
        System.out.print("Nhập vào số hàng :");
        row=scanner.nextInt();
        System.out.print("Nhập vào số cột :");
        col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.println("enter arr["+i+"]["+j+"]: ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("mảng hai chiều đã nhập");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int indexRow=0;
        int indexCol=0;
        int maxValue=arr[0][0];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (maxValue<arr[i][j]) {
                    maxValue=arr[i][j];
                    indexRow=i;
                    indexCol=j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: ");
        System.out.println(maxValue+" tại vị trí hàng "+(indexRow+1)+" cột "+(indexCol+1));
    }
}
