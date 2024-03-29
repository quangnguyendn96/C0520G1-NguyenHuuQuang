package bo.bo;

import model.Employee;

import java.util.List;

public interface EmployeeBO {
    List<Employee> showAllObj();
    Employee getById(String id);
    void insertNewObj(Employee obj);
    void editObj(Employee obj);
    void deleteObj(String id);
}
