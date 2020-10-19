package quang.company.productmodal.config;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    static Scanner scanner = new Scanner(System.in);

    private static final String ID_SERVICE = "DV-[\\d]{4}";
    private static final String PHONE_NUMBER = "(09[01][\\d]{7})||(84\\+9[01][\\d]{7})";
    private static final String EMAIL = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String INTEGER = "[1-9]||([1-9][\\d]+)";
    private static final String IDENTIFY_CARD = "[\\d]{9}";
    private static final String DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    static public boolean checkIdService(String id) {
        return Pattern.compile(ID_SERVICE).matcher(id).matches();
    }

    static public boolean checkPhoneNumber(String id) {
        return !Pattern.compile(PHONE_NUMBER).matcher(id).matches();
    }

    static public boolean checkEmail(String id) {
        return !Pattern.compile(EMAIL).matcher(id).matches();
    }

    static public boolean checkInteger(String id) {
        return !Pattern.compile(INTEGER).matcher(id).matches();
    }

    static public boolean checkPositive(String id) {
        return !(Double.parseDouble(id) > 0);
    }

    static public boolean checkIdCard(String id) {
        return !Pattern.compile(IDENTIFY_CARD).matcher(id).matches();
    }

    static public boolean dateProduct(String dateImport, String dateExport) {
        if (!Pattern.compile(DATE).matcher(dateImport).matches() || !Pattern.compile(DATE).matcher(dateExport).matches()) {
            return false;
        } else {
            String[] dateIm = dateImport.split("/");

            System.out.println(Arrays.toString(dateIm));
            String[] dateEx = dateExport.split("/");
            System.out.println(Arrays.toString(dateEx));


            int timeIm = Integer.parseInt(dateIm[0]) + Integer.parseInt(dateIm[1]) * 30 + Integer.parseInt(dateIm[2]) * 365;
            int timeEx = Integer.parseInt(dateEx[0]) + Integer.parseInt(dateEx[1]) * 30 + Integer.parseInt(dateEx[2]) * 365;
            System.out.println(timeEx-timeIm);
            if (timeEx - timeIm > 180) {
                return true;
            } else return false;
        }
    }
}

