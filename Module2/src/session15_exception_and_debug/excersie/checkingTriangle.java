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
            if (a < 0) {
                throw new InputMismatchException("Wrong input");
            }
            System.out.println("Input the second edge");
            b = scanner.nextInt();
            if (b < 0) {
                throw new InputMismatchException("Wrong input");
            }
            System.out.println("Input the third edge");

            c = scanner.nextInt();
            if (c < 0) {
                throw new InputMismatchException("Wrong input");
            }
            System.out.println("Three edges is : " + a + " , " + b + " , " + c);
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println("Failed" + e);
        }
        
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a - b >= c) {
            throw new IllegalTriangleException("Not a triangle");
        }
        if (b + c <= a || b - c >= a) {
            throw new IllegalTriangleException("Not a triangle");
        }
        if (c + a <= b || c - a >= b) {
            throw new IllegalTriangleException("Not a triangle");
        }
    }

}

