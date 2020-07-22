package session16_textfile.excersise.read_file_csv;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class DisplayCountry {
    public static String[] readCountry() {
        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/session16_textfile/excersise/read_file_csv/display_country");

        int index = 0;
        String[] arr = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arr[index] = line;
                index++;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return arr;
    }


//    public static void writeCountry(String arr) {
//        arr.split(",");
//        for (int i = 0; i < arr.length(); i++) {
//            for (int j = 0; j < arr[i].length(); j++) {
//
//            }
//        }
//        File file = new File("/Users/quangnguyen/Documents/GitHub/C0520G1-NguyenHuuQuang/Module2/src/session16_textfile/excersise/read_file_csv/write_display_country");
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
////            for (String ar : arr) {
////                for (String arr1 : ar) {
////                    bufferedWriter.write(arr1[4] + arr1[5]);
////                }
////            }
//            for (int i = 0; i < arr.length; i++) {
////bufferedWriter.write(arr[i][4]+ arr[i][5]); }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readCountry()));
//        writeCountry(readCountry());
    }
}
