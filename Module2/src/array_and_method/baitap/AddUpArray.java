package array_and_method.baitap;

import java.util.Scanner;

public class AddUpArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size array 1: ");
        int sizeArray1 = scanner.nextInt();
        System.out.print("Enter the size array 2: ");
        int sizeArray2 = scanner.nextInt();

        int i = 0;
        int j = 0;

        int array1[] = new int[sizeArray1];
        while (i < sizeArray1) {
            System.out.print("Element array1 " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int array2[] = new int[sizeArray2];
        while (j < sizeArray2) {
            System.out.print("Element array2 " + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int array3[] = new int[sizeArray1 + sizeArray2];
        System.out.print("Array 1 : ");
        for (int k = 0; k < sizeArray1; k++) {
            array3[k] = array1[k];
            System.out.print(array1[k] + "\t");
        }
        System.out.println("\n");
        System.out.print("Array 2 : ");
        int countArray2 = sizeArray1;
        for (int k = 0; k < sizeArray2; k++) {
            array3[countArray2] = array2[k];
            countArray2++;
            System.out.print(array2[k] + "\t");

        }
        System.out.println("\n");
        System.out.print("Array 3 : ");
        for (int k = 0; k < (sizeArray1 + sizeArray2); k++) {
            System.out.print(array3[k] + "\t");

        }
    }
}
