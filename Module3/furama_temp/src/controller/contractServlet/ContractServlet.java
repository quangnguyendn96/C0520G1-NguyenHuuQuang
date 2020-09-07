//package controller.contractServlet;
//
//import bo.contractBO.ContractBO;
//import bo.contractBO.ContractBOImp;
//import controller.FuramaServlet;
//import model.contract.Contract;
//import model.customer.Customer;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "contractServlet", urlPatterns = {"", "/home"})
//public class ContractServlet extends HttpServlet {
//    ContractBO contractBO = new ContractBOImp();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null)
//            action = "";
//        switch (action) {
//            case "createContract":
//                createCustomer(response, request);
//                break;
//            case "insertNewContract":
//                insertNewContract(response, request);
//                break;
//            case "editNewContract":
//                editNewContract(response, request);
//                break;
//            case "deleteContract" :
//                deleteContract(response, request);
//                break;
//        }
//    }
//    void createContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        int idContract =  Integer.parseInt(request.getParameter("idContract"));
//        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
//        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
//        int idService = Integer.parseInt(request.getParameter("idService"));
//        String contractDate = request.getParameter("contractDate");
//        String contractExpire = request.getParameter("contractExpire");
//        double depositMoney = Double.parseDouble(request.getParameter("depositMoney"));
//        double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));
//
//        Contract contract = new Contract(idContract, idEmployee, idCustomer, idService , contractDate ,
//                contractExpire, depositMoney, totalMoney);
//        contractBO.insertNewContract(contract);
//        request.setAttribute("create", "Create Succession");
//        request.getRequestDispatcher("/web/createContract.jsp").forward(request, response);
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null)
//            action = "";
//        switch (action) {
//            case "createContract":
//                showCreateCustomer(response, request);
//                break;
//            case "insertNewContract":
//                showInsertNewContract(response, request);
//                break;
//            case "editNewContract":
//                showEditNewContract(response, request);
//                break;
//            case "deleteContract" :
//                showDeleteContract(response, request);
//                break;
//            case "viewCustomerById":
//                viewCustomer(response, request);
//                break;
//            default:
//                FuramaServlet.showHome(response, request);
//        }
//    }
//
//}
