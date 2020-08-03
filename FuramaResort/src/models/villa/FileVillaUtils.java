package models.villa;

import commons.ReadAndWrite;
import java.util.Scanner;

public class FileVillaUtils {
    public static final String FILE_VILLA = "src/data/villa.csv";

    public static void addNewServiceVilla(Scanner scanner) {
        System.out.println("------------- Add New Service Villa --------------");
        ReadAndWrite.writeFile(scanner, FILE_VILLA);
    }

    public static void showAllVilla() {
        System.out.println("-------------Show all villa------------");
        ReadAndWrite.readFile(FILE_VILLA);

    }

}
