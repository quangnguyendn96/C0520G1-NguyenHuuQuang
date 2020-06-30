package introduction_to_java;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String inputName = scanner.nextLine();

        System.out.println("Hello: " + inputName);
    }
}
