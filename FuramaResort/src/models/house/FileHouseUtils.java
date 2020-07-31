package models.house;

import controllers.CheckValuedate;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHouseUtils {
    private static final String FILE_BATH = "src/data/house.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    private static final String FILE_HEADER = "Type Service, Area Room, Price Rents, Maximum customer, Type Rents, Standard Room, Convenience, Type Service";
    static ArrayList<House> listHouse = new ArrayList<>();


    public static void addNewServiceHouse(Scanner scanner) {
        System.out.println("------------- Add New Service House --------------");
        scanner.nextLine();
        System.out.print("Enter name service(SVXX-YYYY)(HO) : ");
        String nameHouse = CheckValuedate.checkNameService();
        System.out.print("Enter area type service : ");
        double areaRoom = CheckValuedate.checkArea();
        System.out.print("Enter cost rent : ");
        double cost = CheckValuedate.checkCost();
        System.out.print("Enter number customer: ");
        int numberCustomer = CheckValuedate.maxCustomer();
        System.out.print("Enter type rent : ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter standard room : ");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter describe convenience : ");
        String convenience = scanner.nextLine();
        System.out.print("Enter number floor : ");
        int numberFloor = CheckValuedate.checkFloor();


        listHouse.add(new House(nameHouse, areaRoom, cost, numberCustomer, typeRent, standardRoom, convenience, numberFloor));
        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferdWrite = null;
        try {
            fileWriter = new FileWriter(file, false);
            StringBuilder stringBuilder = new StringBuilder();
            bufferdWrite = new BufferedWriter(fileWriter);
            stringBuilder.append(FILE_HEADER);
            stringBuilder.append(NEW_LINE_SEPARATOR);

            for (House house : listHouse) {

                stringBuilder.append(house.getTypeService());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getArea());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getPriceRents());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getMaxNumberOfCustomer());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getTypeRents());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getStandardRoom());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getConvenience());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(house.getNumberFloor());
                stringBuilder.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferdWrite.flush();
                bufferdWrite.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static void showAllHouse() {
        ArrayList<House> listHouse = new ArrayList<>();
        File file = new File(FILE_BATH);
        String[] arrayHouse;
        String str = "";
        try {
            if
            (!file.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayHouse = line.split(",");
                House house = new House(arrayHouse[0], Double.parseDouble(arrayHouse[1]), Double.parseDouble(arrayHouse[2]), Integer.parseInt(arrayHouse[3]), arrayHouse[4], arrayHouse[5], arrayHouse[6]
                        , Integer.parseInt(arrayHouse[7]));
                listHouse.add(house);
            }
for(House house : listHouse){
    System.out.println(house.showInfor());
}
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }
}