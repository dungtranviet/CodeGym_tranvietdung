package giai_thuat;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số dòng m: ");
        int m=scanner.nextInt();
        System.out.println("nhập vào số cột n : ");
        int n=scanner.nextInt();
        int [][]arrNumber=new int[m][n];
        int tichBoiSoCua3=1;
        ArrayList<Integer>maxNumber=new ArrayList<>();
        boolean isFisrtElementInRow;
        for (int i=0;i<m;i++) {
            isFisrtElementInRow=true;
            for (int j=0;j<n;j++) {
                System.out.println("nhập vào phần tử mảng ["+i+"]["+j+"] :");
                int element=scanner.nextInt();
                arrNumber[i][j]=element;
                if(i==0&&(element%3==0)){
                    tichBoiSoCua3*=element;
                }
                if (isFisrtElementInRow) {
                    maxNumber.add(element);
                    isFisrtElementInRow=false;
                }
                else {
                    if (maxNumber.get(i)<element) {
                        maxNumber.set(i,element);
                    }
                }
            }
        }
        System.out.print("tích của các bội số của 3 trên dòng đầu tiên : ");
        System.out.println(tichBoiSoCua3);
        System.out.println("các phần tử lớn nhất trên các hàng :");
        for (int i=0;i<maxNumber.size();i++) {
            System.out.println("hàng thứ "+i+" là : "+maxNumber.get(i));
        }
        System.out.println("các phần tử trên mảng X[i](tập hợp các phần tử lớn nhất trên các hàng):");
        System.out.println(maxNumber.toString());
        System.out.println("các phần tử của mảng X[i] sau khi xóa phần tử đầu tiên :");
        maxNumber.remove(0);
        System.out.println(maxNumber.toString());
    }
}
