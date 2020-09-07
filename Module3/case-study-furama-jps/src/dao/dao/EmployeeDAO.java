package dao.dao;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> showAllObj();
    Employee getById(int id);
    void insertNewObj(Employee obj);
    void editObj(Employee obj);
    void deleteObj(int id);
}
