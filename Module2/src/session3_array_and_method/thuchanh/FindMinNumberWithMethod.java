package session3_array_and_method.thuchanh;

public class FindMinNumberWithMethod {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    for(int i = 0; i < arr.length; i ++) {

    }
    }
    public  static int minValue(int []array){
        int min = array[0];
        for(int i = 0; i < array.length; i ++) {
                if( array[i] < min) {
                    min = array[i];
                }
        }
        return min;
    }
}
