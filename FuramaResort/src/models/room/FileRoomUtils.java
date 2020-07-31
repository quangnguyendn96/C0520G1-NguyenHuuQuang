package models.room;

import controllers.CheckValuedate;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRoomUtils {
    private static final String FILE_BATH = "src/data/room.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    private static final String FILE_HEADER = "Type Service, Area Room, Price Rents, Maximum customer, Type Rents, Standard Room, Convenience, Type Service";
    static ArrayList<Room> listRoom = new ArrayList<>();

    public static void addNewServiceRoom(Scanner scanner) {
        System.out.println("------------- Add New Service Room --------------");
        scanner.nextLine();
        System.out.print("Enter name service(SVXX-YYYY)(RO) : ");
        String nameRoom = CheckValuedate.checkNameService();
        System.out.print("Enter area type service : ");
        double areRoom = CheckValuedate.checkArea();
        System.out.print("Enter cost rent : ");
        double cost = CheckValuedate.checkCost();
        System.out.print("Enter number customer: ");
        int numberCustomer = CheckValuedate.maxCustomer();
        System.out.print("Enter type rent : ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter free enclosed service : ");
        String freeService = scanner.nextLine();


        listRoom.add(new Room(nameRoom, areRoom, cost, numberCustomer, typeRent, freeService));
        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();

            for (Room room : listRoom) {

                stringBuilder.append(room.getTypeService());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append((room.getArea()));
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(room.getPriceRents());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(room.getMaxNumberOfCustomer());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(room.getTypeRents());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(room.getFreeService());
                stringBuilder.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.append(stringBuilder);

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static void showAllRoom() {
        System.out.println("--------------Show all room--------------");
        ArrayList<Room> listRoom = new ArrayList<>();
        File fileRoom = new File(FILE_BATH);
        String[] arrayRoom;
        String str = String.format("%5s%20s%20s%20s%20s%20s", "Type Service", "Area Room", "Price Rents", "Maximum customer", "Type Rents", "Free Service");
        str += System.lineSeparator();

        try {
            if
            (!fileRoom.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(fileRoom);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayRoom = line.split(",");
                Room room = new Room(arrayRoom[0], Double.parseDouble(arrayRoom[1]), Double.parseDouble(arrayRoom[2]), Integer.parseInt(arrayRoom[3]), arrayRoom[4], arrayRoom[5]);
                listRoom.add(room);
            }
            for (Room room : listRoom) {
                str += room.showInfor();
                str += System.lineSeparator();
            }
            System.out.println(str);
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
