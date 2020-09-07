package bo.bo;

import model.Customer;

import java.util.List;

public interface CustomerBO {
    List<Customer> showAllObj();
    Customer getById(int id);
    void insertNewObj(Customer obj);
    void editObj(Customer obj);
    List<List<String>> showAllInforEachCustomer(int id);
    void deleteObj(int id);
}

