package MangVaPhuongThuc;

import java.util.Scanner;

public class TinhTongCuaDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int sum=0;
        System.out.println("Nhập vào kích thước của mảng ");
        size=scanner.nextInt();
        int [][]arr=new int[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++) {
                System.out.print("Nhập vào arr["+i+"]["+j+"] :");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("\n Mảng vừa nhập :");
        for (int []rowValue:arr) {
            for (int colValue:rowValue) {
                System.out.print(colValue+"\t");
            }
            System.out.print("\n");
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        System.out.println("tổng các phần tử trên đường chéo chính là : "+sum);
    }
}
