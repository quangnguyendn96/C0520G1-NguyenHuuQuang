package bo;

import model.Contract;
import model.Customer;
import model.Employee;
import model.Service;

import java.util.List;

public interface FuramaBO {
    List<Customer> showAllCustomer();
    List<Service> showAllService();
    List<Employee> showAllEmployee();
    List<Contract> showAllContract();
     Customer getIdCustomer(int id);
    void insertNewCustomer(Customer customer);
    void insertNewContract(Contract contract);
    void showAllInforEachCustomer(int id);
    void deleteCustomer(int id);
}
