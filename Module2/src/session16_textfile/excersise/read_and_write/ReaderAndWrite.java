package session16_textfile.excersise.read_and_write;

import java.io.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderAndWrite {
    public static void main(String[] args) {
        writeFile(readFile());
    }

    public static String readFile() {
        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/session16_textfile/excersise/read_and_write/sourcefile");
        StringBuffer stringBuffer = null;
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(stringBuffer);
    }

    public static void writeFile(String s) {

        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/session16_textfile/excersise/read_and_write/targetfile");
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
