package session3_array_and_method.thuchanh;
import java.util.Scanner;
public class FindMaxNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int array[];
        do {
            System.out.print("Enter a size:");
            count = scanner.nextInt();
            if (count > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (count > 20);

        array = new int[count];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
