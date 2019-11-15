package ngon_ngu_java;

import java.util.Scanner;

public class ChiSoMBI {
    public static void main(String[] args) {
        double weigh,height,bmi;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your Weigh:(in kilogram)");
        weigh=scanner.nextDouble();
        System.out.print("enter your Height:(in meter)");
        height=scanner.nextDouble();
        bmi=weigh/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpreation\n");
        if(bmi<18){
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        }
        else if(bmi<25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal");
        }
        else if(bmi<30.0){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }
        else System.out.printf("-20.2s%s",bmi,"Obese");
    }
}
