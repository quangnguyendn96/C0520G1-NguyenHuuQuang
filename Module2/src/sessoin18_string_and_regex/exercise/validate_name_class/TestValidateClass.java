package sessoin18_string_and_regex.exercise.validate_name_class;

import java.util.Scanner;

public class TestValidateClass {
    public static void main(String[] args) {

        ValidateClass validateClass = new ValidateClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name");
        String name = scanner.nextLine();

        if (validateClass.checkValidate(name)) {

            System.out.println("Right name");
        } else {
            System.out.println("Wrong name");
        }
    }
}
