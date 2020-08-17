package session11_list_stack_and_queue.exercise.demering_use_queue_comparable;

import java.util.Comparator;

public class SortByDayOfBirth implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
