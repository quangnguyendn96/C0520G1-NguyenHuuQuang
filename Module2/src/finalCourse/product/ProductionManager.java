package finalCourse.product;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ProductionManager {
    public static void main(String[] args) {
        String input;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.print("1.\tAdd new product\n" +
                    "2.\tDelete product\n" +
                    "3.\tDisplay list product\n" +
                    "4.\tSearch product\n" +
                    "5.\tExit\n" +
                    "Enter input :");
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
                case "5":
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }
        while (input.equals("-1"));
    }
}}
