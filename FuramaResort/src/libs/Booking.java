package libs;

import commons.ReadAndWrite;
import models.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Booking {
    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_BOOKING = "src/data/booking.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    static TreeMap<Integer, Customer> mapList = new TreeMap<>();

    public static void addNewBooking() {

        System.out.println("-------------Show all customer--------------");
        String strOut = String.format("%-10s%-25s%-20s%-20s%-20s%-20s%-30s%-20s%-20s", "No.", "Name Customer", "Birthday", "Gender", "Id Customer",
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
        System.out.print("1.\tVilla\n" +
                "2.\tHouse\n" +
                "3.\tRoom\n" +
                "Enter your choice : ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                choiceVilla(indexCustomer);
                break;
            case "2":
                choiceHouse(indexCustomer);
                break;
            case "3":
                choiceRoom(indexCustomer);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public static void choiceVilla(String indexCustomer) {

        int indexTempCustomer = Integer.parseInt(indexCustomer);

        TreeMap<Integer, Services> myVilla = new TreeMap();
        List<Services> myServiceVilla = ReadAndWrite.readFile(FileVillaUtils.FILE_VILLA);
        int index = 1;
        for (Services servicesVilla : myServiceVilla) {
            myVilla.put(index, servicesVilla);
            index++;
        }

        String strOut = String.format("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "No.", "Type Service", "Area Room", "Price Rents", "Maximum customer",
                "Type Rents", "Standard Room", "Convenience", "Area Swimming", "Number Floor");
        strOut += System.lineSeparator();
        Set<Integer> freqKeyVilla = myVilla.keySet();
        for (Integer key : freqKeyVilla) {
            strOut += key;
            strOut += myVilla.get(key).showInforWithIndex();
            strOut += System.lineSeparator();
        }
        System.out.println(strOut);

        System.out.print("Enter index service villa : ");
        String indexVilla = scanner.nextLine();

        Set<Integer> freqKey = myVilla.keySet();
        for (Integer integer : freqKey) {
            if (Integer.parseInt(indexVilla) == integer) {
                Customer.services = myVilla.get(integer);
            }
        }
        writeBook(indexTempCustomer);


    }

    public static void choiceHouse(String indexCustomer) {
        int indexTempCustomer = Integer.parseInt(indexCustomer);
        System.out.println("----------Show all house--------");

        TreeMap<Integer, House> myHouse = new TreeMap();
        List<Services> myServiceHouse = ReadAndWrite.readFile(FileHouseUtils.FILE_HOUSE);
        int index = 1;
        for (Services servicesHouse : myServiceHouse) {
            myHouse.put(index, (House) servicesHouse);
            index++;
        }
        String strOut = String.format("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "No1.", "Type Service", "Area Room", "Price Rents", "Maximum customer",
                "Type Rents", "Standard Room", "Convenience", "Number Floor");
        strOut += System.lineSeparator();
        Set<Integer> freqKeyVilla = myHouse.keySet();
        for (Integer key : freqKeyVilla) {
            strOut += key;
            strOut += myHouse.get(key).showInforWithIndex();
            strOut += System.lineSeparator();
        }
        System.out.println(strOut);

        System.out.print("Enter index service house : ");
        String indexHouse = scanner.nextLine();

        Set<Integer> freqKey = myHouse.keySet();
        for (Integer integer : freqKey) {
            if (Integer.parseInt(indexHouse) == integer) {
                Customer.services = myHouse.get(integer);
            }
        }
        writeBook(indexTempCustomer);
    }

    public static void choiceRoom(String indexCustomer) {
        int indexTempCustomer = Integer.parseInt(indexCustomer);

        TreeMap<Integer, Room> myRoom = new TreeMap();
        List<Services> myServiceRoom = ReadAndWrite.readFile(FileRoomUtils.FILE_ROOM);
        int index = 1;
        for (Services serviceRoom : myServiceRoom) {
            myRoom.put(index, (Room) serviceRoom);
            index++;
        }
        String strOut = String.format("%-10s%-20s%-20s%-20s%-20s%-20s%-100s", "No1.", "Type Service", "Area Room", "Price Rents", "Maximum customer", "Type Rents", "FreeService");
        strOut += System.lineSeparator();
        Set<Integer> freqKeyVilla = myRoom.keySet();
        for (Integer key : freqKeyVilla) {
            strOut += key;
            strOut += myRoom.get(key).showInforWithIndex();
            strOut += System.lineSeparator();
        }
        System.out.println(strOut);

        System.out.print("Enter index service room : ");
        String indexRoom = scanner.nextLine();
        Set<Integer> freqKey = myRoom.keySet();
        for (Integer integer : freqKey) {
            if (Integer.parseInt(indexRoom) == integer) {
                Customer.services = myRoom.get(integer);
            }
        }
        writeBook(indexTempCustomer);
    }

    public static void writeBook(int indexTempCustomer) {
        File file = new File(FILE_BOOKING);
        FileWriter fileWriter = null;

        BufferedWriter bufferedWriter = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            stringBuilder.append(mapList.get(indexTempCustomer).getNameCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getIdCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getDayOfBirth());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getGender());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getIdCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getPhoneNumberCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getEmail());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getTypeOfCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(mapList.get(indexTempCustomer).getAddressCustomer());
            stringBuilder.append(COMMA_DELIMITER);
            stringBuilder.append(Customer.services.toString());
            stringBuilder.append(NEW_LINE_SEPARATOR);

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
}
