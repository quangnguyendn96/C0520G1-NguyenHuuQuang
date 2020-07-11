package list_stack_and_queue.exercise.reverse_element_in_array;


import java.util.Arrays;

public class MyStack<E> {
    private int size =0;
    public Object[] elements;
    private final static int capacity = 5;
    MyStack(){};
    MyStack(int size) {
        this.size = size;
        elements = new Object[capacity];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size() {
        return this.size;
    }
//    public boolean isFull(){
//        if(size = elements )
//    }


    public void pushElement(E element) {
        elements[size] = element;
        size++;
    }

    public E pop() {
        return (E) elements[size - 1];
    }
}


//
//    p
//    public int pop() {
//        if (isEmpty()) {
//            System.out.println("Stack is null!!!");
//        }
//        return arr[--index];
//    }
//
//    public static void main(String[] args) {
//
//        MyStack stack = new MyStack(5);
//        MyStack stack1 = new MyStack(5);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(5);
//        stack.push(5);
////        stack.push(5);
//        for (int i = 0; i < stack.isLength(); i++) {
//            System.out.println(stack.arr[i]);
//        }
//        System.out.println("--------");
//        stack1.push(stack.pop());
//        stack1.push(stack.pop());
//        stack1.push(stack.pop());
//        stack1.push(stack.pop());
//        stack1.push(stack.pop());
//        for (int i = 0; i < stack1.isLength(); i++) {
//            System.out.println(stack1.arr[i]);
//        }
//    }
//}
