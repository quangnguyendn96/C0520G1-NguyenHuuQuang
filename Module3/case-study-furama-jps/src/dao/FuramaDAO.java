package dao;

import model.Contract;
import model.Customer;
import model.Employee;
import model.Service;

import java.util.List;

public interface FuramaDAO {
    List<Customer> showAllCustomer();
    List<Service> showAllService();
    List<Employee> showAllEmployee();
    List<Contract> showAllContract();
    void insertNewCustomer(Customer customer);
    void insertNewContract(Contract contract);
}
