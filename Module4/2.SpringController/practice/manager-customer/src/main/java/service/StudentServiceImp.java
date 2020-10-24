package service;

import model.Student;
import respositive.StudentRepository;
import respositive.StudentRepositoryImp;

import java.util.List;

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
