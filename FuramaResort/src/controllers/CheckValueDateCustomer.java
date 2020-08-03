package controllers;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValueDateCustomer {
    private static final String NAME_CUSTOMER = "^([A-Z][a-z]{1,}[\\s])[A-Z][a-z]*(([\\s][A-Z][a-z]*){0,4})";
    private static final String EMAIL = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String ID_CUSTOMER = "[\\d]{9}";
    private static final String BIRTHDAY_CUSTOMER = "^([0-2][\\d]|[3][0-1])/(0[1-9]|10|11|12)/(19[\\d]{2}|200[0-5])$";
    static Scanner scanner = new Scanner(System.in);

    public static String checkNameCustomer(String nameCustomer) {

        if (Pattern.compile(NAME_CUSTOMER).matcher(nameCustomer).matches()) {
            return nameCustomer;
        } else {
            System.out.println("Wrong Name");
            System.out.print("Enter again : ");
            String nameCustomer1 = scanner.nextLine();
            return checkNameCustomer(nameCustomer1);
        }
    }

    public static String checkEmailCustomer(String mailCustomer) {

        if (Pattern.compile(EMAIL).matcher(mailCustomer).matches()) {
            return mailCustomer;
        } else {

            System.out.println("Wrong Name");
            String mailCustomer1 = scanner.nextLine();
            return checkEmailCustomer(mailCustomer1);
        }
    }

    public static String checkGender(String genderCustomer) {

        String genTemp = genderCustomer.toLowerCase();
        if (genTemp.equals("male")) {
            return "Male";
        } else if (genTemp.equals("female")) {
            return "Female";

        } else if (genTemp.equals("unknown")) {
            return "Unknown";
        } else
            System.out.println("Wrong gender");
        System.out.print("Enter again : ");
        String genderCustomer1 = scanner.nextLine();
        return checkGender(genderCustomer1);
    }

    public static String checkIdCustomer(String idCustomer) {

        if (Pattern.compile(ID_CUSTOMER).matcher(idCustomer).matches()) {
            return idCustomer;
        } else {
            System.out.println("Wrong Id");
            System.out.println("Enter agạin : ");
            String idCustomer1 = scanner.nextLine();
            return checkIdCustomer(idCustomer1);
        }
    }

    public static String checkDayOfBirthCustomer(String dayOfBirth) {

        if (Pattern.compile(BIRTHDAY_CUSTOMER).matcher(dayOfBirth).matches()) {
            return dayOfBirth;
        } else {
            System.out.println("Wrong Birthday");
            System.out.print("Enter again : ");
            String dayOfBirth1 = scanner.nextLine();
            return checkDayOfBirthCustomer(dayOfBirth1);
        }
    }
}
