package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "contractServlet", urlPatterns = {"", "/home"})
public class FuramaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createCustomer" :
                createCustomer(response,request);
                break;
            case "search":
                break;
            default:
                showHome(response,request);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createCustomer" :
                showCreateCustomer(response,request);
                break;
            default:
                showHome(response,request);
        }
    }
    void showHome(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/home.jsp").forward(request,response);
    }
    void showCreateCustomer(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/createCustomer.jsp").forward(request,response);
    }
    void createCustomer(HttpServletResponse response,HttpServletRequest request){

    }
}
