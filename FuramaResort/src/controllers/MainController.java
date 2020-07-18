package controllers;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu(Scanner scanner) {

        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n" +
                "Enter the number : ");
        int inputMenu = -1;
        do {
            inputMenu = scanner.nextInt();
            switch (inputMenu) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Error number");
            }
        }
        while (inputMenu != -1);
    }

    public void addNewServies(Scanner scanner) {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n" +
                "Enter the number");
        int inputMenu = -1;
        do {
            inputMenu = scanner.nextInt();
            switch (inputMenu) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu(scanner);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error number");
            }
        }
        while (inputMenu != -1);
    }

    public void showServices(Scanner scanner) {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n" +
                "Enter the number");
        int inputMenu;
        do {
            inputMenu = scanner.nextInt();
            switch (inputMenu) {

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    displayMainMenu(scanner);
                    break;
                case 8:
                    inputMenu = -1;
                    break;

            }
        }while (inputMenu != -1);

    }
}

