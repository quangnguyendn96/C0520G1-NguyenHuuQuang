import models.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/student")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = new ArrayList<>();

        listCustomer.add(new Customer("Nguyen Huu Quang","27/12/1996","Da Nang","<img src=\"image/Gai-xinh-mac-vay-ngan-goi-cam-4.jpg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Ho Thi Quynh Mai","20/07/1995","Da Nang","<img src=\"image/download.jpeg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Hoang Kim Van Chuong","27/12/1989","Quang Tri","<img src=\"image/3.jpg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Le Nhat","27/12/2000","Quang Tri","<img src=\"image/download.jpeg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Nguyen Tien Hai","27/12/2001","Ha Tinh","<img src=\"image/3.jpg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Pham Huu Hien","27/12/1996","Phu Yen","<img src=\"image/Gai-xinh-mac-vay-ngan-goi-cam-4.jpg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Tu Sy Tung","27/12/1995","Hue","<img src=\"image/download.jpeg\" height='50px' width=\"50px\">"));
        listCustomer.add(new Customer("Phan Quoc Khanh","27/12/1993","Ha Tinh","<img src=\"image/3.jpg\" height='50px' width=\"50px\">"));

        request.setAttribute("listCustomer",listCustomer);
        request.getRequestDispatcher("list-customer/DisplayCustomer.jsp").forward(request,response);
    }
}
