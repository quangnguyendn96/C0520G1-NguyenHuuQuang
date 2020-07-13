package list_stack_and_queue.exercise.count_appear_of_char_in_string;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TestCountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String inputString = scanner.nextLine().toLowerCase();
        Character eachChar;
        int freq = 1;

        TreeMap<Character, Integer> myMap = getCharacterInTreeMap(inputString);
        Set<Character> freqKey = myMap.keySet();
        for(Character key : freqKey){
            System.out.println("Frequence of charactor "+ key + " is " + myMap.get(key));
        }
    }

    public static TreeMap<Character, Integer> getCharacterInTreeMap(String inputString) {
        Character eachChar;
        int freq = 1;
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            eachChar = inputString.charAt(i);
            if (eachChar != ' ') {
                if (myMap.containsKey(eachChar)) {
                    freq = myMap.get(eachChar);
                    freq++;
                } else {
                    freq = 1;
                }
                myMap.put(eachChar, freq);
            }
        }
        return myMap;
    }
}
