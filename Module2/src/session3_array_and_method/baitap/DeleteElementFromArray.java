package session3_array_and_method.baitap;

import java.util.Scanner;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        int array[] = {10, 4, 3, 4, 5, 6, 7, 0, 0, 0};
        int newArray[] = new int[9];
        System.out.println("Enter the number ");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == (inputNumber)) {
                index = i;
            }
        }
        for (int j = index; j < array.length-1; j++) {
            array[j] = array[j + 1];
        }
        for (int k = 0; k < array.length-1; k++) {
            newArray[k] = array[k];
            System.out.print(array[k] + "\t");
        }
    }
}
