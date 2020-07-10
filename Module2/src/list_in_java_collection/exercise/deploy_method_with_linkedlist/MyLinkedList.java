package list_in_java_collection.exercise.deploy_method_with_linkedlist;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes = 0;

    public int getSize() {
        return numNodes;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(Object data) {
        Node temp = head;

        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }


    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;

        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {
        Node temp = head;
        Object data;
        if (index < 0 || index > numNodes) {
            System.out.println("Wrong index");
        }
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(Object data) {
        if (head.data.equals(data)) {
            remove(0);
            numNodes--;
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(data)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public MyLinkedList<E> clone(){
        if(numNodes == 0){
            System.out.println("LinkedList is all null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst(temp);
        temp = temp.next;
        while(temp != null){
            returnLinkedList.addLast((E)temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }
    public boolean constrains( Object data){
        Node temp = head;
        while(temp.next != null){
            if(temp.data.equals(data)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
//    public int indexOf(Object data){
//        Node temp = head;
//        for(int i = 0; i< numNodes; i++){
//            if(temp.e)
//        }
//    }
}
