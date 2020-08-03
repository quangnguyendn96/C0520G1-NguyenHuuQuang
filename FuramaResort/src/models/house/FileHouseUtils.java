package models.house;

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
        ReadAndWrite.readFile(FILE_HOUSE);
    }
}
