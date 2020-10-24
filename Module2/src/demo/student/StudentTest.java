package demo.student;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        Scanner scn = new Scanner(System.in);
        String input;
        do {
            System.out.print("1.\tAdd\n" +
                    "2.\tEdit\n" +
                    "3.\tDelete\n" +
                    "4.\tExit\n" +
                    "Enter input");
            input = scn.nextLine();
            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Error");
            }
        } while (input != "-1");
    }
    public static void addNewStudent(){

}
}


