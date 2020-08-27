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
        listCustomer.add(new Customer("Nguyen Huu Quang","27/12/1996","Da Nang"));
        listCustomer.add(new Customer("Ho Thi Quynh Mai","20/07/1995","Da Nang"));
        listCustomer.add(new Customer("Hoang Kim Van Chuong","27/12/1989","Quang Tri"));
        listCustomer.add(new Customer("Le Nhat","27/12/2000","Quang Tri"));
        listCustomer.add(new Customer("Nguyen Tien Hai","27/12/2001","Ha Tinh"));
        listCustomer.add(new Customer("Pham Huu Hien","27/12/1996","Phu Yen"));
        listCustomer.add(new Customer("Tu Sy Tung","27/12/1995","Hue"));
        listCustomer.add(new Customer("Phan Quoc Khanh","27/12/1993","Ha Tinh"));

        request.setAttribute("listCustomer",listCustomer);
        request.getRequestDispatcher("list-customer/DisplayCustomer.jsp").forward(request,response);
    }
}
