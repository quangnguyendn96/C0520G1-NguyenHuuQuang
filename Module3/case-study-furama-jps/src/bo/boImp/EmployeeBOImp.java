package bo.boImp;

import bo.bo.EmployeeBO;
import dao.dao.EmployeeDAO;
import dao.daoImp.EmployeeDAOImp;
import model.Employee;

import java.util.List;

public class EmployeeBOImp implements EmployeeBO {
    EmployeeDAO employeeDAO = new EmployeeDAOImp();

    @Override
    public List<Employee> showAllObj() {
        return employeeDAO.showAllObj();
    }

    @Override
    public Employee getById(String id) {
        return employeeDAO.getById(id);
    }

    @Override
    public void insertNewObj(Employee obj) {
        employeeDAO.insertNewObj(obj);
    }

    @Override
    public void editObj(Employee obj) {
        employeeDAO.editObj(obj);
    }

    @Override
    public void deleteObj(String id) {
        employeeDAO.deleteObj(id);
    }
}
