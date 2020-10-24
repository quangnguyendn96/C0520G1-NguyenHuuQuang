package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Page<Employee> findAll(Pageable pageable);
    public List<Employee> findAll();
    public Employee findById(long id);
    public void save(Employee employee);
    public void deleteById(long id);
    public void deleteAllByIdIn(List<Long> list);
}
