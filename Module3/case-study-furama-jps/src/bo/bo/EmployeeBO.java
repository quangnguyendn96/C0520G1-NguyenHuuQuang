package bo.bo;

import model.Employee;

import java.util.List;

public interface EmployeeBO {
    List<Employee> showAllObj();
    Employee getById(int id);
    void insertNewObj(Employee obj);
    void editObj(Employee obj);
    void deleteObj(int id);
}
