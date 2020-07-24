package session17_binaryfile_serialization.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
//    private static final String account_regex = "^[_a-z1-9]{6,}$";
    private static final String account_regex = "\\w+@\\w+(\\.\\w+){1,2}";

    public Account() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(account_regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validate1(String regex) {
        Pattern pattern = Pattern.compile(account_regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class TestAccount {
    public static Account account1;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    public static String abc = "user@fpt.edu.vn";

    public static void main(String args[]) {
        account1 = new Account();
        for(String account : validAccount){
            boolean isValidate =account1.validate(account);
            System.out.println(account + " " + isValidate);
        }
        boolean isVa = account1.validate(abc);
        System.out.println(isVa);
    }
}