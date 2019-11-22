package giai_thuat;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int n=scanner.nextInt();
        int giaiThua_i=1;
        double result=1;
        for (int i=3;i<=(2*n-1);) {
            giaiThua_i*=i*(i-1);
            result+=(double)1/giaiThua_i;
            i+=2;
        }
        System.out.println("ket qua cua biểu thức S=1+1/3!+1/5!+..+1/(2n-1)! với n="+n+" là :"+result);

    }
}
