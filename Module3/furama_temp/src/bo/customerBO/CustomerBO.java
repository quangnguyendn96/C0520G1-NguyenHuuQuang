package bo.customerBO;

import model.customer.Customer;

import java.util.List;

public interface CustomerBO {
    List<Customer> showAllCustomer();
    Customer getIdCustomer(int id);
    void insertNewCustomer(Customer customer);
    void editCustomer(Customer customer);
    void showAllInforEachCustomer(int id);
    void deleteCustomer(int id);
}
