package dao.dao;

import model.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> showAllObj();
    Customer getById(int id);
    void insertNewObj(Customer obj);
    void editObj(Customer obj);
    void deleteObj(int id);
    List<List<String>> showAllInforEachCustomer(int id);

}
