package commons;

import controllers.CheckValuedate;
import models.house.House;
import models.room.Room;
import models.villa.Villa;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    static ArrayList<Room> listRoom = new ArrayList<>();
    static ArrayList<Villa> listVilla = new ArrayList<>();
    static ArrayList<House> listHouse = new ArrayList<>();

    public static void addNewService(Scanner scanner, File FILE_BATH) {
        System.out.println("------------- Add New Service--------------");
        System.out.print("Enter name service(SVXX-YYYY) : ");
        String nameService = scanner.nextLine();
        CheckValuedate.checkNameService(nameService);

        System.out.print("Enter area room : ");
        double areaRoom = CheckValuedate.checkArea();

        System.out.print("Enter cost rent($) : ");
        double cost = CheckValuedate.checkCost();

        System.out.print("Enter number customer: ");
        int numberCustomer = CheckValuedate.maxCustomer();

        System.out.print("Enter type rent(hours, day, month) : ");
        String typeRent = scanner.nextLine();

        System.out.print("Enter standard room : ");
        String standardRoom = scanner.nextLine();

        System.out.print("Enter describe convenience : ");
        String convenience = scanner.nextLine();

        System.out.print("Enter area swimming : ");
        double areaSwimming = CheckValuedate.checkArea();

        System.out.print("Enter number floor : ");
        int numberFloor = CheckValuedate.checkFloor();

        listRoom.add(new Room(nameService, areaRoom, cost, numberCustomer, typeRent);
        listVilla.add(new Villa(nameService, areaRoom, cost, numberCustomer,
                typeRent, standardRoom, convenience, areaSwimming, numberFloor));
        listHouse.add(new House(nameService, areaRoom, cost, numberCustomer, typeRent,
                standardRoom, convenience, numberFloor));
        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
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

            }
            bufferedWriter.append(stringBuilder);

            System.out.println("CSV file was created successfully !!!");

        } catch (
                Exception e) {
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

    public static void showAllRoom(File FILE_BATH) {
        System.out.println("--------------Show all service--------------");
        ArrayList<Room> listRoom = new ArrayList<>();
        File fileRoom = new File(FILE_BATH);
        String[] arrayRoom;
        String str = String.format("%5s%20s%20s%20s%20s%20s", "Type Service", "Area Room", "Price Rents", "Maximum customer", "Type Rents");
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
                Room room = new Room(arrayRoom[0], Double.parseDouble(arrayRoom[1]), Double.parseDouble(arrayRoom[2]), Integer.parseInt(arrayRoom[3]), arrayRoom[4]);
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
