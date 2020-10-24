package session13_search_alogrithms.exercise;
import java.util.Scanner;

import java.util.*;
public class Searching {
    public static void main(String[] args) {

        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = inputString.nextLine();

        LinkedList<Character> arr = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if ((int)(string.charAt(j)) > (int)list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > arr.size()) {
                arr.clear();
                arr.addAll(list);
            }
            list.clear();
        }

        for (Character ar : arr) {
            System.out.print(ar);
        }
        System.out.println();
    }
}
