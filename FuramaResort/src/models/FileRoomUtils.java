package models;

import commons.ReadAndWrite;
import controllers.CheckValuedate;
import models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRoomUtils {
    public static final String FILE_ROOM = "src/data/room.csv";

    public static void addNewServiceRoom(Scanner scanner) {
        System.out.println("----------Add new service room--------");
        ReadAndWrite.writeFile(scanner, FILE_ROOM);
    }

    public static void showAllRoom() {
        System.out.println("----------Show all room--------");
        String str;
        str = String.format("%-20s%-20s%-20s%-20s%-20s%-100s", "Type Service", "Area Room", "Price Rents", "Maximum customer", "Type Rents", "FreeService");
        str += System.lineSeparator();
        for (Services room : ReadAndWrite.readFile(FILE_ROOM)) {
            str += room.showInfor();
            str += System.lineSeparator();
        }
        System.out.println(str);
    }
}
