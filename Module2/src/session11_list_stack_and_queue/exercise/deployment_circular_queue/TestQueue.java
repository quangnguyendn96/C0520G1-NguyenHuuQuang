package session11_list_stack_and_queue.exercise.deployment_circular_queue;

public class TestQueue {
    static class Node {
         int data;
         Node link;
    }

    static class Queue {
         Node front;
         Node rear;
    }

    public static void enQueue(int index, Queue element) {
        Node temp = new Node();
        temp.data = index;
        if (element.front == null) {
            element.front = temp;
        } else {
            element.rear.link = temp;
        }
            element.rear = temp;
            element.rear.link = element.front;
        }

    public static int deQueue(Queue element) {
        if (element.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (element.front == element.rear) {
            value = element.front.data;
            element.front = null;
            element.rear = null;
        } else {
            Node temp = element.front;
            value = temp.data;
            element.front = element.front.link;
            element.rear.link = element.front;
        }
        return value;
    }

    static void displayQueue(Queue element) {
        Node temp = element.front;
        System.out.println("Elements in Circular Queue are: ");
        while(temp.link != element.front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
        Queue queue = new Queue();

//        queue.front = queue.rear = null;

        enQueue(12, queue);
        enQueue(10, queue);
        enQueue(24, queue);
        enQueue(1, queue);
        displayQueue(queue);

        System.out.println("Deleted value " + deQueue(queue));
        System.out.println("Deleted value " + deQueue(queue));

        displayQueue(queue);

        enQueue(2, queue);
        enQueue(13, queue);
        displayQueue(queue);
    }
}

