package libs;

import commons.ReadAndWrite;
import models.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Booking {
    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_BOOKING = "src/data/booking.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";

    public static void addNewBooking() {
        TreeMap<Integer, Customer> mapList = new TreeMap<>();
        System.out.println("-------------Show all customer--------------");
        String strOut = String.format("%-15s%-25s%-20s%-20s%-20s%-20s%-30s%-20s%-20s", "No.", "Name Customer", "Birthday", "Gender", "Id Customer",
                "Phone Number", "Email", "Type Customer", "Address Customer");
        strOut += System.lineSeparator();

        List<Customer> listTemp = FileCustomerUtils.readCustomer();
        Collections.sort(listTemp, new SortCustomer());
        int index = 1;
        for (Customer customer1 : listTemp) {
            mapList.put(index, customer1);
            index++;
        }
        Set<Integer> freqKey = mapList.keySet();
        for (Integer key : freqKey) {
            strOut += key;
            strOut += mapList.get(key).showInforWithIndex();
            strOut += System.lineSeparator();
        }
        System.out.println(strOut);

        System.out.print("Enter index customer :");
        String indexCustomer = scanner.nextLine();
        System.out.print("1\t.Villa\n" +
                "2\t.House\n" +
                "3\t.Room\n" +
                "Enter your choice : \n");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                choiceVilla(indexCustomer);
                break;
            case "2":

                break;
            case "3":
                break;
        }
    }

    public static void choiceVilla(String indexCustomer) {
        FileVillaUtils.showAllVilla();
        TreeMap<Integer, Services> myVilla = new TreeMap();
        List<Services> myServiceVilla = ReadAndWrite.readFile(FileVillaUtils.FILE_VILLA);
        int index = 1;
        for (Services servicesVilla : myServiceVilla) {
            myVilla.put(index, servicesVilla);
            index++;
        }
        System.out.print("Enter index service villa : ");
        String indexVilla = scanner.nextLine();

        Set<Integer> freqKey = myVilla.keySet();
        for (Integer integer : freqKey) {
            if (Integer.parseInt(indexVilla) == integer) {
                Customer.services = myVilla.get(integer);
            }
        }
        writeBook(myServiceVilla);
    }

//    public static void choiceHouse(String indexCustomer) {
//        FileHouseUtils.showAllHouse();
//        TreeMap<Integer, Villa> myHouse = new TreeMap();
//        List<Services> myServiceVilla = ReadAndWrite.readFile(FileHouseUtils.FILE_HOUSE);
//        int index = 1;
//        for (Services servicesVilla : myServiceVilla) {
//            myVilla.put(index, (Villa) servicesVilla);
//            index++;
//        }
//        System.out.print("Enter index service villa : ");
//        String indexVilla = scanner.nextLine();
//
//        Set<Integer> freqKey = myVilla.keySet();
//        for (Integer integer : freqKey) {
//            if (Integer.parseInt(indexVilla) == integer) {
//                Customer.services = myVilla.get(integer);
//            }
//        }
//        System.out.println(Customer.services.toString());
//    }

    public static void writeBook(List<Services> services) {
        File file = new File(FILE_BOOKING);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = null;
            stringBuilder.append(services.getTypeService());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(services.toString());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(Customer.services.toString());

            bufferedWriter.append(stringBuilder);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
