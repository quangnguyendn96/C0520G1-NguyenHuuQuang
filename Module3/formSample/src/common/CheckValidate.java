package common;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    static Scanner scanner = new Scanner(System.in);
    private static final String ID= "SV-[\\d]{2}";
//    private static final String PHONE_NUMBER = "(09[01][\\d]{7})||(84\\+9[01][\\d]{7})";
    private static final String PHONE_NUMBER = "(0[\\d]{9})|(84\\+9[\\d]{9})";

    private static final String EMAIL = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String INTEGER = "[1-9]|([1-9][\\d]+)";
    private static final String IDENTIFY_CARD = "[\\d]{9}";


    static public boolean checkId(String id) {
        Pattern pattern = Pattern.compile(ID);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    static public boolean checkPhoneNumber(String id) {return !Pattern.compile(PHONE_NUMBER).matcher(id).matches();}
    static public boolean checkEmail(String el) { return !Pattern.compile(EMAIL).matcher(el).matches(); }
    static public boolean checkInteger(String el){ return !Pattern.compile(INTEGER).matcher(el).matches();}
    static public boolean checkPositive(String el){ return !(Double.parseDouble(el) > 0); }
    static public boolean checkIdCard(String id) { return !Pattern.compile(IDENTIFY_CARD).matcher(id).matches();
    }
    static public boolean checkEmpty(String el) {
        return el.equals("");
    }

}
