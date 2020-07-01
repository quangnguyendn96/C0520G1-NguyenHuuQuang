package introduction_to_java;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a;
        int b;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập a ");
            a = input.nextInt();
            System.out.println("Nhập b ");
            b = input.nextInt();
            sum += a + b;
        }
        while (a != 0 && b != 0);
        System.out.println(sum);
    }
}
