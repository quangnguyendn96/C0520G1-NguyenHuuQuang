package respositive;

import model.Student;

import java.util.List;

public interface StudentRepository extends GenericRepository<Student> {
    @Override
    List<Student> showAll();

    @Override
    Student findByName(int id);

    @Override
    void update(int id, Student student);

    @Override
    void save(Student student);

    @Override
    List<Student> search(String string);

    @Override
    void remove(int id);
}
