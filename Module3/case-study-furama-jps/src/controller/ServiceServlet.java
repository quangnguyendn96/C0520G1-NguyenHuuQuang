package controller;


import bo.bo.ServiceBO;
import bo.boImp.ServiceBOImp;
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
        Service service = getService(request);
        serviceBO.insertNewObj(service);
        List<Service> listObj = serviceBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("create", "Create Succession");
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void editService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        Service service = getService(request);
        serviceBO.editObj(service);
        List<Service> listObj = serviceBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    private Service getService(HttpServletRequest request) {
        int idService = Integer.parseInt(request.getParameter("idService"));
        String nameService = request.getParameter("nameService");
        double areaService = Double.parseDouble(request.getParameter("areaService"));
        int numberFloor = Integer.parseInt(request.getParameter("numberFloor"));
        int maximumCustomer = Integer.parseInt(request.getParameter("maximumCustomer"));
        double costRent = Double.parseDouble(request.getParameter("costRent"));
        int idTypeService = Integer.parseInt(request.getParameter("idTypeService"));
        int idTypeRent = Integer.parseInt(request.getParameter("idTypeRent"));
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        String standardRoom = request.getParameter("standardRoom");

        return new Service(idService, nameService, areaService, numberFloor, maximumCustomer, costRent,
                idTypeService, idTypeRent, descriptionOtherConvenience, poolArea, standardRoom);
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
        int id = Integer.parseInt(request.getParameter("id"));
        Service obj = serviceBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, edit);
    }

    void viewServiceById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Service obj = serviceBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void deleteService(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        serviceBO.deleteObj(id);

        List<Service> listObj = serviceBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }
}
