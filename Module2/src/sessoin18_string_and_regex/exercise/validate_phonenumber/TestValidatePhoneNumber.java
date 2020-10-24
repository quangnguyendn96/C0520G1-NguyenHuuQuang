package sessoin18_string_and_regex.exercise.validate_phonenumber;

import sessoin18_string_and_regex.exercise.validate_name_class.ValidateClass;

import java.util.Scanner;

public class TestValidatePhoneNumber {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        System.out.print("Enter the phone number: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(validatePhoneNumber.checkValidatePhone(input)){
            System.out.println("Right phone number");
        }
        else {
            System.out.println("Wrong phone number");
        }
    }
}
