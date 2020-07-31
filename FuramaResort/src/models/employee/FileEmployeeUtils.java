package models.employee;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class FileEmployeeUtils {

    private static final String FILE_BATH = "src/data/employee.csv";


    public static TreeMap<Integer, Employee> readEmployee() {
        TreeMap<Integer, Employee> myMap = new TreeMap<>();
        String[] arrEmp;

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
                Employee employee = new Employee(arrEmp[1], Integer.parseInt(arrEmp[2]),arrEmp[3]);
                myMap.put(Integer.parseInt(arrEmp[0]), employee);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return myMap;
    }

    public static TreeMap<Integer, String> readEmployee1() {
        TreeMap<Integer, String> myMap = new TreeMap<>();
        String[] arrEmp;

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
                Employee employee = new Employee(arrEmp[1], Integer.parseInt(arrEmp[2]),arrEmp[3]);
                myMap.put(Integer.parseInt(arrEmp[0]), arrEmp[1]);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return myMap;
    }
    public static void showInformationEmployee1() {
        TreeMap<Integer, String> myMap = readEmployee1();
        Set<Integer> freqKey = myMap.keySet();
        for (Integer key : freqKey) {
            System.out.println(" Id Employee :" + key + myMap.get(key));
        }
    }

//    public static void showInformationEmployee() {
//        TreeMap<Integer, Employee> myMap = readEmployee();
//        Set<Integer> freqKey = myMap.keySet();
//        for (Integer key : freqKey) {
//            System.out.println(" Id Employee :" + key + myMap.get(key).toString());
//        }
//    }
}
