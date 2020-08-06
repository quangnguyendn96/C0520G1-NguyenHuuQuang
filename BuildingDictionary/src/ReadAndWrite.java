
import java.io.*;
import java.util.Set;
import java.util.HashMap;

public class ReadAndWrite {
    public static final String FILE_BATH = "src/data/dictionary.txt";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";


    public static HashMap<String, Dictionary> ReadFileDictionary() {
        File file = new File(FILE_BATH);
        HashMap<String, Dictionary> dictionary = new HashMap<>();

        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            String[] arrTemp;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                Dictionary dictionary1 = new Dictionary(arrTemp[1], arrTemp[2], arrTemp[3]);
                dictionary.put(arrTemp[0], dictionary1);
            }
        } catch (FileNotFoundException e) {
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionary;
    }

    public static void WriteFileDictionary(HashMap<String, Dictionary> dictionaryList) {
        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<String> set = dictionaryList.keySet();

            for (String key : set) {
                stringBuilder.append(dictionaryList.get(key).wordInput);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionaryList.get(key).pronounce);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionaryList.get(key).method);
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(dictionaryList.get(key).synonym);
                stringBuilder.append(NEW_LINE_SEPARATOR);
            }

            bufferedWriter.append(stringBuilder);
            System.out.println("File was written succession");
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
