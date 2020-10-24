package sessoin18_string_and_regex.demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Check {
    static final String GENDER_CUSTOMER = "^(male|Female|Unknown)$";
    static Scanner scanner = new Scanner(System.in);
    private static final String BIRTHDAY_CUSTOMER = "^([0-2][\\d]|[3][0-1])/(0[1-9]|10|11|12)/(19[\\d]{2}|200[1-5])$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(checkDayOfBirthCustomer());
    }

    public static String checkDayOfBirthCustomer() {
        String dayOfBirth = scanner.nextLine();
        if (Pattern.compile(BIRTHDAY_CUSTOMER).matcher(dayOfBirth).matches()) {
            return dayOfBirth;
        } else {
            System.out.println("Wrong Birthday");
            return checkDayOfBirthCustomer();
        }
    }
}

