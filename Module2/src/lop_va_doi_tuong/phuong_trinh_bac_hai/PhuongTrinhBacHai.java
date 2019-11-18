package lop_va_doi_tuong.phuong_trinh_bac_hai;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a =");
        a = scanner.nextInt();
        System.out.println("Enter b =");
        b = scanner.nextInt();
        System.out.println("Enter c =");
        c = scanner.nextInt();
        QuadraticEquation func=new QuadraticEquation(a,b,c);
        double delta=func.getDelta();
        if(delta>0){
            System.out.println("Equation has two roots:"+func.getRoot1()+" and "+func.getRoot2());
        }
        else {
            if (delta==0) {
                System.out.println("Equation has one root :"+func.getRoot1());
            }
            else {
                System.out.println(func.noRoot());
            }
        }
    }
}
