package bo.customerBO;

import dao.customerDAO.CustomerDAO;
import dao.customerDAO.CustomerDAOImp;
import model.customer.Customer;

import java.util.List;

public class CustomerBOImp implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImp();

    @Override
    public List<Customer> showAllCustomer() {
        return customerDAO.showAllCustomer();
    }

    @Override
    public Customer getIdCustomer(int id) {
        return customerDAO.getIdCustomer(id);
    }

    @Override
    public void insertNewCustomer(Customer customer) {
        customerDAO.insertNewCustomer(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerDAO.editCustomer(customer);
    }

    @Override
    public void showAllInforEachCustomer(int id) {
        customerDAO.showAllInforEachCustomer(id);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}
