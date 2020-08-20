package models;

import commons.ReadAndWrite;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FileVillaUtils {
    public static final String FILE_VILLA = "src/data/villa.csv";

    public static void addNewServiceVilla(Scanner scanner) {
        System.out.println("------------- Add New Service Villa --------------");
        ReadAndWrite.writeFile(scanner, FILE_VILLA);
    }

    public static void showAllVilla() {

        System.out.println("-------------Show all villa------------");
        String str = String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Type Service", "Area Room", "Price Rents", "Maximum customer",
                "Type Rents", "Standard Room", "Convenience", "Area Swimming", "Number Floor");
        str += System.lineSeparator();
        List<Services> villa = ReadAndWrite.readFile(FILE_VILLA);

        for (Services villas : villa) {
            str += villas.showInfor();
            str += System.lineSeparator();
        }
        System.out.println(str);
    }
    public static void showDuplicateHouse(){
        List<Services> myListVilla = ReadAndWrite.readFile(FILE_VILLA);
        TreeSet<Services> myVilla = new TreeSet<>(Comparator.comparing(Services::getTypeService));
        for(Services villas : myListVilla){
            myVilla.add(villas);
        }
        for (Services villa : myVilla){
            System.out.println(villa.showInfor());
        }
    }
}
