package controller;


import bo.bo.ContractBO;
import bo.boImp.ContractBOImp;
import model.Contract;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    static final String create = "web/contract/createContract.jsp";
    static final String edit = "web/contract/editContract.jsp";
    static final String display = "web/contract/contract.jsp";
    ContractBO contractBO = new ContractBOImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            //create
            case "createObj":
                createContract(response, request);
                break;
            //edit
            case "editObj":
                editContract(response, request);
                break;
        }
    }

    void createContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int idContract = Integer.parseInt(request.getParameter("idContract"));
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        int idService = Integer.parseInt(request.getParameter("idService"));
        String contractDate = request.getParameter("contractDate");
        String contractExpire = request.getParameter("contractExpire");
        double depositMoney = Double.parseDouble(request.getParameter("depositMoney"));
        double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));

        Contract contract = new Contract(idContract, idEmployee, idCustomer, idService, contractDate,
                contractExpire, depositMoney, totalMoney);
        contractBO.insertNewObj(contract);
        List<Contract> listObj = contractBO.showAllObj();
        request.setAttribute("create", "Create Succession");
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void editContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int idContract = Integer.parseInt(request.getParameter("idContract"));
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        int idService = Integer.parseInt(request.getParameter("idService"));
        String contractDate = request.getParameter("contractDate");
        String contractExpire = request.getParameter("contractExpire");
        double depositMoney = Double.parseDouble(request.getParameter("depositMoney"));
        double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));

        Contract contract = new Contract(idContract, idEmployee, idCustomer, idService, contractDate,
                contractExpire, depositMoney, totalMoney);
        contractBO.editObj(contract);

        List<Contract> listObj = contractBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {

            case "createObj":
                showCreateContract(response, request);
                break;
            case "insertObj":
                showInsertNewContract(response, request);
                break;
            case "editObj":
                showEditNewContract(response, request);
                break;
            case "viewObjById":
                viewContractById(response, request);
                break;
            case "deleteObj":
                deleteContract(response, request);
                break;
            default:
                displayContract(response, request);
        }
    }

    void displayContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Contract> listObj = contractBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void showCreateContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showInsertNewContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showEditNewContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Contract obj = contractBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, edit);
    }

    void viewContractById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Contract obj = contractBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response,request,display);
    }

    void deleteContract(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        contractBO.deleteObj(id);

        List<Contract> listObj = contractBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }
}