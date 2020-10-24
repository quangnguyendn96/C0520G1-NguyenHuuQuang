package session2_while_in_java.thuchanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a : ");
        a = input.nextInt();
        System.out.println("Input b : ");
        b = input.nextInt();

        if ((a < 0 || b < 0) || (a == 0 && b == 0)) {
            System.out.println("Wrong number");
        } else if (a == b) {
            System.out.println("Ước chung lớn nhất là " + a);
        } else {
            if (a > b) {
                a = a - b;
                System.out.println("Ước chung lớn nhất là " + a);
            } else {
                b = b - a;
                System.out.println("Ước chung lớn nhất là " + b);
            }

        }
    }
}
