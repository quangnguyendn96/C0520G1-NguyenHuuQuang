package controllers;

import libs.CabinetDocument;
import models.customer.FileCustomerUtils;
import models.employee.FileEmployeeUtils;
import models.villa.FileVillaUtils;
import models.room.FileRoomUtils;
import models.house.FileHouseUtils;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMainMenu(scanner);
    }
    public static void displayMainMenu(Scanner scanner) {

        String inputMenu;
        do {
            System.out.println("-------------- Display Main Menu ----------------");
            System.out.print("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tSearch Information of Employee\n" +
                    "8.\tExit\n" +
                    "Enter the number : ");


            inputMenu = scanner.nextLine();
            switch (inputMenu) {
                case "1":
                    PathController.addNewService(scanner);
                    break;
                case "2":
                    PathController.showServices(scanner);
                    break;
                case "3":
                    FileCustomerUtils.addNewCustomer();
                    break;
                case "4":
                    FileCustomerUtils.showInformationCustomers();
                    break;
                case "5":

//                    addNewBooking();
                    break;
                case "6":
                    FileEmployeeUtils.showInformationEmployee();
                    break;
                case "7":
                    CabinetDocument.searchEmployee();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("Error input");
            }
        }
        while (!inputMenu.equals("-1"));
    }

}




