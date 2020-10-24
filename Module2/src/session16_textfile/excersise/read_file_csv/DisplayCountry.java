package session16_textfile.excersise.read_file_csv;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class DisplayCountry {
    public static String readCountry() {
        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/" +
                "session16_textfile/excersise/read_file_csv/display_country");

        String[] arr = null;
        String str = "";
        try {
            if(!file.exists()){
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                str += arr[4] + " " + arr[5] + System.lineSeparator();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    public static void writeCountry(String str) {
        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/" +
                "session16_textfile/excersise/read_file_csv/write_display_country.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeCountry(readCountry());

    }
}
