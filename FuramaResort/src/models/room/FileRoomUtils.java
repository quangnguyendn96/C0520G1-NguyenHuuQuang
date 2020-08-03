package models.room;

import commons.ReadAndWrite;
import controllers.CheckValuedate;

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
        ReadAndWrite.readFile(FILE_ROOM);
    }
}
