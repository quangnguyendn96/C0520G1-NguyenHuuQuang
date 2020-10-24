package controller;

import bo.ProductBO;
import bo.ProductBOImp;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {
    ProductBO productBo = new ProductBOImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createNewProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditProduct(request, response);
                break;
            case "delete":
                showDeleteProduct(request, response);
                break;
            case "view":
                viewProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                showAllProduct(request, response);
        }

    }


    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = productBo.showAll();
        request.setAttribute("listProduct", products);
        try {
            request.getRequestDispatcher("product/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        String status = request.getParameter("status");

        Product product = new Product(id, name, price, type, status);
        productBo.save(product);

        request.setAttribute("create", "New product was create");
        response.sendRedirect("/product");
//        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        String status = request.getParameter("status");

        Product product = productBo.findById(id);

        product.setIdProduct(id);
        product.setNameProduct(name);
        product.setPriceProduct(price);
        product.setTypeProduct(type);
        product.setStatusProduct(status);
        request.setAttribute("update", "update was succession");
        request.getRequestDispatcher("product/edit.jsp").forward(request, response);
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/edit.jsp").forward(request, response);

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        productBo.remove(id);
        response.sendRedirect("/product");
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productBo.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("product/delete.jsp").forward(request, response);

    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productBo.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("product/view.jsp").forward(request, response);
    }


    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("searchName");
        List<Product> listTemp = new ArrayList<>();
        if (name.equals("")) {
            response.sendRedirect("/product");
        } else {
            int index = -1;
            List<Product> list = productBo.showAll();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNameProduct().contains(name)) {
                    index = i;
                    listTemp.add(list.get(index));
                }
            }
            if (index == -1) {
                request.setAttribute("search", "name is incorrect");
            } else {
                request.setAttribute("listProduct", listTemp);
            }
            request.getRequestDispatcher("product/list.jsp").forward(request, response);
        }

    }
}
