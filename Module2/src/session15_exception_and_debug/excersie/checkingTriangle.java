package session15_exception_and_debug.excersie;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.IllegalFormatCodePointException;

public class checkingTriangle {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Input the first edge");
            a = scanner.nextInt();
            if(a<0) {
                throw new InputMismatchException("Wrong input");
            }
            System.out.println("Input the second edge");
            b = scanner.nextInt();
            System.out.println("Input the third edge");

            c = scanner.nextInt();
            System.out.println("Three edges is : " + a + " , " + b + " , " + c);
        }
//        catch (IllegalArgumentException e) {
//            if (a < 0) {
//                throw new IllegalAccessException("Wrong input")
//        }
        catch (ArithmeticException e){
            System.out.println("Wrong input");
        }
        catch (InputMismatchException e){
            System.out.println();

        } finally {
            checkTriangle(a, b, c);
        }

        System.out.println("Right!! ");

    }

    public static void checkTriangle(double a, double b, double c)
            throws InputMismatchException {
        if (a + b <= c || a - b >= c) {
            throw new InputMismatchException("Not a triangle");
        }
        if (b + c <= a || b - c >= a) {
            throw new InputMismatchException("Not a triangle");
        }
        if (c + a <= b || c - a >= b) {
            throw new InputMismatchException("Not a triangle");
        }
    }
    public static void checkEdge(double a, double b, double c) throws ArithmeticException{
        if(a < 0){
            throw new InputMismatchException("Wrong edge")
        }
    }
}
