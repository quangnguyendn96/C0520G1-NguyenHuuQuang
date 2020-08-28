package controller;

import models.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculationServlet", urlPatterns = "/calculator.jsp")
public class CalculationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("first"));
        float secondOperand = Float.parseFloat(request.getParameter("second"));
        char operator = request.getParameter("operator").charAt(0);

        float result1 = Calculator.calculate(firstOperand,secondOperand,operator);

        request.setAttribute("first",firstOperand);
        request.setAttribute("second",secondOperand);
        request.setAttribute("operator",operator);
        request.setAttribute("result",result1);

        request.getRequestDispatcher("/calculator/Calculator.jsp").forward(request,response);
    }
}
