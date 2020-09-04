package controller;

import bo.FuramaBO;
import bo.FuramaBOImp;
import model.Customer;
import model.Employee;
import model.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "contractServlet", urlPatterns = {"", "/home"})
public class FuramaServlet extends HttpServlet {
    FuramaBO furamaBO = new FuramaBOImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createCustomer":
                createCustomer(response, request);
                break;
            case "search":
                break;
            default:
                showHome(response, request);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "customer":
                displayCustomer(response, request);
                break;
            case "service":
                displayService(response, request);
                break;
            case "employee":
                displayEmployee(response, request);
                break;
            case "createCustomer":
                showCreateCustomer(response, request);
                break;
//            case "contract":
//                showCreateCustomer(response, request);
//                break;
            default:
                showHome(response, request);
        }
    }

    void showHome(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/home.jsp").forward(request, response);
    }

    void showCreateCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/createCustomer.jsp").forward(request, response);
    }

    void createCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {

        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        int idTypeCustomer = Integer.parseInt(request.getParameter("idTypeCustomer"));
        String nameCustomer = request.getParameter("nameCustomer");
        String dayOfBirthCustomer = request.getParameter("dayOfBirthCustomer");
        int genderCustomer = Integer.parseInt(request.getParameter("genderCustomer"));
        String identityCard = request.getParameter("identityCard");
        String phoneCustomer = request.getParameter("phoneCustomer");
        String emailCustomer = request.getParameter("emailCustomer");
        String addCustomer = request.getParameter("addCustomer");
        Customer customer = new Customer(idCustomer, idTypeCustomer, nameCustomer, dayOfBirthCustomer,
                genderCustomer, identityCard, phoneCustomer, emailCustomer, addCustomer);
        furamaBO.insertNewCustomer(customer);
        request.setAttribute("create","Create Succession");
        request.getRequestDispatcher("/web/createCustomer.jsp").forward(request,response);
    }

    void displayCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Customer> listCustomer = furamaBO.showAllCustomer();
        request.setAttribute("listCus", listCustomer);
        request.getRequestDispatcher("web/customer.jsp").forward(request, response);
    }

    void displayService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Service> listService = furamaBO.showAllService();
        request.setAttribute("listService", listService);
        request.getRequestDispatcher("web/service.jsp").forward(request, response);
    }

    void displayEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Employee> employeeList = furamaBO.showAllEmployee();
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("web/employee.jsp").forward(request, response);
    }

}
