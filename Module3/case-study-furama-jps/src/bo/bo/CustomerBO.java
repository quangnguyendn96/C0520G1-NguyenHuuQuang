package bo.bo;

import model.AllInfoCustomer;
import model.Customer;

import java.util.List;

public interface CustomerBO {
    List<Customer> showAllObj();
    Customer getById(String id);
    void insertNewObj(Customer obj);
    void editObj(Customer obj);
    List<AllInfoCustomer> showAllInforEachCustomer();
    void deleteObj(String id);
    boolean checkId(String id);
    List<Customer> searchObj(String name);
}

