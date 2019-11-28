package commons;

public class FuncValidate {
    private static final String nameExeption="^([\\p{Lu}][\\p{Ll}]*)( [\\p{Lu}][\\p{Ll}]*)*$";
    private static final String emailExeption="^[a-zA-Z][\\w*_\\.]{2,}@[a-zA-Z0-9]{2,6}\\.[a-zA-Z0-9]{2,4}$";
    private static final String genderExeption="^(?i)((male)|(female)|(unknow))$";
    private static final String idCardExeption="^\\d{9}$";
    private static final String birthdayExeption="";
    public static boolean chekName(String name){
      return name.matches(nameExeption);
    }
    public static boolean checkEmail(String email){
       return email.matches(emailExeption);
    }
    public static boolean checkGender(String gender){
        return gender.matches(genderExeption);
    }
    public static boolean checkIdCard(int idCard){
        return Integer.toString(idCard).matches(idCardExeption);
    }
    public static boolean checkBirthday(String birthday){

    }
}
