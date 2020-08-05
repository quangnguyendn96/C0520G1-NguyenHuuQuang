package controllers;


import libs.MovieTheater;
import models.FileHouseUtils;
import models.FileRoomUtils;
import models.FileVillaUtils;

import java.util.Scanner;

public class PathController {

    public static void addNewService(Scanner scanner) {
        String inputMenu;

        do {
            System.out.println("------------ Add New Service --------------");
            System.out.print("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n" +
                    "Enter the number : ");
            inputMenu = scanner.nextLine();
            switch (inputMenu) {
                case "1":
                    FileVillaUtils.addNewServiceVilla(scanner);
                    break;
                case "2":
                    FileHouseUtils.addNewServiceHouse(scanner);
                    break;
                case "3":
                    FileRoomUtils.addNewServiceRoom(scanner);
                    break;
                case "4":
                    MainController.displayMainMenu(scanner);
                    break;
                case "5":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error number");
            }
        }
        while (inputMenu.equals("-1"));
        MainController.displayMainMenu(scanner);
    }


    public static void showServices(Scanner scanner) {


        String inputMenu;
        do {
            System.out.println("---------- Show all service--------");
            System.out.print("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Room Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n" +
                    "Enter the number : ");

            inputMenu = scanner.nextLine();
            switch (inputMenu) {

                case "1":
                    FileVillaUtils.showAllVilla();
                    break;
                case "2":
                    FileHouseUtils.showAllHouse();
                    break;
                case "3":
                    FileRoomUtils.showAllRoom();
                    break;
                case "4":
                    FileVillaUtils.showDuplicateHouse();
                    break;
                case "5":
                    FileHouseUtils.showDuplicateHouse();
                    break;
                case "6":
                    FileRoomUtils.showDuplicateRoom();
                    break;
                case "7":
                    MainController.displayMainMenu(scanner);
                    break;
                case "8":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong input");

            }
        } while (!inputMenu.equals("-1"));
    }

    public static void movieTheater(Scanner scanner) {
        String input;
        do {
            System.out.println("-----------Movie theater-----------");
            System.out.print("1.\tAdd new ticket\n" +
                    "2.\tShow list ticket\n" +
                    "3.\tExit to menu\n" +
                    "Enter number :");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    MovieTheater.sellTicket();
                    break;
                case "2":
                    MovieTheater.getCustomer();
                    break;
                case "3":
                    MainController.displayMainMenu(scanner);
                    break;
                default:
                    System.out.println("Error Input");
            }
        }
        while (!input.equals("-1"));
    }
}
