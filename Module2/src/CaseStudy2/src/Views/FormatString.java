package Views;

import java.lang.reflect.Array;

public class FormatString {
    public static void main(String[] args) {
        String str1="traN vieT dunG ";
        String str2="";
        String []arr=str1.split(" ");
        String result="";
        for (int i=0;i<arr.length;i++) {
            str2="";
            String element=arr[i].trim();
            element=element.toLowerCase();
            str2+=Character.toUpperCase(element.charAt(0));
            str2+=element.substring(1);
            result+=str2+" ";
        }
        result=result.trim();
        System.out.println(result);
    }
}