package session3_array_and_method.baitap;

import java.util.Scanner;

public class TotalNumberCrossInArray {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int sizeRow = scanner.nextInt();
        System.out.println("Enter the cols : ");
        int sizeCols = scanner.nextInt();
        int array[][] = new int[sizeRow][sizeCols];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCols; j++) {
                System.out.print("Enter element " + (i + 1) + " " + (j + 1) + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
                }

        System.out.println("Tổng các đường chéo là " + total);
    }
}
