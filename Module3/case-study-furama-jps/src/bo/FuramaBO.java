package bo;

import model.Customer;
import model.Employee;
import model.Service;

import java.util.List;

public interface FuramaBO {
    List<Customer> showAllCustomer();
    List<Service> showAllService();
    List<Employee> showAllEmployee();
}
