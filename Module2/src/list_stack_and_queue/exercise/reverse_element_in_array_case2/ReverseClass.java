package list_stack_and_queue.exercise.reverse_element_in_array_case2;

import java.util.Scanner;
import java.util.Stack;

public class ReverseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String number ");
        String inputNumber = scanner.nextLine();

        String[] arrayString = inputNumber.split("");

        Stack<String> myStack = new Stack<>();
        for (int i = 0; i < arrayString.length; i++) {
            myStack.push(arrayString[i]);
        }
        myStack = reverse(myStack);
//        while (!myStack.isEmpty()) {
//            System.out.println(myStack.pop());

//    }
        for(int i =myStack.size()-1; i >= 0; i--){
            arrayString[i] = myStack.pop();
        }
//        for(int i =0 ; i < myStack.size(); i ++){
//            System.out.println(myStack.get(i));
//        }
        for(String outString: arrayString){
            System.out.println(outString);
        }
    }

    private static Stack<String> reverse(Stack<String> myStack) {
        Stack<String> stack1 = new Stack<>();
        while (!myStack.isEmpty()) {
            stack1.push(myStack.pop());
        }
        return stack1;
    }
}
