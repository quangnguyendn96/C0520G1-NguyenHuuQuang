package sessoin18_string_and_regex.exercise.validate_phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String validate_phoneNumber = "^\\([\\d]{2}\\)-\\([0][\\d]{9}\\)$";
    public boolean checkValidatePhone(String str){
        Pattern pattern = Pattern.compile(validate_phoneNumber);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

