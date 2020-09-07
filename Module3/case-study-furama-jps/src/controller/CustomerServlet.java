package controller;

import bo.bo.CustomerBO;
import bo.boImp.CustomerBOImp;
import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    static final String create = "web/customer/createCustomer.jsp";
    static final String edit = "web/customer/editCustomer.jsp";
    static final String display = "web/customer/customer.jsp";
    CustomerBO customerBO = new CustomerBOImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            //create
            case "createObj":
                createCustomer(response, request);
                break;
            //edit
            case "editObj":
                editCustomer(response, request);
                break;

        }
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
        customerBO.insertNewObj(customer);
        request.setAttribute("create", "Create Succession");
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void editCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
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

        customerBO.editObj(customer);
        List<Customer> listCustomer = customerBO.showAllObj();
        request.setAttribute("listCus", listCustomer);
        request.setAttribute("edit", "Edit Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {

            case "createObj":
                showCreateCustomer(response, request);
                break;
            case "insertObj":
                showInsertNewCustomer(response, request);
                break;
            case "editObj":
                showEditNewCustomer(response, request);
                break;
            case "viewObjById":
                viewCustomerById(response, request);
                break;
            case "deleteObj":
                deleteCustomer(response, request);
                break;
            default:
                displayCustomer(response,request);
        }
    }

    void displayCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Customer> listCustomer = customerBO.showAllObj();
        request.setAttribute("listCus", listCustomer);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void showCreateCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showInsertNewCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showEditNewCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerBO.getById(id);
        request.setAttribute("customer", customer);
        FuramaServlet.requestDispatcher(response, request, edit);
    }

    void showAllInforCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerBO.showAllInforEachCustomer(id);
    }


    void viewCustomerById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerBO.getById(id);
        request.setAttribute("listCus", customer);
    }
    void deleteCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerBO.deleteObj(id);
        List<Customer> listCustomer = customerBO.showAllObj();
        request.setAttribute("listCus", listCustomer);
        request.setAttribute("delete", "Delete Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }


}
