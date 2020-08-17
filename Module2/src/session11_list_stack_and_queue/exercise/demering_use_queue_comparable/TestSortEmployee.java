package session11_list_stack_and_queue.exercise.demering_use_queue_comparable;

import java.util.*;

public class TestSortEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> myEmployee = new ArrayList();

        myEmployee.add(new Employee("Quang", "Male", "27/12/1996", 24));
        myEmployee.add(new Employee("Mai", "Female", "02/06/1997",23));
        myEmployee.add(new Employee("Quynh", "Female", "21/10/1998",22));
        myEmployee.add(new Employee("Hung", "Male", "12/03/1980",40));
        myEmployee.add(new Employee("Nam", "Male", "02/02/2000",20));
        myEmployee.add(new Employee("Trang", "Female", "15/08/1991",29));
        myEmployee.add(new Employee("Hau", "Male", "12/12/1996",30));
        myEmployee.add(new Employee("Nhung", "Female", "10/08/1995",25));
        myEmployee.add(new Employee("Dung", "Male", "10/09/1980",40));
        myEmployee.add(new Employee("Ha", "Male", "01/01/1981",39));
        myEmployee.add(new Employee("Thu", "Female", "09/06/1985",35));
        myEmployee.add(new Employee("Dat", "Male", "20/11/1983",37));
        myEmployee.add(new Employee("Tam", "Female", "30/09/1989",31));

//        Comparator sortEmployee = new SortByDayOfBirth();
//        Collections.sort(myEmployee,sortEmployee);
//
//        Iterator<Employee> iterator = myEmployee.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
        Comparator sortEmployeeAgeAndBirth = new SortByGenderAndYear();
        Collections.sort(myEmployee,sortEmployeeAgeAndBirth);
        Iterator<Employee> iterator1 = myEmployee.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
       }
    }
}
