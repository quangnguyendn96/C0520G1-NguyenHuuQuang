package dao.customerDAO;

import model.customer.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> showAllCustomer();
    public Customer getIdCustomer(int id);
    void insertNewCustomer(Customer customer);
    void editCustomer(Customer customer);
    void showAllInforEachCustomer(int id);
    void deleteCustomer(int id);
}
