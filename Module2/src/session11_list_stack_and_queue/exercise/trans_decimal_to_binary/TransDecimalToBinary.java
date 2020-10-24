package session11_list_stack_and_queue.exercise.trans_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class TransDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Decimal :");
        int inputNumber = scanner.nextInt();
        Trans(inputNumber);

    }

    public static void Trans(int inputNumber) {
        Stack<Integer> myStack = new Stack();
        int div = 0;
        while (inputNumber > 0) {
            div = inputNumber % 2;
            myStack.push(div);
            inputNumber = inputNumber / 2;
        }
        for (Integer integer : myStack) {
            System.out.print(integer);
        }
    }
}
