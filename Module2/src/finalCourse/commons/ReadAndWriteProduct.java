package finalCourse.commons;

import finalCourse.product.ExportProduct;
import finalCourse.product.ImportProduct;
import finalCourse.product.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteProduct {
    public static final String FILE_PRODUCT = "src/finalCourse/data/product.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    static Scanner scanner = new Scanner(System.in);

    public static void writeFile(String typeProduct) {

        List<Product> listProduct = new ArrayList<>();

        File file = new File(FILE_PRODUCT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        System.out.print("Enter name product : ");
        String nameProduct = scanner.nextLine();

        System.out.print("Enter code product : ");
        String codeProduct = scanner.nextLine();

        System.out.print("Enter cost product($) : ");
        double priceProduct = scanner.nextDouble();

        System.out.print("Enter number product: ");
        String numberProduct = scanner.nextLine();

        System.out.print("Enter manufacture : ");
        String manufacture = scanner.nextLine();



        if (typeProduct.equals("ImportProduct")) {

            System.out.print("Price import :");
            String price = scanner.nextLine();
            System.out.print("Name province : ");
            String nameProvince = scanner.nextLine();
            System.out.print("Tax import : ");
            String taxImport = scanner.nextLine();

            listProduct.add(new ImportProduct(codeProduct, nameProduct, priceProduct, numberProduct,
                    manufacture, price, nameProvince, taxImport));
        } else {
            System.out.print("Enter price export : ");
            String priceExport = scanner.nextLine();

            System.out.print("Enter nation export : ");
            String nation = scanner.nextLine();

            listProduct.add(new ExportProduct(codeProduct, nameProduct, priceProduct, numberProduct, manufacture, priceExport, nation));
        }

        try {
            int i = 1;
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            for (Product product : listProduct) {
                if (product instanceof ImportProduct) {
                    ImportProduct importProduct = (ImportProduct) product;
                    stringBuilder.append(i);
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getIdProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceImport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameProvince());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getTax());
                    stringBuilder.append(NEW_LINE_SEPARATOR);
                } else {
                    ExportProduct exportProduct = (ExportProduct) product;
                    stringBuilder.append(i);
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getIdProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceExport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getClass());
                    stringBuilder.append(COMMA_DELIMITER);
                }
                i++;
            }

            bufferedWriter.append(stringBuilder);
            System.out.println("CSV file was created successfully !!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }

    }


//    public static List<Product> readFile(String FILE_BATH) {
//        List<Product> list = new ArrayList<>();
//
//        File fileRoom = new File(FILE_BATH);
//        String[] arrayTemp;
//
//        try {
//            if
//            (!fileRoom.exists()) {
//                throw new FileNotFoundException("File not exists");
//            }
//            FileReader fileReader = new FileReader(fileRoom);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//
//            String line;
//
//                while ((line = bufferedReader.readLine()) != null) {
//                    arrayTemp = line.split(",");
//                    Room room = new Room(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5]);
//                    list.add(room);
//                }
//            } else if (FILE_BATH.equals(FileVillaUtils.FILE_VILLA)) {
//                while ((line = bufferedReader.readLine()) != null) {
//                    arrayTemp = line.split(",");
//                    Villa villa1 = new Villa(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5],
//                            arrayTemp[6], Double.parseDouble(arrayTemp[7]), Integer.parseInt(arrayTemp[8]));
//                    list.add(villa1);
//                }
//
//            } else {
//                while ((line = bufferedReader.readLine()) != null) {
//                    arrayTemp = line.split(",");
//                    House house = new House(arrayTemp[0], Double.parseDouble(arrayTemp[1]), Double.parseDouble(arrayTemp[2]), Integer.parseInt(arrayTemp[3]), arrayTemp[4], arrayTemp[5], arrayTemp[6]
//                            , Integer.parseInt(arrayTemp[7]));
//                    list.add(house);
//                }
//            }
//
//            bufferedReader.close();
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
