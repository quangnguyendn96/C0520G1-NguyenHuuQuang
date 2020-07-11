package list_stack_and_queue.exercise.count_appear_of_char_in_string;

import java.util.Scanner;
import java.util.TreeMap;

public class TestCountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split("");
        TreeMap<Integer, Character> myMap = new TreeMap<>();

        for(int i = 0; i < inputString.length(); i++) {
            char eachChar = inputString.charAt(i);
            String character = Character.toString(eachChar).toUpperCase();
        }
        Integer b = 0;


//            Character b = myMap.get(inputString.charAt(i));
//            if( myMap.get(inputString.charAt(i))!= null){

            }
        }
