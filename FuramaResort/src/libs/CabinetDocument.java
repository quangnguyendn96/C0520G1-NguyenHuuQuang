package libs;

import models.employee.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class CabinetDocument {
   static Scanner scanner = new Scanner(System.in);
    private static final String FILE_BATH = "src/data/employee.csv";

    public static Stack<Employee> readDocument() {
        String[] arrEmp;
        Stack<Employee> employees = new Stack<>();

        File file = new File(FILE_BATH);
        try {
            if
            (!file.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrEmp = line.split(",");
                Employee employee = new Employee(arrEmp[1], Integer.parseInt(arrEmp[2]), arrEmp[3]);
                employees.push(employee);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void searchEmployee() {
        System.out.println("-----------Search Employee-----------");
        int index =-1;
        System.out.print("Enter the name employee : ");
        String name = scanner.nextLine();
        for (int i = 0; i < readDocument().size(); i++) {
            if (name.equals(readDocument().get(i).getNameEmployee())) {
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println(String.format("%15s%15s%30s", "Name Employee", "Age", "Address"));
            System.out.println(readDocument().get(index).toString());
        }
        else {
            System.out.println("Wrong name");
        }

    }
}
