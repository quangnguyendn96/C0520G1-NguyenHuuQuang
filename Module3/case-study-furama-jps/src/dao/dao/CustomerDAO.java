package dao.dao;

import model.AllInfoCustomer;
import model.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> showAllObj();
    Customer getById(String id);
    void insertNewObj(Customer obj);
    void editObj(Customer obj);
    void deleteObj(String id);
    List<AllInfoCustomer> showAllInforEachCustomer();
    List<Customer> searchObj(String name);
}
