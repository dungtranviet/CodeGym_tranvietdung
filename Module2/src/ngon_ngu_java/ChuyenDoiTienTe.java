package ngon_ngu_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float rate=23000;
        System.out.println("Nhập số tiền USD :");
        float usd=scanner.nextFloat();
        float vnd=usd*rate;
        System.out.println("Số tiền chuyển qua VND:"+vnd);
    }
}
