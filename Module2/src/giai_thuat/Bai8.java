package giai_thuat;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào a :");
        int a=scanner.nextInt();
        System.out.println("nhập vào b :");
        int b=scanner.nextInt();
        System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là "+Bai8.UCLN(a,b));
        System.out.println("Bội chung nhỏ nhất của "+a+" và "+b+" là "+Bai8.BCNN(a,b));
    }
    static int UCLN(int a, int b){
            if((a==0)||(b==0)){
                return a+b;
            }
            while (a!=b){
                if(a>b){
                    a-=b;
                }
                else {
                    b-=a;
                }
            }
        return a;
    }
    static int BCNN(int a,int b){
        if((a==0)&&(b==0)){
            return 0;
        }
        return a*b/UCLN(a,b);
    }
}
