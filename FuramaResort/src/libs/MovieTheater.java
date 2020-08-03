package libs;

import controllers.MainController;
import controllers.PathController;
import models.customer.Customer;
import models.customer.SortCustomer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class MovieTheater {
    static Scanner scn = new Scanner(System.in);
    static Queue myQueue = new LinkedList();
    private static final String FILE_BATH = "src/data/customer.csv";

    public static void sellTicket() {

        System.out.println("----------------Display all customer----------------");
        List<Customer> listCustomersTicket = new ArrayList<>();
        File file = new File(FILE_BATH);
        String[] arr;
        String strOut = String.format("%18s%20s%10s%20s%20s%30s%20s%20s", "Name Customer", "Birthday", "Gender", "Id Customer",
                "Phone Number", "Email", "Type Customer", "Address Customer");
        strOut += System.lineSeparator();

        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not exist");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], (arr[3]), arr[4], arr[5], arr[6], arr[7]);
                listCustomersTicket.add(customer);
            }

            Collections.sort(listCustomersTicket, new SortCustomer());


            for (Customer customer1 : listCustomersTicket) {
                strOut += (customer1.showInfor());
                strOut += System.lineSeparator();
            }
            System.out.println(strOut);
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String idTicket;
        boolean checkStatus = false;
        do {
            System.out.print("Enter 'id customer' or 'name' to buy ticket or 'Exit' to back menu : ");
            idTicket = scn.nextLine();

            if (idTicket.equals("Exit")) {
                checkStatus = true;
            } else {
                for (int i = 0; i < listCustomersTicket.size(); i++) {
                    if (listCustomersTicket.get(i).getIdCustomer().equals(idTicket) || listCustomersTicket.get(i).getNameCustomer().equals(idTicket)) {
                        myQueue.offer(listCustomersTicket.get(i).getNameCustomer() + ", Id : " +
                                listCustomersTicket.get(i).getIdCustomer());
                        System.out.println("Succession");
                        checkStatus = false;
                    }
                }
            }
        }
        while (!checkStatus);
    }


    public static void getCustomer() {
        int i = 1;
        while (!myQueue.isEmpty()) {
            System.out.println(i + ".Name : " + myQueue.poll());
            i++;
        }
    }
}
