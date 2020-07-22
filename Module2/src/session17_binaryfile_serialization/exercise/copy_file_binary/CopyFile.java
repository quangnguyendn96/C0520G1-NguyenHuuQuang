package session17_binaryfile_serialization.exercise.copy_file_binary;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyFile {
    public static final String linkFile = "src/session17_binaryfile_serialization/exercise/copy_file_binary/source_file";

    public static void main(String[] args) {
        File file = new File(linkFile);
        readAndWrite(file);
    }

    //    public static String readFile(File file) throws IOException {
//        byte[] buffer = new byte[1024];
//        FileInputStream fis = null;
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException("File not exsit");
//            }
//            fis = new FileInputStream(file);
////            buffer = new byte[1024];
//            fis.read(buffer);
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return Arrays.toString(fis.read(buffer));
//    }
//    public static void writeFile(FileInputStream fis){
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("src/session17_binaryfile_serialization/exercise/copy_file_binary/target_file");
//            while (fis != -1){
//
//            }
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
    public static void readAndWrite(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not exsit");
            }

            fis = new FileInputStream(file);
            fos = new FileOutputStream("src/session17_binaryfile_serialization/exercise/copy_file_binary/target_file");
//            int data = fis.read()
//            byte[] buffer = new byte[1024];

            while (fis.read() != -1) {
                fos.write(fis.read());
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
