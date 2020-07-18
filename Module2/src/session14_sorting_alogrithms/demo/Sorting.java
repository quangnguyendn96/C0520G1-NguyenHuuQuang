package session14_sorting_alogrithms.demo;

import java.util.Arrays;

public class Sorting {
    public static void bubberSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < arr.length - i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp;
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void booleanBubberSort(int[] arr) {
        boolean swap;
        for (int i = 1; i < arr.length; i++) {
            swap = false;
            for (int k = 0; k < arr.length - i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp;
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double min = arr[i];
            int index = -1;
            for (int k = i + 1; k < arr.length; k++) {
                if (min > arr[k]) {
                    min = arr[k];
                    index = k;
                }
            }
            if(index != -1) {
                double temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
public static void insertionSort(int[] arr){
//        for()
}
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 4, 7, 1, 6, 5};
        double[] arr1 = {1.2, 4, 7, 9.4, 4.3, 2.3};
//        bubberSort(arr);
//        booleanBubberSort(arr);
        selectionSort(arr1);
        for (double ar : arr1) {
            System.out.print(ar + " ");
        }
    }

}
