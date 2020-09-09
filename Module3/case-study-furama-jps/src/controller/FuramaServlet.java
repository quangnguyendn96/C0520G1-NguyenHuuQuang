package controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "FuramaServlet", urlPatterns = {"", "/home"})

public class FuramaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showHome(response,request);
    }

    public static void showHome(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("web/homeFurama/home.jsp").forward(request, response);
    }

    public static void requestDispatcher(HttpServletResponse response, HttpServletRequest request, String linkURL) throws ServletException, IOException{
        request.getRequestDispatcher(linkURL).forward(request, response);
    }

}
