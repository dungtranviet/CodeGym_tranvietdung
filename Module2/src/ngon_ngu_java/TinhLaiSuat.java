package ngon_ngu_java;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter mount:");
        double money=scanner.nextDouble();
        System.out.print("Time (month): ");
        int time=scanner.nextInt();
        System.out.print("Interset rate :");
        double interset_rate=scanner.nextDouble();
        double total_interset=money*time*(interset_rate/100)/12;
        System.out.println("total interset is "+total_interset);
    }
}
