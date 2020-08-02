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

    public static void showInformationEmployee() {
        System.out.println("----------Show Information Employee-------------");
        String str = String.format("%10s%25s%15s%25s", "Id Employee","Name Employee", "Age","Address");
        str += System.lineSeparator();
        TreeMap<Integer, Employee> myMap = readEmployee();
        Set<Integer> freqKey = myMap.keySet();
        for (Integer key : freqKey) {
            str += key;
            str += myMap.get(key).toString();
            str += System.lineSeparator();
        }
        System.out.println(str);
    }
}
