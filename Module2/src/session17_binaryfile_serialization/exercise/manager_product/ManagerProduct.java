package session17_binaryfile_serialization.exercise.manager_product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    public static void main(String[] args) {
        File file = new File("src/session17_binaryfile_serialization/exercise/manager_product/listproduct.txt");
//        Product product = new Product();
        ArrayList<Product> products = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        int input = -1;
        do {
            System.out.print("1.Add new product\n" +
                    "2.Display product\n" +
                    "3.Search product\n" +
                    "4.Exit menu\n" +
                    "Enter the number: ");
            input = scn.nextInt();
            switch (input) {
                case 1:
                    addProduct(scn, file, products);
                    break;
                case 2:
                    displayProduct(file);
                    break;
                case 3:
                    searchProduct(file, scn);
                    break;
                case 4:
                    deleteProduct(file, scn);
                    break;
                case 5:
                    input = -1;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (input != -1);
    }

    public static void addProduct(Scanner scn, File file, ArrayList<Product> products) {

        System.out.println("Input name product");
        scn.nextLine();
        String name = scn.nextLine();
        System.out.println("Input id product");
        int id = scn.nextInt();
        scn.nextLine();
        System.out.println("Input manufacture");
        String manufacture = scn.nextLine();
        System.out.println("Input price");
        double price = scn.nextDouble();
        scn.nextLine();
        System.out.println("Describe other");
        String describe = scn.nextLine();
        products.add(new Product(name, id, manufacture, price, describe));

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayProduct(File file) {

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Product product1 = (Product) ois.readObject();
            ArrayList<Product> productions = (ArrayList<Product>) ois.readObject();
            for (Product product : productions) {
                System.out.println(product.toString());
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchProduct(File file, Scanner scn) {
        scn.nextLine();
        System.out.println("Input the name product");
        String nameSearch = scn.nextLine();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Product> productions = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
            for (Product product : productions) {
                if (nameSearch.equals(product.getName())) {
                    System.out.println(product.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteProduct(File file, Scanner scn) {
        scn.nextLine();
        System.out.println("Enter the name product want to delete");
        String nameDelete = scn.nextLine();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            ArrayList<Product> productions = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
            for (int i = 0; i < productions.size(); i++) {
                if (nameDelete.equals(productions.get(i).getName())) {
                    productions.remove(i);
                }
            }
            oos.writeObject(productions);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
