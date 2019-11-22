package giai_thuat;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int n=scanner.nextInt();
        double result=0;
        for (int i=1;i<=n;i++) {
            result += (double) 1/i;
        }
        System.out.println("S=1+1/2+1/3+...+1/n= "+result);
    }
}
