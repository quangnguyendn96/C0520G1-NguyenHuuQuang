package controller;


import bo.bo.EmployeeBO;
import bo.boImp.EmployeeBOImp;
import model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    static final String create = "web/employee/createEmployee.jsp";
    static final String edit = "web/employee/editEmployee.jsp";
    static final String display = "web/employee/employee.jsp";
    EmployeeBO employeeBO = new EmployeeBOImp() {
    };

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createObj":
                createEmployee(response, request);
                break;
            case "editObj":
                editEmployee(response, request);
                break;
        }
    }

    void createEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        Employee employee = getEmployee(request);
        employeeBO.insertNewObj(employee);

        request.setAttribute("create", "Create Succession");
        List<Employee> listObj = employeeBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }


    void editEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        Employee employee = getEmployee(request);
        employeeBO.editObj(employee);

        List<Employee> listObj = employeeBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    private Employee getEmployee(HttpServletRequest request) {
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        String nameEmployee = request.getParameter("nameEmployee");
        int idPositive = Integer.parseInt(request.getParameter("idPositive"));
        int idDegreeEducation = Integer.parseInt(request.getParameter("idDegreeEducation"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        String dayOfBirth = request.getParameter("dayOfBirth");
        String identityCardEmployee = request.getParameter("identityCardEmployee");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phoneNumber = request.getParameter("phoneNumber");
        String emailEmployee = request.getParameter("emailEmployee");
        String addressEmployee = request.getParameter("addressEmployee");
        String username = request.getParameter("username");

        return new Employee(idEmployee, nameEmployee, idPositive, idDegreeEducation, idDivision, dayOfBirth,
                identityCardEmployee, salary, phoneNumber, emailEmployee, addressEmployee, username);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {

            case "createObj":
                showCreateEmployee(response, request);
                break;
            case "insertObj":
                showInsertNewEmployee(response, request);
                break;
            case "editObj":
                showEditNewEmployee(response, request);
                break;
            case "viewObjById":
                viewEmployeeById(response, request);
                break;
            case "deleteObj":
                deleteEmployee(response, request);
                break;
            default:
                displayEmployee(response, request);
        }
    }

    void displayEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Employee> listObj = employeeBO.showAllObj();
        request.setAttribute("listObj", listObj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void showCreateEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showInsertNewEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        FuramaServlet.requestDispatcher(response, request, create);
    }

    void showEditNewEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee obj = employeeBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, edit);
    }

    void viewEmployeeById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee obj = employeeBO.getById(id);
        request.setAttribute("obj", obj);
        FuramaServlet.requestDispatcher(response, request, display);
    }

    void deleteEmployee(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeBO.deleteObj(id);

        List<Employee> listObj = employeeBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        FuramaServlet.requestDispatcher(response, request, display);
    }
}
