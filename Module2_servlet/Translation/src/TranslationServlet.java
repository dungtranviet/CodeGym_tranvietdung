import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet",urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book","quyển sách");
        dictionary.put("computer","máy tính");
        PrintWriter writer=response.getWriter();
        String search=request.getParameter("txtSearch");
        String result=dictionary.get(search);
        writer.println("<html>");
        if (response!=null) {
            writer.println("Word : "+search);
            writer.println("<br>Result: "+result);
        }
        else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book","quyển sách");
        dictionary.put("computer","máy tính");
        PrintWriter writer=response.getWriter();
        String search=request.getParameter("txtSearch");
        String result=dictionary.get(search);
        writer.println("<html>");
        if (response!=null) {
            writer.println("Word : "+search);
            writer.println("<br>Result: "+result);
        }
        else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
