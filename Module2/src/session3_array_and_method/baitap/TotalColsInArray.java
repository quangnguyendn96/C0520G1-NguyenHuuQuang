package session3_array_and_method.baitap;

import java.util.Scanner;

public class TotalColsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cols");
        int inputCols = scanner.nextInt();
        int generalArray[][] = {
                {2, 3, 12, 3, 5, 7, 2, 9},
                {4, 2, 6, 7, 12, 20, 1, 7},
                {12, 1, 5, 39, 29, 12, 26},
        };
        int total = 0;
        for (int i = 0; i < generalArray.length; i++) {
            total += generalArray[i][inputCols];
        }
        System.out.println(total);
    }
}


