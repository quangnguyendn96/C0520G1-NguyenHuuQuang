package list_stack_and_queue.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
        Queue<Integer> myQueue = new LinkedList();

    }
}
