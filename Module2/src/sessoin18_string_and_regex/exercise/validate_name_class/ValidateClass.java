package sessoin18_string_and_regex.exercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String validate_class = "^[A|C|P][\\d]{4}[G|H|I|K|L|M]$";
    private static Pattern pattern;
    private static Matcher matcher;


    public boolean checkValidate(String str) {
        pattern = Pattern.compile(validate_class);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
