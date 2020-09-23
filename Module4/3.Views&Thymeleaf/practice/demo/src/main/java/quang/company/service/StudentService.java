package quang.company.service;



import org.springframework.stereotype.Service;
import quang.company.model.Student;

import java.util.List;


public interface StudentService {

    List<Student> showAll();
    Student findByName(int id);


    void update(int id, Student student);

    void save(Student student);

    public void remove(int id);

    List<Student> search(String string);
}
