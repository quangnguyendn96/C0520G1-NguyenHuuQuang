package libs;

import models.Customer;
import models.FileCustomerUtils;
import models.SortCustomer;
import java.util.*;


public class MovieTheater {
    static Scanner scn = new Scanner(System.in);
    static Queue myQueue = new LinkedList();

    public static void sellTicket() {
        FileCustomerUtils.showInformationCustomers();

        List<Customer> listCustomersTicket = FileCustomerUtils.readCustomer();
        Collections.sort(listCustomersTicket, new SortCustomer());

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
