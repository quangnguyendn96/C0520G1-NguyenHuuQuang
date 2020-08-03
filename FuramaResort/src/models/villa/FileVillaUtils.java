package models.villa;

import controllers.CheckValuedate;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileVillaUtils {
    private static final String FILE_BATH = "src/data/villa.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    static ArrayList<Villa> listVilla = new ArrayList<>();

    public static void addNewServiceVilla(Scanner scanner) {
        System.out.println("------------- Add New Service Villa --------------");
        System.out.print("Enter name service(SVXX-YYYY)(VL) : ");
        String nameVilla = scanner.nextLine();
        CheckValuedate.checkNameService(nameVilla);
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


        listVilla.add(new Villa(nameVilla, areaRoom, cost, numberCustomer, typeRent, standardRoom, convenience, areaSwimming, numberFloor));
        File file = new File(FILE_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            StringBuilder stringBuilder = new StringBuilder();
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : listVilla) {

                stringBuilder.append(villa.getTypeService());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append((villa.getArea()));
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append((villa.getPriceRents()));
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getMaxNumberOfCustomer());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getTypeRents());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getStandardRoom());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getConvenience());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getAreaSwimming());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(villa.getNumberFloor());
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

    public static void showAllVilla() {
        System.out.println("-------------Show all villa------------");
        ArrayList<Villa> listVilla = new ArrayList<>();
        File file = new File(FILE_BATH);
        String[] arrayVilla;
        String str = String.format("%5s%20s%20s%20s%20s%20s%20s%20s%20s", "Type Service", "Area Room", "Price Rents", "Maximum customer", "Type Rents", "Standard Room", "Convenience", "Area Swimming", "Number FLoor");
        str += System.lineSeparator();
        try {
            if
            (!file.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayVilla = line.split(",");
                Villa villa1 = new Villa(arrayVilla[0], Double.parseDouble(arrayVilla[1]), Double.parseDouble(arrayVilla[2]), Integer.parseInt(arrayVilla[3]), arrayVilla[4], arrayVilla[5],
                        arrayVilla[6], Double.parseDouble(arrayVilla[7]), Integer.parseInt(arrayVilla[8]));
                listVilla.add(villa1);
            }
            for (Villa villa : listVilla) {
                str += (villa.showInfor());
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
