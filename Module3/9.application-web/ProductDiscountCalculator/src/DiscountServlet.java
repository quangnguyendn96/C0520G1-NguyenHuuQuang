import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float percent = Float.parseFloat(request.getParameter("percent"));
        float price = Float.parseFloat(request.getParameter("price"));
        String des = request.getParameter("description");
        float discountPrice = percent/100 * price;
        float priceAfterDiscount = price - discountPrice;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Description: " + des + "</h1>");
        writer.println("<h1>Discount Amount: " + discountPrice+ "VND" + "</h1>");
        writer.println("<h1>Price After Discount: " + priceAfterDiscount+ "VND"+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
