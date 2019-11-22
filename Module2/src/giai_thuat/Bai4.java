package giai_thuat;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int n=scanner.nextInt();
        double result=15;
        int amDuong=1;
        int giaiThua_i=1;
        for(int i=1;i<=n;i++){
            amDuong*=-1;
            giaiThua_i*=i;
            result+= (double)amDuong*1/giaiThua_i;
        }
        System.out.println("S=15-1+1/2!-1/3!+...+(-1)^n*1/n! ="+result);
    }
}
