package dao;

import model.Customer;
import model.Employee;
import model.Service;

import java.util.List;

public interface FuramaDAO {
    List<Customer> showAllCustomer();
    List<Service> showAllService();
    List<Employee> showAllEmployee();
}
