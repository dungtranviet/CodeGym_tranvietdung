package giai_thuat;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên m :");
        String s = scanner.nextLine();
        char[] charArray=s.toCharArray();
        int tongS=0;
        int tichP=1;
        for (int i=0;i<charArray.length;i++) {
            tongS+=charArray[i]-'0';
            tichP*=charArray[i]-'0';
        }
        System.out.println("tổng các chữ số trong số "+s+" là :"+tongS);
        System.out.println("tích các chữ số trong số "+s+" là :"+tichP);
    }
}
