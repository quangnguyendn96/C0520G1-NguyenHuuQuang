package models.customer;

import java.util.Comparator;

public class SortCustomer implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        int i = o1.getNameCustomer().compareTo(o2.getNameCustomer());
        if(i == 0){
            return (o1.getYear() - o2.getYear());
        }
        else
            return i;
    }
}
