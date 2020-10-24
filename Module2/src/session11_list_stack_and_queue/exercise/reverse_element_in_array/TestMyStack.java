package session11_list_stack_and_queue.exercise.reverse_element_in_array;

public class TestMyStack {
    public static class Integer {
        private int input;

        public Integer(int input) {
            this.input = input;
        }

        public int getInput() {
            return input;
        }
    }

    public static void main(String[] args) {
        Integer integerInput = new Integer(1);
        Integer integerInput1 = new Integer(2);
        Integer integerInput2 = new Integer(3);
        Integer integerInput3 = new Integer(4);
        Integer integerInput4 = new Integer(5);
        MyStack<Integer> myStack = new MyStack<>();

        System.out.println(myStack.size());
        myStack.pushElement(integerInput);

        System.out.println(myStack.size());

        myStack.pushElement(integerInput1);
        myStack.pushElement(integerInput2);
        myStack.pushElement(integerInput3);
        myStack.pushElement(integerInput4);
//
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        for(int i = 0; i < myStack.size(); i++){
//            Integer myInteger = (Integer) myStack.elements[i];
//            System.out.println(myInteger.getInput());
    }
}
//}
