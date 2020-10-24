package service;

public class CalculatorService {
    public static String calculator(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            return String.valueOf(num1 + num2);
        } else if (operator.equals("-")) {
            return String.valueOf(num1 - num2);
        } else if (operator.equals("x")) {
            return String.valueOf(num1 * num2);
        } else if (num2 == 0) {
            return "denominator have to difference 0";
        } else
            return String.valueOf(num1 / num2);
    }
}
