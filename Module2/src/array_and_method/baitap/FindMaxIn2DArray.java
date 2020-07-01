package array_and_method.baitap;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int generalArray[][] = {
                {2, 3, 12, 3, 5, 7, 2, 9},
                {4, 2, 6, 7, 12, 20, 1},
                {12, 1, 5, 39, 29},
        };
        int min = 0;
        for (int i = 0; i < generalArray.length; i++ ) {
            for (int j = 0; j < generalArray[i].length; j++){
                if(min < generalArray[i][j] )
                    min = generalArray[i][j];
            }
        }
        System.out.println(min);
    }
}