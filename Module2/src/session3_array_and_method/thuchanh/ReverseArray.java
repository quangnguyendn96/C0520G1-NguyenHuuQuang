package session3_array_and_method.thuchanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner inputArray = new Scanner(System.in);
        int array[];
        int length;
        do {
            System.out.println("Enter the length ");
            length = inputArray.nextInt();
            if (length > 20) {
                System.out.println("Size array is over 20");
            }
        }
        while (length > 20);

        array = new int[length];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = inputArray.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[length - 1 - j];
            array[length - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
