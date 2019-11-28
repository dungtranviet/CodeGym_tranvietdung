package Views;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="^([\\p{Lu}][\\p{Ll}]*)( [\\p{Lu}][\\p{Ll}]*)*$";
        while (true){
            System.out.println("nhập chuỗi cần kiểm tra");
            String test= scanner.nextLine();
            System.out.println("chuỗi đã nhập mathches với regex?"+test.matches(regex));
        }
    }
}
