package session11_list_stack_and_queue.exercise.demering_use_queue;

import java.util.Comparator;

public class SortByGenderAndYear implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int i = o1.getGender().compareTo(o2.getGender());
        if(i == 0){
            i = o1.getYear() - o2.getYear();
            if(i==0){
                i = o1.getMonth() - o2.getMonth();
                if(i==0){
                    i = o1.getDay() - o2.getDay();
                }
            }
        }

        return i;
    }
}
