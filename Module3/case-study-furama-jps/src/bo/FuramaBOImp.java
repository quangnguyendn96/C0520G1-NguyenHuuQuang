package bo;

import dao.FuramaDAOImp;
import model.Customer;
import model.Employee;
import model.Service;

import java.util.List;

public class FuramaBOImp implements FuramaBO {
    FuramaDAOImp furamaDAOImp = new FuramaDAOImp();

    public List<Customer> showAllCustomer() {
        return furamaDAOImp.showAllCustomer();
    }

    public List<Service> showAllService() {
        return furamaDAOImp.showAllService();
    }

    public List<Employee> showAllEmployee() {
        return furamaDAOImp.showAllEmployee();
    }
    public void insertNewCustomer (Customer customer){
        furamaDAOImp.insertNewCustomer(customer);
    }

}
