package respositive;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImp implements StudentRepository {
    static Map<Integer, Student> myMap = new HashMap<>();

    static {
        myMap.put(1, new Student(1, "Quang", "C05", "Da Nang"));
        myMap.put(2, new Student(2, "Chuong", "C05", "Quang Tri"));
        myMap.put(3, new Student(3, "Nhat", "C06", "Hue"));
        myMap.put(4, new Student(4, "Mai", "C06", "Da Nang"));
        myMap.put(5, new Student(5, "Trang", "C07", "Quang Nam"));
    }

    @Override
    public List<Student> showAll() {
        return new ArrayList<>(myMap.values());
    }

    @Override
    public Student findByName(int id) {
        return (myMap.get(id));
    }

    @Override
    public void update(int id, Student student) {
        myMap.put(id, student);
    }

    @Override
    public void save(Student student) {
        myMap.put(student.getId(), student);
    }

    @Override
    public List<Student> search(String string) {
        return null;
    }

    @Override
    public void remove(int id) {
        myMap.remove(id);
    }
}
