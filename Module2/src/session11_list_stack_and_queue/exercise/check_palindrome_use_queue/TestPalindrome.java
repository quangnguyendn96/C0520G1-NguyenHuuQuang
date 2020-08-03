package session11_list_stack_and_queue.exercise.check_palindrome_use_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestPalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String inputString = scanner.nextLine();

        if(CheckPalindrome(inputString)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("Not is Palindrome");
        }
    }

    public static boolean CheckPalindrome(String inputString) {
        Stack myStack = new Stack();
        Queue myQueue = new LinkedList();


        for(int i = 0; i < inputString.length(); i++){
            myStack.push(inputString.charAt(i));
            myQueue.add(inputString.charAt(i));
        }
        boolean check = true;
        while(!myStack.isEmpty()){
            if(!myStack.pop().equals(myQueue.poll())){
                check = false;
                break;
            }
        }
        return check;
    }
}
