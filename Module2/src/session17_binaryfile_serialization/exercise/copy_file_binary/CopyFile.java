package session17_binaryfile_serialization.exercise.copy_file_binary;

import java.io.*;

public class CopyFile {
    public static final String linkFile = "src/session17_binaryfile_serialization/exercise/copy_file_binary/source_file";

    public static void main(String[] args) throws IOException {
        File file = new File(linkFile);
//        readAndWrite(file);
        writeFile(readFile(file));

    }

        public static FileInputStream readFile(File file) throws IOException {
//        byte[] buffer = new byte[1024];
        FileInputStream fis = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not exsit");
            }
            fis = new FileInputStream(file);
            fis.read();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fis;
    }
    public static void writeFile(FileInputStream fis) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/session17_binaryfile_serialization/exercise/copy_file_binary/target_file");
            while (fis.read() != -1) {
                fos.write(fis.read());
            }
        System.out.println("Copy succession");
        fos.close();
    }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void readAndWrite(File file) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
//FileWriter fileWriter = new FileWriter("src/session17_binaryfile_serialization/exercise/copy_file_binary/target_file");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not exsit");
            }
            fis = new FileInputStream(file);
            fos = new FileOutputStream("src/session17_binaryfile_serialization/exercise/copy_file_binary/target_file");
            int data = fis.read();
//            byte[] buffer = new byte[1024];
//           BufferedWriter bw = new BufferedWriter(fileWriter);


            while (data!= -1) {
                fos.write(data);
//                bw.write(fis.read());
            }
            System.out.println("Copy succession");
            fos.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
