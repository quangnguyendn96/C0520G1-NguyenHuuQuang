package sorting_alogrithms.demo;

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
        }
    }

//    public static void swap(int[] a, int[] b) {
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 4, 7, 1, 6, 9, 3, 1,-2};
        bubberSort(arr);
        for (int ar : arr) {
            System.out.println(ar);
        }
    }
}
