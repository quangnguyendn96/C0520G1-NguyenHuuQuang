package introduction_to_java;
import java.util.Scanner;
public class SuDungToanTu {
    public static void main(String[] args){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter width: ");
        width = scanner.nextFloat();

        System.out.printf("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
