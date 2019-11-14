package ngon_ngu_java;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("phương trình có dạng ax + b=0");
        Scanner scanner=new Scanner(System.in);
        System.out.print("a= ");
        double a=scanner.nextDouble();
        System.out.print("b= ");
        double b=scanner.nextDouble();
        if(a!=0){
            double ketqua=-b/a;
            System.out.print("phương trình có nghiệm là :"+ketqua);
        }
        else {
            if(b==0){
                System.out.print("phương trình vô số nghiệm");
            }
            else {
                System.out.print("phương trình vô nghiệm");
            }
        }
    }
}
