import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Caculator", urlPatterns = "/caculator")
public class CaculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount"));
        float discount= (float) (price*discount_percent*0.01);
        float total =price-discount;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>product description: "+description);
        writer.println("<h1>price: "+price);
        writer.println("<h1>discount percent :"+discount_percent);
        writer.println("<h1>discount: "+discount);
        writer.println("<h1>total "+total);
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
