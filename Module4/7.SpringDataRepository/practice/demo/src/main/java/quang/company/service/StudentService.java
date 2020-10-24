package quang.company.service;

import org.springframework.stereotype.Service;
import quang.company.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    Student findById(long id);

    void remove(long id);
}
