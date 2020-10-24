package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.furama.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
