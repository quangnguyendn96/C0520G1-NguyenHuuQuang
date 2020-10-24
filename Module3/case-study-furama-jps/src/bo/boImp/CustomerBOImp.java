package bo.boImp;

import bo.bo.CustomerBO;
import common.CheckValidate;
import dao.dao.CustomerDAO;
import dao.daoImp.CustomerDAOImp;
import model.AllInfoCustomer;
import model.Customer;

import java.util.List;

public class CustomerBOImp implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImp();

    @Override
    public List<Customer> showAllObj() {
        return customerDAO.showAllObj();
    }

    @Override
    public Customer getById(String id) {
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
    public List<AllInfoCustomer> showAllInforEachCustomer() {
        return customerDAO.showAllInforEachCustomer();
    }

    @Override
    public void deleteObj(String id) {
        customerDAO.deleteObj(id);
    }

    public boolean checkId(String id){
         return CheckValidate.checkIdCustomer(id);
    }

    @Override
    public List<Customer> searchObj(String name) {
        return customerDAO.searchObj(name);
    }
}
