package models;

import commons.ReadAndWrite;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FileHouseUtils {
    public static final String FILE_HOUSE = "src/data/house.csv";

    public static void addNewServiceHouse(Scanner scanner) {
        System.out.println("----------Add new service house--------");
        ReadAndWrite.writeFile(scanner, FILE_HOUSE);
    }

    public static void showAllHouse() {
        System.out.println("----------Show all house--------");

        String str = String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Type Service", "Area Room", "Price Rents", "Maximum customer",
                "Type Rents", "Standard Room", "Convenience", "Number Floor");
        str += System.lineSeparator();
        for (Services house : ReadAndWrite.readFile(FILE_HOUSE)) {
            str += house.showInfor();
            str += System.lineSeparator();
        }
        System.out.println(str);
    }
    public static void showDuplicateHouse(){
        List<Services> myListHouse = ReadAndWrite.readFile(FILE_HOUSE);
        TreeSet<Services> myHouse = new TreeSet<>(Comparator.comparing(Services::getTypeService));
        for(Services room : myListHouse){
            myHouse.add(room);
        }
        for (Services room1 : myHouse){
            System.out.println(room1.showInfor());
        }
    }
}
