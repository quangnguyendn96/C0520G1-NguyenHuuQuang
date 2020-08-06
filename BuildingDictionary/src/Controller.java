import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("----------------Main Menu----------------");
            System.out.print("1.\tLookup word\n" +
                    "2.\tDefine new word\n" +
                    "3.\tDrop word\n" +
                    "4.\tDisplay dictionary\n" +
                    "5.\tExit\n" +
                    "Action : ");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    Lookup.searchDictionary();
                    break;
                case "2":
                    DefineDictionary.defineNewWord();
                    break;
                case "3":
                    Drop.dropWord();
                    break;
                case "4" :
                    DefineDictionary.showDictionary();
                    break;
                case "5":
                    input = "-1";
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
        while (!"-1".equals(input));
    }

}
