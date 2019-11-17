package MangVaPhuongThuc;

import java.util.Scanner;

public class TinhTongCacSoTrongMotCot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row;
        int col;
        int colIndex;
        System.out.print("Nhập vào số hàng :");
        row=scanner.nextInt();
        System.out.print("\nNhập vào số cột :");
        col=scanner.nextInt();
        System.out.println("\nNhập vào các phần tử của mảng: ");
        int [][]arr=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.print("arr["+i+"]["+j+"]: ");
                arr[i][j]=scanner.nextInt() ;
                System.out.print("\n");
            }
        }
        System.out.println("Mảng đã nhập vào :");
        for (int []rowVal:arr){
            for (int colVal:rowVal) {
                System.out.print(colVal+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Nhập vào số thứ tự của một cột (tính từ 0)");
        colIndex=scanner.nextInt();
        int sum=Sum(arr,colIndex);
        if (sum==-1) {
            System.out.println("Số thứ tự bạn vừa nhập không hợp lệ ");
        }
        else {
            System.out.println("tổng các phần tử tại cột "+colIndex+" là : "+sum);
        }

    }
    public static int Sum(int [][]arr,int colIndex) {
        boolean valid=0<=colIndex&&colIndex<arr[0].length;
        int sum=0;
        if (valid) {
            for (int i=0;i<arr.length;i++) {
                sum+=arr[i][colIndex];
            }
        }
        else sum=-1;
        return sum;
    }
}
