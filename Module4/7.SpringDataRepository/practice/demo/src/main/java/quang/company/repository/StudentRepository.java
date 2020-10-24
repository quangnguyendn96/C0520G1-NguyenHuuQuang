package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.model.Student;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
