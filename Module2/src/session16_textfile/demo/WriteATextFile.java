package session16_textfile.demo;

import javax.crypto.spec.PSource;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.*;

//
//public class TestFileClass {
//    public static void main(String[] args) {
//        java.io.File file = new java.io.File("image/us.gif");
//        System.out.println(file.exists());
//        System.out.println(file.length());
//        File dir = new File("Bookmarks");
//        dir.mkdir();
//        System.out.println(dir.getAbsolutePath());
//    }
//}
public class WriteATextFile {
    public static void main(String[] args) {
//        java.io.File file = new java.io.File("image/us.gif");
//        System.out.println(file.exists());
//        System.out.println(file.length());
        File dir = new File("Bookmarks");
        File text1 = new File("Bookmarks/testDemo.txt");
        dir.mkdir();
        try {
            FileWriter writer = new FileWriter("quangtest.txt");
            writer.write("!Hello");
            writer.close();
//            System.out.println();

            FileWriter writer1 = new FileWriter("textfile.txt");
            writer1.write("abc");
            writer1.write("\n");
            writer1.write("Hồ Thị Quỳnh Mai");
            writer1.write("\n");
            writer1.write(String.valueOf(24));
            writer1.write("\n");
            writer1.write("22/5/1995");
            writer1.write("\n");
            writer1.write("Address: Phan Thanh");
            writer1.close();

            FileWriter writer2 = new FileWriter(text1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}