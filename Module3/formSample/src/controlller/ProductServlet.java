package controlller;

import bo.ProductBO;
import bo.ProductBOImp;
import common.CheckValidate;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {

    // đổi tên link
    ProductBO objBO = new ProductBOImp();
    static final String create = "product/createProduct.jsp";
    static final String edit = "product/editProduct.jsp";
    static final String display = "product/product.jsp";

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
        String price = request.getParameter("price");
        String amountNumber = request.getParameter("amountNumber");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");


        if (CheckValidate.checkEmpty(id)) {
            request.setAttribute("message", "Wrong id");
        } else if (CheckValidate.checkEmpty(name)) {
            request.setAttribute("message1", "Wrong name");
        } else if (CheckValidate.checkPositive(price)) {
            request.setAttribute("message2", "Wrong price");
        } else if (CheckValidate.checkInteger(amountNumber)) {
            request.setAttribute("message3", "Wrong input");
        } else if (CheckValidate.checkEmpty(color)) {
            request.setAttribute("message4", "Wrong input");
        } else if (CheckValidate.checkEmpty(description)) {
            request.setAttribute("message5", "Wrong input");
        } else {
            Product obj = new Product(id, name, price, amountNumber, color, description,
                    category);
            objBO.insertNewObj(obj);

//            List<Product> listObj = objBO.showAllObj();
//            request.setAttribute("listObj", listObj);
//            requestDispatcher(response, request, display);
            request.setAttribute("message6", "Create Succession");
            requestDispatcher(response, request, create);
        }
        Product obj = new Product(id, name, price, amountNumber, color, description,
                category);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, create);
    }

    void editObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String amountNumber = request.getParameter("amountNumber");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");


        if (CheckValidate.checkEmpty(id)) {
            request.setAttribute("message", "Wrong id");
        } else if (CheckValidate.checkEmpty(name)) {
            request.setAttribute("message1", "Wrong name");
        } else if (CheckValidate.checkPositive(price)) {
            request.setAttribute("message2", "Wrong price");
        } else if (CheckValidate.checkInteger(amountNumber)) {
            request.setAttribute("message3", "Wrong input");
        } else if (CheckValidate.checkEmpty(color)) {
            request.setAttribute("message4", "Wrong input");
        } else if (CheckValidate.checkEmpty(description)) {
            request.setAttribute("message5", "Wrong input");
        } else {
            Product obj = new Product(id, name, price, amountNumber, color, description,
                    category);
            objBO.editObj(obj);
            request.setAttribute("message6", "Edit Succession");
            requestDispatcher(response, request, edit);
        }
        Product obj = new Product(id, name, price, amountNumber, color, description,
                category);
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
        List<Product> listObj = objBO.showAllObj();
        request.setAttribute("listObj", listObj);
        requestDispatcher(response, request, display);
    }

    void showCreateObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        requestDispatcher(response, request, create);
    }

    void showEditObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Product obj = objBO.getById(id);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, edit);
    }

    void viewObjById(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        Product obj = objBO.getById(id);
        request.setAttribute("obj", obj);
        requestDispatcher(response, request, display);
    }

    void deleteObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String id = request.getParameter("id");
        objBO.deleteObj(id);

        List<Product> listObj = objBO.showAllObj();
        request.setAttribute("listObj", listObj);
        request.setAttribute("delete", "Delete Succession");
        requestDispatcher(response, request, display);
    }

    void searchObj(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("searchObj");
        if (CheckValidate.checkEmpty(name)) {
            response.sendRedirect("/product");
        } else {
            List<Product> listObj = objBO.searchObj(name);

            request.setAttribute("listObj", listObj);
            request.setAttribute("search", name);
            requestDispatcher(response, request, display);
        }
    }

}
