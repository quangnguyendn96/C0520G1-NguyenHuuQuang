package introduction_to_java;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Năm nhuận");
                } else {
                    System.out.print("Năm không nhuận");
                }
            } else
                System.out.print("Năm nhuận");
        } else {
            System.out.print("Năm không nhuận");
        }
    }
}

