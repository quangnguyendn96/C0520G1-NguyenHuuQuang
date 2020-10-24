import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Drop {
    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_BATH = "src/data/dictionary.txt";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void dropWord() {
        System.out.println("---------------Drop Word-------------");

        HashMap<String, Dictionary> dictionary = ReadAndWrite.ReadFileDictionary();

        Set<String> set = dictionary.keySet();

        System.out.print("Enter word want to drop : ");
        String wordDrop = scanner.nextLine();
        boolean check = false;
        for (String key : set) {
            if (key.equals(wordDrop)) {
                dictionary.remove(key);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Word is not exist");
        } else {
            System.out.println(wordDrop + " is drop succession");
        }

        //////////////////////////Update File////////////////////////////////////////////////////

        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<String> set1 = dictionary.keySet();
            for (String key : set1) {
                stringBuilder.append(key);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionary.get(key).pronounce);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionary.get(key).method);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionary.get(key).synonym);
                stringBuilder.append(NEW_LINE_SEPARATOR);
            }

            bufferedWriter.append(stringBuilder);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }
    }
}
