package commons;

import java.util.Calendar;
import java.util.Scanner;

public class FuncValidate {
    private static final String nameExeption = "^([\\p{Lu}][\\p{Ll}]*)( [\\p{Lu}][\\p{Ll}]*)*$";
    private static final String emailExeption = "^[a-zA-Z][\\w*_\\.]{2,}@[a-zA-Z0-9]{2,6}\\.[a-zA-Z0-9]{2,4}$";
    private static final String genderExeption = "^(?i)((male)|(female)|(unknow))$";
    private static final String idCardExeption = "^\\d{9}$";
    private static final String birthdayExeption = "^([0][1-9]|[1-2][0-9]|[3][0-1])\\/([0][1-9]|[1][0-2])\\/(\\d{4})$";

    public static boolean chekName(String name) {
        return name.matches(nameExeption);
    }

    public static boolean checkEmail(String email) {
        return email.matches(emailExeption);
    }

    public static boolean checkGender(String gender) {
        return gender.matches(genderExeption);
    }

    public static boolean checkIdCard(int idCard) {
        return Integer.toString(idCard).matches(idCardExeption);
    }

    public static boolean checkBirthday(String birthday) {
       if(birthday.matches(birthdayExeption)) {
           String yearOfBirthday=birthday.substring(6);
           Calendar cal=Calendar.getInstance();
           int age=cal.get(Calendar.YEAR)-Integer.parseInt(yearOfBirthday);
           if(age>18){
               return true;
           }
          return false;
       }
       else return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra ");
        String test=sc.nextLine();
        System.out.println(checkBirthday(test));
    }
}
