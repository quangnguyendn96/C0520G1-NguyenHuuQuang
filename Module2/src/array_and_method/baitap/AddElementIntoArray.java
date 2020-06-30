package array_and_method.baitap;

import java.util.Scanner;

public class AddElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {10, 4, 3, 4, 5, 6, 7, 0, 0, 0};
        System.out.println("Enter the number ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter the index ");
        int inputIndex = scanner.nextInt();

        if (inputIndex >= array.length - 1) {
            System.out.println("Cannot add to array");
        } else {
//            array[inputIndex] = inputNumber;
            for (int i = array.length - 1; i >= inputIndex; i--) {
                array[inputIndex] = inputNumber;
                array[i] = array[i-1];

//                System.out.print(array[i] + "\t");
            }

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");

            }
        }
    }
}
