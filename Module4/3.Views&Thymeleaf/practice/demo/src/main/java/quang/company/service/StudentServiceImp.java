package quang.company.service;

import org.springframework.stereotype.Service;
import quang.company.model.Student;
import quang.company.repository.StudentRepository;
import quang.company.repository.StudentRepositoryImp;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    StudentRepository studentRepository = new StudentRepositoryImp();

    @Override
    public List<Student> showAll() {
        return studentRepository.showAll();
    }

    @Override
    public Student findByName(int id) {
        return studentRepository.findByName(id);
    }

    @Override
    public void update(int id, Student student) {
        studentRepository.update(id, student);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> search(String string) {
        return null;
    }
    public void remove(int id){
        studentRepository.remove(id);
    }
}
