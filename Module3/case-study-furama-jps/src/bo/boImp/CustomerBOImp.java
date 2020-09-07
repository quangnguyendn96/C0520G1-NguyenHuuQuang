package bo.boImp;

import bo.bo.CustomerBO;
import dao.dao.CustomerDAO;
import dao.daoImp.CustomerDAOImp;
import model.Customer;

import java.util.List;

public class CustomerBOImp implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImp();

    @Override
    public List<Customer> showAllObj() {
        return customerDAO.showAllObj();
    }

    @Override
    public Customer getById(int id) {
        return customerDAO.getById(id);
    }

    @Override
    public void insertNewObj(Customer customer) {
        customerDAO.insertNewObj(customer);
    }

    @Override
    public void editObj(Customer customer) {
        customerDAO.editObj(customer);
    }

    @Override
    public void showAllInforEachCustomer(int id) {
        customerDAO.showAllInforEachCustomer(id);
    }

    @Override
    public void deleteObj(int id) {
        customerDAO.deleteObj(id);
    }
}
