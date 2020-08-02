package libs;

import java.util.Queue;

import java.util.LinkedList;
import java.util.Scanner;


public class MovieTheater {
    static Scanner scn = new Scanner(System.in);
    static Queue myQueue = new LinkedList();

    public static void sellTicket() {
        System.out.print("Enter name customer : ");
        String name = scn.nextLine();

        myQueue.offer(name);

    }

    public static void getCustomer() {
        int i = 1;
        while (!myQueue.isEmpty()) {
            System.out.println(i + ". " + myQueue.poll());
            i++;
        }
    }
}
