//package java_collection_framwork_map_tree.exercise.manager_product_with_linkedlist;
//
//import javax.xml.crypto.dsig.keyinfo.KeyValue;
//import java.util.*;
//
//public class TestProduct {
//    public static void main(String[] args) {
//        ArrayList<Product> products = new ArrayList<>();
////        HashMap<Product, KeyValue> hashMap = new HashMap();
//
//        Product product = new Product("Toshiba", 1, 12.5);
//        Product product1 = new Product("Samsung", 2, 12.1);
//        Product product2 = new Product("Sony", 3, 10);
//        products.add(product);
//        products.add(product1);
//        products.add(product2);
//
//        Scanner scanner = new Scanner(System.in);
//        TestProduct testProduct = new TestProduct();
//        int exit = 1;
//        do {
//            System.out.println(
//                    "1.Add new product" + "\n" +
//                            "2.Delete product" + "\n" +
//                            "3.Edit product" + "\n" +
//                            "4.Search product" + "\n" +
//                            "5.Arranger product" + "\n" +
//                            "7.Exit menu" + "\n" +
//                            "Enter the number : ");
//            int input = scanner.nextInt();
//            switch (input) {
//                case 1:
//                    addProduct(products, scanner);
//                    break;
//                case 2:
//                    deleteProduct(products, scanner);
//                    break;
//                case 3:
//                    editProduct(products, scanner);
//                    break;
//                case 4:
//                    searchProduct(products, scanner);
//                    break;
//                case 5:
//                    arrangerProduct(products);
//                    break;
//                case 6:
//                    System.exit(0);
//                default:
//                    System.out.println("Enter the number");
//
//            }
//
//        }
//        while (exit == 1);
//    }
//
//    public static void addProduct(ArrayList<Product> products, Scanner scanner) {
//        System.out.println("Enter the name :");
//        scanner.nextLine();
//        String inputName = scanner.nextLine();
//        System.out.println("Enter the code product : ");
//        boolean check = false;
//        int codeProduct;
//        do {
//            codeProduct = scanner.nextInt();
//            for (int i = 0; i < products.size(); i++) {
//                if (codeProduct == products.get(i).getCodeProduct()) {
//                    check = true;
//                    System.out.println("Enter the code product");
//                } else {
//                    check = false;
//                }
//            }
//        }
//        while (check);
//
//        scanner.nextLine();
//        System.out.println("Enter the kind product : ");
//        double kindProduct = scanner.nextDouble();
//
//        products.add(new Product(inputName, codeProduct, kindProduct));
//        display(products);
//    }
//
//    public static void deleteProduct(ArrayList<Product> products, Scanner scanner) {
//        System.out.println("Enter the code product want to delete");
//        int deleteProduct = scanner.nextInt();
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getCodeProduct() == deleteProduct) {
//                products.remove(i);
//            }
//        }
//        display(products);
//    }
//
//    public static void editProduct(ArrayList<Product> products, Scanner scanner) {
//        System.out.println("Enter the codeProduct want to edit : ");
//        int inputId = scanner.nextInt();
//        for (int i = 0; i < products.size(); i++) {
//            if (inputId == products.get(i).getCodeProduct()) {
//                scanner.nextLine();
//                System.out.println("Enter the new name product:");
//                String inputName = scanner.nextLine();
//                System.out.println("Enter the new code product : ");
//                int codeProduct = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Enter the new kind product : ");
//                double kindProduct = scanner.nextDouble();
//                products.get(i).setNameProduct(inputName);
//                products.get(i).setCodeProduct(codeProduct);
//                products.get(i).setPriceProduct(kindProduct);
//            }
//        }
//        display(products);
//    }
//
//    public static void display(ArrayList<Product> products) {
//        for (Product product : products) {
//            System.out.println(product.toString());
//        }
//    }
//
//    public static void searchProduct(ArrayList<Product> products, Scanner scanner) {
//        System.out.println("Enter the code product want to delelte : ");
//        int inputCode = scanner.nextInt();
//
//        for (int i = 0; i < products.size(); i++) {
//            if (inputCode == products.get(i).getCodeProduct()) {
//                System.out.println(products.get(i).toString());
//
//            }
//        }
//    }
//
//    public static void arrangerProduct(ArrayList<Product> products) {
//        Collections.sort(products);
//        display(products);
//    }
//}
//
