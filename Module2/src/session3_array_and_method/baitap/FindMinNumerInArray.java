package session3_array_and_method.baitap;

import java.util.Scanner;

public class FindMinNumerInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArray[];
        int inputSize;
        int index;


            System.out.println("Enter the size ");
            inputSize = scanner.nextInt();

        inputArray = new int[inputSize];
        int i =0;
        while ( i< inputSize) {
            System.out.print("Enter element" + (i + 1) + " : ");
            inputArray[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < inputArray.length; j++) {
            System.out.print(inputArray[j] + "\t");
        }
        int min = inputArray[0];
          index = 1;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] < min) {
                min = inputArray[j];
                index = j + 1;
            }
        }
        System.out.println("The smallest property value in the list is " + min );

    }
}
