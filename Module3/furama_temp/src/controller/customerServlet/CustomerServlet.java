//package controller.customerServlet;
//
//import bo.customerBO.CustomerBO;
//import bo.customerBO.CustomerBOImp;
//import controller.FuramaServlet;
//import model.customer.Customer;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/home"})
//public class CustomerServlet extends HttpServlet {
//    static final String create = "/customer/createCustomer.jsp";
//    static final String edit = "/customer/editCustomer.jsp";
//    static final String display = "/customer/customer.jsp";
//    CustomerBO customerBO = new CustomerBOImp();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null)
//            action = "";
//        switch (action) {
//            case "createCustomer":
//                createCustomer(response, request);
//                break;
//            case "editContract":
//                editCustomer(response, request);
//                break;
//            case "deleteContract":
//                deleteCustomer(response, request);
//                break;
//        }
//    }
//
//
//    void createCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
//        int idTypeCustomer = Integer.parseInt(request.getParameter("idTypeCustomer"));
//        String nameCustomer = request.getParameter("nameCustomer");
//        String dayOfBirthCustomer = request.getParameter("dayOfBirthCustomer");
//        int genderCustomer = Integer.parseInt(request.getParameter("genderCustomer"));
//        String identityCard = request.getParameter("identityCard");
//        String phoneCustomer = request.getParameter("phoneCustomer");
//        String emailCustomer = request.getParameter("emailCustomer");
//        String addCustomer = request.getParameter("addCustomer");
//        Customer customer = new Customer(idCustomer, idTypeCustomer, nameCustomer, dayOfBirthCustomer,
//                genderCustomer, identityCard, phoneCustomer, emailCustomer, addCustomer);
//        customerBO.insertNewCustomer(customer);
//        request.setAttribute("create", "Create Succession");
//        FuramaServlet.requestDispatcher(response, request, create);
//    }
//
//    void editCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
//        int idTypeCustomer = Integer.parseInt(request.getParameter("idTypeCustomer"));
//        String nameCustomer = request.getParameter("nameCustomer");
//        String dayOfBirthCustomer = request.getParameter("dayOfBirthCustomer");
//        int genderCustomer = Integer.parseInt(request.getParameter("genderCustomer"));
//        String identityCard = request.getParameter("identityCard");
//        String phoneCustomer = request.getParameter("phoneCustomer");
//        String emailCustomer = request.getParameter("emailCustomer");
//        String addCustomer = request.getParameter("addCustomer");
//        Customer customer = new Customer(idCustomer, idTypeCustomer, nameCustomer, dayOfBirthCustomer,
//                genderCustomer, identityCard, phoneCustomer, emailCustomer, addCustomer);
//        customerBO.editCustomer(customer);
//        request.setAttribute("edit", "Edit Succession");
//        FuramaServlet.requestDispatcher(response, request, edit);
//    }
//
//    void deleteCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        customerBO.deleteCustomer(id);
//        List<Customer> listCustomer = customerBO.showAllCustomer();
//        request.setAttribute("listCus", listCustomer);
//        request.setAttribute("delete", "Delete Succession");
//        FuramaServlet.requestDispatcher(response, request, display);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null)
//            action = "";
//        switch (action) {
//            case "customer":
//                displayCustomer(response, request);
//                break;
//            case "createContract":
//                showCreateCustomer(response, request);
//                break;
//            case "insertNewContract":
//                showInsertNewCustomer(response, request);
//                break;
//            case "editContract":
//                showEditNewCustomer(response, request);
//                break;
//            case "viewCustomerById":
//                viewCustomerById(response, request);
//                break;
//            default:
//                FuramaServlet.showHome(response, request);
//        }
//    }
//
//    void displayCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        List<Customer> listCustomer = customerBO.showAllCustomer();
//        request.setAttribute("listCus", listCustomer);
//        FuramaServlet.requestDispatcher(response, request, display);
//    }
//
//    void showCreateCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        FuramaServlet.requestDispatcher(response, request, create);
//    }
//
//    void showInsertNewCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        FuramaServlet.requestDispatcher(response, request, create);
//    }
//
//    void showEditNewCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("idCustomer"));
//        Customer customer = customerBO.getIdCustomer(id);
//        request.setAttribute("customer", customer);
//        FuramaServlet.requestDispatcher(response, request, edit);
//    }
//
//    void showAllInforCustomer(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        customerBO.showAllInforEachCustomer(id);
//    }
//
//
//    void viewCustomerById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Customer customer = customerBO.getIdCustomer(id);
//        request.setAttribute("listCus", customer);
//    }
//
//}
