package controller;

import models.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            float firstOperand = Float.parseFloat(request.getParameter("first"));
            float secondOperand = Float.parseFloat(request.getParameter("second"));
            char operator = request.getParameter("operator").charAt(0);
            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<h1>Result:</h1>");
            float result = Calculator.calculate(firstOperand,secondOperand,operator);
            writer.print(result);
            writer.println("</html>");


    }
}
