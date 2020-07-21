package session13_search_alogrithms.practice;

public class TestBinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        TestBinary testBinary = new TestBinary();
        System.out.println(testBinary.binarySearch(arr,0,arr.length-1, 6));
        System.out.println(binarySearchRecursion(arr,0,arr.length-1, 6));
    }
    public int binarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursion(int[] arr,int low, int high, int x){
//        int low = 0;
//        int high = arr.length-1;
        if(high >= low){
            int mid = low + (high - low) /2;
            if(arr[mid] == x) {
                return mid;
            }
            if(arr[mid] > x){
                return binarySearchRecursion(arr, low, mid -1, x);
            }
            else
                return binarySearchRecursion(arr, mid +1, high, x);
        }
        return -1;
    }
}
