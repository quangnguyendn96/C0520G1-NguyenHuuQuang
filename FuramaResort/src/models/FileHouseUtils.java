package models;

import commons.ReadAndWrite;

import java.util.Scanner;

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
}
