package cleancode_in_java.practice.refactoring_introduct_varible;

public class Calculator {

    public static final char Addtion = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperator, int secondOperand, char operator) {
        switch (operator) {
            case Addtion:
                return firstOperator + secondOperand;
            case SUBTRACTION:
                return firstOperator - secondOperand;
            case MULTIPLICATION:
                return firstOperator * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperator / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
