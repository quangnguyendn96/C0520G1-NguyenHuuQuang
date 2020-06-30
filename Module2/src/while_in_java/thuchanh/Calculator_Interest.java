package while_in_java.thuchanh;

import java.util.Scanner;

public class Calculator_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input money");
        double inputMoney = input.nextDouble();
        System.out.println("Input month");
        int inputMonth = input.nextInt();
        System.out.println("Input interest");
        double inputInterest = input.nextDouble();

        double totalInterest = 0;
        totalInterest = inputMoney * (inputInterest/100) * 12 * inputMonth;

        System.out.println("Total Interest " + totalInterest);
    }
}
