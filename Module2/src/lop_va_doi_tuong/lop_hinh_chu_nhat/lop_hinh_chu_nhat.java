package lop_va_doi_tuong.lop_hinh_chu_nhat;

import java.util.Scanner;

public class lop_hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width rectangle :");
        double width = scanner.nextDouble();
        System.out.println("Enter height rectangle :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle :"+rectangle.display());
        System.out.println("Area rectangle :"+rectangle.getArea());
        System.out.println("Perimeter rectangle :"+rectangle.getPerimeter());
    }
}
