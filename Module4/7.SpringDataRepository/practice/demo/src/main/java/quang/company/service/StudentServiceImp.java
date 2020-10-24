package quang.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.model.Student;
import quang.company.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

//    @Override
//    public void update(Student student) {
//        studentRepository.
//    }

    @Override
    public void remove(long id) {
 studentRepository.deleteById(id);
    }
}
