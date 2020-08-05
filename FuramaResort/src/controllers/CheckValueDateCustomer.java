package controllers;

import java.util.Scanner;
import java.util.regex.Pattern;
import exception.*;

public class CheckValueDateCustomer {
    private static final String NAME_CUSTOMER = "^([A-Z][a-z]{1,}[\\s])[A-Z][a-z]*(([\\s][A-Z][a-z]*){0,4})";
    private static final String EMAIL = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String ID_CUSTOMER = "[\\d]{9}";
    private static final String BIRTHDAY_CUSTOMER = "^([0-2][\\d]|[3][0-1])/(0[1-9]|10|11|12)/(19[\\d]{2}|200[0-5])$";
    static Scanner scanner = new Scanner(System.in);

    public static String checkNameCustomer(){
        try {
            String nameCustomer = scanner.nextLine();
            if (Pattern.compile(NAME_CUSTOMER).matcher(nameCustomer).matches()) {
                return nameCustomer;
            } else {
                throw new NameException("Name is not syntax");
            }
        } catch (NameException e) {
            System.out.println("Failed" + e);
            return checkNameCustomer();
        }
    }

    public static String checkEmailCustomer() {
        try {
            String mailCustomer = scanner.nextLine();
            if (Pattern.compile(EMAIL).matcher(mailCustomer).matches()) {
                return mailCustomer;
            } else {
                throw new EmailException("Email is not syntax");
            }
        } catch (EmailException e) {
            System.out.println("Failed" + e);
            return checkEmailCustomer();
        }
    }

    public static String checkGender() {
        try {
            String genderCustomer = scanner.nextLine();
            String genTemp = genderCustomer.toLowerCase();
            if (genTemp.equals("male")) {
                return "Male";
            } else if (genTemp.equals("female")) {
                return "Female";
            } else if (genTemp.equals("unknown")) {
                return "Unknown";
            } else
                throw new GenderException("Input not right");

        } catch (GenderException e) {
            System.out.println(e);
            return checkGender();
        }
    }


    public static String idCardException() {
        try {
            String idCustomer = scanner.nextLine();

            if (Pattern.compile(ID_CUSTOMER).matcher(idCustomer).matches()) {
                return idCustomer;
            } else {

                throw new IdCardException("ID must be nine number");
            }
        } catch (IdCardException e) {
            System.out.println(e.toString());
            return idCardException();
        }
    }

    public static String checkDayOfBirthCustomer() {

        try {
            String dayOfBirth = scanner.nextLine();
            if (Pattern.compile(BIRTHDAY_CUSTOMER).matcher(dayOfBirth).matches()) {
                return dayOfBirth;
            } else {

                throw new BirthdayException("Input must be DD/MM/YYYY");
            }
        } catch (BirthdayException e) {
            System.out.println(e.toString());
        }
        return checkDayOfBirthCustomer();
    }
}
