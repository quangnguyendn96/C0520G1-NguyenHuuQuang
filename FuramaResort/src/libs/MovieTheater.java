package libs;

import sun.misc.Queue;

import java.util.Scanner;

public class MovieTheater {
    Scanner scn = new Scanner(System.in);
    Queue queue = new Queue();

    public void sellTicket() {
        System.out.println("Enter name customer : ");
        String name = scn.nextLine();
        queue.enqueue(name);

    }

    public void getCustomer() throws InterruptedException {
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
