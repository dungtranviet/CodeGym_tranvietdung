package giai_thuat;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào một chuỗi ký tự : ");
        String str=scanner.nextLine();
        //task 1:
        char[] charArray=str.toCharArray();
        for (int i=0;i<charArray.length/2;i++){
            char temp;
            temp=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]=temp;
        }
        String str1=new String(charArray);
        System.out.println("chuỗi sau khi đảo ngược là : "+str1);
        //task 2:
        String str2=str.toUpperCase();
        System.out.println("chuỗi sau khi chuyển sang viết hoa là : "+str2);
        //task 3:
        String str3=str.toLowerCase();
        System.out.println("chuỗi sau khi chuyển sang viết thường là : "+str3);
        //task3 :
        charArray=str.toCharArray();
        for (int i=0;i<charArray.length;i++){
            char a=charArray[i];
            if(Character.isLowerCase(a)){
                a=Character.toUpperCase(a);
            }
            else {
                a=Character.toLowerCase(a);
            }
            charArray[i]=a;
        }
        String str4=new String(charArray);
        System.out.println("Chuỗi sau khi chuyển viết hoa sang viết thường và ngược lại là: "+str4);
    }
}
