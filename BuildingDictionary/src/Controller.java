import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("1.\tLookup\n" +
                    "2.\tDefine\n" +
                    "3.\tDrop\n" +
                    "4.\tExit\n" +
                    "Action : ");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    String word = scanner.nextLine();
                    Lookup.searchDictionary(word);
                    break;
                case "2":
                    DefineDictionary.defineNewWord();
                    break;
                case "3":
                    break;
                case "4":
                    input = "-1";
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
        while (!"-1".equals(input));
    }

}
