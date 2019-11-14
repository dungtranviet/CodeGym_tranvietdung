package ngon_ngu_java;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chương trình kiểm tra năm nhuận");
        System.out.print("Nhập vào năm bạn cần kiểm tra :");
        int year=scanner.nextInt();
        boolean isDivisibleBy4=year%4==0;
        boolean isLeapYear=false;
        if(isDivisibleBy4){
            boolean isDivisibleBy100=year%100==0;
            if(!isDivisibleBy100){
                isLeapYear=true;
            }
            else {
                boolean isDivisibleBy400=year%400==0;
                if(isDivisibleBy400){
                    isLeapYear=true;
                }
            }

        }
        if(isLeapYear){
            System.out.println(year+" là năm nhuận");
        }
        else {
            System.out.println(year+" không phải là năm nhuận");
        }
    }
}
