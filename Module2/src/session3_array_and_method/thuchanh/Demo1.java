package session3_array_and_method.thuchanh;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int sizeRow = scanner.nextInt();
        System.out.println("Enter the cols : ");
        int sizeCols = scanner.nextInt();
        int array[][] = new int[sizeRow][sizeCols];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCols; j++) {
                array[i][j] = scanner.nextInt();
                System.out.print("Enter element " + (i + 1) + " " + (j + 1) + " : ");
            }
        }
    }
}
