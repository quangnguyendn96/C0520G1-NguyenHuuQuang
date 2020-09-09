package controlller;

import bo.StudentBO;
import bo.StudentBOImp;
import common.CheckValidate;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"", "/student"})
public class StudentServlet extends HttpServlet {

    // đổi tên link
    StudentBO objBO = new StudentBOImp();
    static final String create = "student/createStudent.jsp";
    static final String edit = "student/editStudent.jsp";
    static final String display = "student/student.jsp";

    public static void requestDispatcher(HttpServletResponse response, HttpServletRequest request, String linkURL) throws ServletException, IOException {
        request.getRequestDispatcher(linkURL).forward(request, response);
    }

    //ko đổi
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "createObj":
                createObj(response, request);
                break;
            case "editObj":
                editObj(response, request);
                break;
        }
    }

    void createObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String className = request.getParameter("className");
        String gender = request.getParameter("gender");
        String idCard = request.getParameter("idCard");
        String dayOfBirth = request.getParameter("dayOfBirth");
        String phoneNumber = (request.getParameter("phoneNumber"));

        if (!CheckValidate.checkId(id)) {
            request.setAttribute("message", "Wrong id");
        } else if (CheckValidate.checkEmpty(name)) {
            request.setAttribute("message1", "Wrong name");
        } else if (CheckValidate.checkEmpty(className)) {
            request.setAttribute("message2", "Wrong input name class");
        } else if (CheckValidate.checkIdCard(idCard)) {
            request.setAttribute("message3", "Wrong input id card");
        } else if (CheckValidate.checkPhoneNumber(phoneNumber)) {
            request.setAttribute("message4", "Wrong input phone number");
        } else {
            Student obj = new Student(id, name, className, gender, idCard,
                    dayOfBirth, phoneNumber);
            objBO.insertNewObj(obj);
            request.setAttribute("message5", "Create Succession");
            requestDispatcher(response, request, create);
        }
        Student obj = new Student(id, name, className, gender, idCard,
                dayOfBirth, phoneNumber);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, create);
    }

    void editObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String className = request.getParameter("className");
        String gender = request.getParameter("gender");
        String idCard = request.getParameter("idCard");
        String dayOfBirth = request.getParameter("dayOfBirth");
        String phoneNumber = (request.getParameter("phoneNumber"));

        if (!CheckValidate.checkId(id)) {
            request.setAttribute("message", "Wrong id");
        } else if (CheckValidate.checkEmpty(name)) {
            request.setAttribute("message1", "Wrong name");
        } else if (CheckValidate.checkEmpty(className)) {
            request.setAttribute("message2", "Wrong input name class");
        } else if (CheckValidate.checkIdCard(idCard)) {
            request.setAttribute("message3", "Wrong input id card");
        } else if (CheckValidate.checkPhoneNumber(phoneNumber)) {
            request.setAttribute("message4", "Wrong input phone number");
        } else {
            Student obj = new Student(id, name, className, gender, idCard,
                    dayOfBirth, phoneNumber);
            objBO.editObj(obj);
            request.setAttribute("message5", "Edit Succession");
            requestDispatcher(response, request, edit);
        }
        Student obj = new Student(id, name, className, gender, idCard,
                dayOfBirth, phoneNumber);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, edit);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {

            case "createObj":
                showCreateObj(response, request);
                break;
            case "editObj":
                showEditObj(response, request);
                break;
            case "viewObjById":
                viewObjById(response, request);
                break;
            case "deleteObj":
                deleteObj(response, request);
                break;
            case "searchObj":
                searchObj(response, request);
                break;
            default:
                displayObj(response, request);
        }
    }

    void displayObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Student> listObj = objBO.showAllObj();
        request.setAttribute("listObj", listObj);
        requestDispatcher(response, request, display);
    }

    void showCreateObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        requestDispatcher(response, request, create);
    }

    void showEditObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Student obj = objBO.getById(id);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, edit);
    }

    void viewObjById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Student obj = objBO.getById(id);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, display);
    }

    void deleteObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        objBO.deleteObj(id);

        List<Student> listObj = objBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        requestDispatcher(response, request, display);
    }

    void searchObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("searchObj");
        if (CheckValidate.checkEmpty(name)) {
            response.sendRedirect("/student");
        } else {
            List<Student> listObj = objBO.searchObj(name);

            request.setAttribute("listObj", listObj);
            request.setAttribute("search", name);
            requestDispatcher(response, request, display);
        }
    }
}
