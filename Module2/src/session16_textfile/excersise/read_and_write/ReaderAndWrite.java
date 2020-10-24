package session16_textfile.excersise.read_and_write;

import java.io.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ReaderAndWrite {
    public static void main(String[] args) {
        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/" +
                "src/session16_textfile/excersise/read_and_write/sourcefile");
        writeFile(readFile(file));
    }

    public static String readFile(File file) {
//
        StringBuffer stringBuffer = null;
        try {
            if
            (!file.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            stringBuffer = new StringBuffer();

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(stringBuffer);
    }

    public static void writeFile(String s) {

        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/" +
                "src/session16_textfile/excersise/read_and_write/targetfile");
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(s);

            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
