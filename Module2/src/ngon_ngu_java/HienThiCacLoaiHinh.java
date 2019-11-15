package ngon_ngu_java;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        in hình chữ nhật
         */
        for(int row=0;row<3;row++){
            for(int col=0;col<7;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("");
        /*
        in hình tam giác thứ nhất
         */
        for (int row=1;row<=5;row++){
            for (int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("");
        /*
        in hình tam giác thứ 2
         */
        for (int row=1;row<=5;row++){
            for (int col=5;col>=row;col--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
