package ngon_ngu_java;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a :");
        a=scanner.nextInt();
        System.out.println("Enter b :");
        b=scanner.nextInt();
        if(a==0||b==0){
            System.out.println("No greatest common factor ");
        }
        else {
            while (a!=b){
                if(a>b){
                    a=a-b;
                }
                else {
                    b=b-a;
                }
            }
        }
        System.out.println("greatest common factor is :" +a);
    }
}
