package controller;


import bo.bo.ServiceBO;
import bo.boImp.ServiceBOImp;
import common.CheckValidate;
import model.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    static final String create = "web/service/createService.jsp";
    static final String edit = "web/service/editService.jsp";
    static final String display = "web/service/service.jsp";
    ServiceBO serviceBO = new ServiceBOImp() {
    };

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createObj":
                createService(response, request);
                break;
            case "editObj":
                editService(response, request);
                break;
        }
    }

    void createService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String idService = request.getParameter("idService");
        String nameService = request.getParameter("nameService");
        double areaService = Double.parseDouble(request.getParameter("areaService"));
        String numberFloor = request.getParameter("numberFloor");
        String maximumCustomer = (request.getParameter("maximumCustomer"));
        double costRent = Double.parseDouble(request.getParameter("costRent"));
        String idTypeService = (request.getParameter("idTypeService"));
        String idTypeRent = (request.getParameter("idTypeRent"));
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        String standardRoom = request.getParameter("standardRoom");
        Service service = new Service(idService, nameService, areaService, numberFloor, maximumCustomer, costRent,
                idTypeService, idTypeRent, descriptionOtherConvenience, poolArea, standardRoom);
        if (!CheckValidate.checkIdService(idService)) {
            request.setAttribute("message", "Wrong id");
        } else if (CheckValidate.checkInteger(numberFloor)) {
            request.setAttribute("message", "Wrong input floor");
        } else if (CheckValidate.checkInteger(maximumCustomer)) {
            request.setAttribute("message", "Wrong input number customer");
        } else {
            serviceBO.insertNewObj(service);
            List<Service> listObj = serviceBO.showAllObj();
            request.setAttribute("listObj", listObj);
            request.setAttribute("message", "Create Succession");
        }
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void editService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String idService = request.getParameter("idService");
        String nameService = request.getParameter("nameService");
        double areaService = Double.parseDouble(request.getParameter("areaService"));
        String numberFloor = request.getParameter("numberFloor");
        String maximumCustomer = (request.getParameter("maximumCustomer"));
        double costRent = Double.parseDouble(request.getParameter("costRent"));
        String idTypeService = (request.getParameter("idTypeService"));
        String idTypeRent = (request.getParameter("idTypeRent"));
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        String standardRoom = request.getParameter("standardRoom");
        Service service = new Service(idService, nameService, areaService, numberFloor, maximumCustomer, costRent,
                idTypeService, idTypeRent, descriptionOtherConvenience, poolArea, standardRoom);
        if (CheckValidate.checkInteger(numberFloor)) {
            request.setAttribute("message", "Wrong input floor");
        } else if (CheckValidate.checkInteger(maximumCustomer)) {
            request.setAttribute("message", "Wrong input number customer");
        } else {

            serviceBO.editObj(service);
            List<Service> listObj = serviceBO.showAllObj();
            request.setAttribute("listObj", listObj);
            FuramaServlet.requestDispatcher(response, request, display);
        }
        showEditNewService(response, request);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {

            case "createObj":
                showCreateService(response, request);
                break;
            case "insertObj":
                showInsertNewService(response, request);
                break;
            case "editObj":
                showEditNewService(response, request);
                break;
            case "viewObjById":
                viewServiceById(response, request);
                break;
            case "deleteObj":
                deleteService(response, request);
                break;
            default:
                displayService(response, request);
        }
    }

    void displayService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Service> listObj = serviceBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void showCreateService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showInsertNewService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showEditNewService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Service obj = serviceBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, edit);
    }

    void viewServiceById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Service obj = serviceBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void deleteService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        serviceBO.deleteObj(id);

        List<Service> listObj = serviceBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }
}
