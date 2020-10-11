package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.furama.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
