package commons;

import controllers.CheckValuedate;
import models.Services;
import models.FileHouseUtils;
import models.House;
import models.FileRoomUtils;
import models.Room;
import models.Room.FreeServiceIncluded;
import models.FileVillaUtils;
import models.Villa;

import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";

    public static void writeFile(Scanner scanner, String FILE_BATH) {
        ArrayList<Room> listRoom = new ArrayList<>();
        ArrayList<Villa> listVilla = new ArrayList<>();
        ArrayList<House> listHouse = new ArrayList<>();

        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        System.out.print("Enter name service(SVXX-YYYY) : ");
        String nameService = CheckValuedate.checkNameService();


        System.out.print("Enter area room : ");
        double areaRoom = CheckValuedate.checkArea();

        System.out.print("Enter cost rent($) : ");
        double cost = CheckValuedate.checkCost();

        System.out.print("Enter number customer: ");
        int numberCustomer = CheckValuedate.maxCustomer();

        System.out.print("Enter type rent(hours, day, month) : ");
        String typeRent = scanner.nextLine();

        if (FILE_BATH.equals(FileRoomUtils.FILE_ROOM)) {
            System.out.println("Free Service :");
            System.out.print("Karaoke(Yes/No) : ");
            String karaoke = scanner.nextLine();
            System.out.print("Massage :");
            String massage = scanner.nextLine();
            System.out.print("Food(Combo 1|Combo 2|Combo 3) : ");
            String food = scanner.nextLine();
            System.out.print("Water(Combo 1|Combo 2|Combo 3) : ");
            String water = scanner.nextLine();
            System.out.print("Car(Y/N) : ");
            String car = scanner.nextLine();
            String serviceFree = FreeServiceIncluded.toStringFreeService(karaoke, massage, food, water, car);

            listRoom.add(new Room(nameService, areaRoom, cost, numberCustomer, typeRent, serviceFree));
        } else {
            System.out.print("Enter standard room : ");
            String standardRoom = scanner.nextLine();

            System.out.print("Enter describe convenience : ");
            String convenience = scanner.nextLine();

            System.out.print("Enter number floor : ");
            int numberFloor = CheckValuedate.checkFloor();
            if (FILE_BATH.equals(FileHouseUtils.FILE_HOUSE)) {
                listHouse.add(new House(nameService, areaRoom, cost, numberCustomer, typeRent,
                        standardRoom, convenience, numberFloor));
            } else {
                System.out.print("Enter area swimming : ");
                double areaSwimming = CheckValuedate.checkArea();
                listVilla.add(new Villa(nameService, areaRoom, cost, numberCustomer,
                        typeRent, standardRoom, convenience, areaSwimming, numberFloor));
            }
        }

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            if (FILE_BATH.equals(FileRoomUtils.FILE_ROOM)) {
                for (Room room : listRoom) {
                    serviceGeneral(stringBuilder, room.getArea(), room.getPriceRents(), room.getMaxNumberOfCustomer(), room.getTypeRents(), room.getTypeService());
                    stringBuilder.append(room.getToStringFreeService());
                    stringBuilder.append(NEW_LINE_SEPARATOR);
                }
            } else if (FILE_BATH.equals(FileHouseUtils.FILE_HOUSE)) {
                for (House house : listHouse) {
                    serviceGeneral(stringBuilder, house.getArea(), house.getPriceRents(), house.getMaxNumberOfCustomer(), house.getTypeRents(), house.getTypeService());
                    stringBuilder.append(house.getStandardRoom());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(house.getConvenience());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(house.getNumberFloor());
                    stringBuilder.append(NEW_LINE_SEPARATOR);
                }
            } else {
                for (Villa villa : listVilla) {
                    serviceGeneral(stringBuilder, villa.getArea(), villa.getPriceRents(), villa.getMaxNumberOfCustomer(), villa.getTypeRents(), villa.getTypeService());
                    stringBuilder.append(villa.getStandardRoom());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(villa.getConvenience());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(villa.getAreaSwimming());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(villa.getNumberFloor());
                    stringBuilder.append(NEW_LINE_SEPARATOR);
                }

            }
            bufferedWriter.append(stringBuilder);
            System.out.println("CSV file was created successfully !!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (
                IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }

    }

    private static void serviceGeneral(StringBuilder stringBuilder, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String typeService) {
        stringBuilder.append(typeService);
        stringBuilder.append(COMMA_DELIMITER);
        stringBuilder.append((area));
        stringBuilder.append(COMMA_DELIMITER);
        stringBuilder.append((priceRents));
        stringBuilder.append(COMMA_DELIMITER);
        stringBuilder.append(maxNumberOfCustomer);
        stringBuilder.append(COMMA_DELIMITER);
        stringBuilder.append(typeRents);
        stringBuilder.append(COMMA_DELIMITER);
    }


    public static List<Services> readFile(String FILE_BATH) {
      List<Services> list = new ArrayList<>();

        File fileRoom = new File(FILE_BATH);
        String[] arrayTemp;

        try {
            if
            (!fileRoom.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(fileRoom);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            if (FILE_BATH.equals(FileRoomUtils.FILE_ROOM)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arrayTemp = line.split(",");
                    Room room = new Room(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5]);
                    list.add(room);
                }
            } else if (FILE_BATH.equals(FileVillaUtils.FILE_VILLA)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arrayTemp = line.split(",");
                    Villa villa1 = new Villa(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5],
                            arrayTemp[6], Double.parseDouble(arrayTemp[7]), Integer.parseInt(arrayTemp[8]));
                    list.add(villa1);
                }

            } else {
                while ((line = bufferedReader.readLine()) != null) {
                    arrayTemp = line.split(",");
                    House house = new House(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5], arrayTemp[6]
                            , Integer.parseInt(arrayTemp[7]));
                    list.add(house);
                }
            }
           
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
