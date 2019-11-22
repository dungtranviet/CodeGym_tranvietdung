package giai_thuat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự");
        String str = scanner.nextLine();
        str = str.trim();
        System.out.println("những từ đã nhập vào là :");
        int spaceIndex = str.indexOf(" ");
        ArrayList<String> strList = new ArrayList<String>();
        while (spaceIndex != -1) {
            String element = str.substring(0, spaceIndex);
            strList.add(element);
            System.out.println(element);
            str = str.substring(spaceIndex + 1);
            str = str.trim();
            spaceIndex = str.indexOf(" ");
        }
        strList.add(str);
        System.out.println(str);
        Collections.sort(strList);
        System.out.println("so tu trong chuoi :" + strList.size());
        System.out.println("tần số xuất hiện của từ trong chuỗi ");
        int tanSo_f = 0;
        String strInCouter = "";
        System.out.println("mảng các từ sau khi sắp xếp là :");
        System.out.println(strList.toString());
        for (String element : strList) {
            if (!strInCouter.equals(element)) {
                if (tanSo_f != 0) {
                    System.out.println("tần số của từ " + "'" + strInCouter + "'" + " là " + tanSo_f);
                }
                strInCouter = element;
                tanSo_f = 1;
            } else {
                tanSo_f++;
            }
        }
        if (tanSo_f != 0) {
            System.out.println("tần số của từ " + "'" + strInCouter + "'" + " là " + tanSo_f);
        }
    }
}
