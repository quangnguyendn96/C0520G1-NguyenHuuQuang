package dao;

import model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> showAllObj();

    Student getById(String id);

    void insertNewObj(Student obj);

    void editObj(Student obj);

    void deleteObj(String id);
     List<Student> searchObj(String nameSearch);
}
