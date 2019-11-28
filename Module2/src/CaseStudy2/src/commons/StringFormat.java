package commons;

public class StringFormat {
    public static String get(String str) {
        String stringBuffer = "";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            stringBuffer = "";
            String element = arr[i].trim();
            element = element.toLowerCase();
            stringBuffer += Character.toUpperCase(element.charAt(0));
            stringBuffer += element.substring(1);
            result += stringBuffer + " ";
        }
        result = result.trim();
        return result;
    }
}
