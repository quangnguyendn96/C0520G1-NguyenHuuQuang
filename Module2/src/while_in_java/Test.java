package while_in_java;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        float sum = 0;
        int count = 0, subjects = 3;
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the marks for " + subjects + " subjects: ");
        while (count < subjects) {
            System.out.println("#" + (count+1) + ": ");
            float mark = input.nextFloat();
            if (mark < 0) {
                System.out.println(mark + " ignored");
                continue;
            }
            sum += mark;
            count++;
        }
        System.out.print("Average mark = "+sum/subjects);
    }
}
