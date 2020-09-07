package controller.homeFuramaServlet;

import model.contract.Contract;
import model.customer.Customer;
import model.employee.Employee;
import model.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FuramaServlet", urlPatterns = {"", "/home"})

public class FuramaServlet extends HttpServlet {

    public static void showHome(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/home.jsp").forward(request, response);
    }
    public static void requestDispatcher(HttpServletResponse response, HttpServletRequest request, String linkURL) throws ServletException, IOException{
        request.getRequestDispatcher(linkURL).forward(request, response);
    }









//    void displayService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        List<Service> listService = furamaBO.showAllService();
//        request.setAttribute("listService", listService);
//        request.getRequestDispatcher("web/service.jsp").forward(request, response);
//    }
//
//    void displayEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        List<Employee> employeeList = furamaBO.showAllEmployee();
//        request.setAttribute("employeeList", employeeList);
//        request.getRequestDispatcher("web/employee.jsp").forward(request, response);
//    }
//
//    void displayContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        List<Contract> contractList = furamaBO.showAllContract();
//        request.setAttribute("contractList", contractList);
//        request.getRequestDispatcher("web/contract.jsp").forward(request, response);
//    }

}
