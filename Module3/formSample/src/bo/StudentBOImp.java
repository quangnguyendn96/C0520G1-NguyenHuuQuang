package bo;

import dao.StudentDAO;
import dao.StudentDAOImp;
import model.Student;

import java.util.List;

public class StudentBOImp implements StudentBO {
    StudentDAO studentDAO = new StudentDAOImp();
        @Override
        public List<Student> showAllObj() {
            return studentDAO.showAllObj();
        }

        @Override
        public Student getById(String id) {
            return studentDAO.getById(id);
        }

        @Override
        public void insertNewObj(Student obj) {
            studentDAO.insertNewObj(obj);
        }

        @Override
        public void editObj(Student obj) {
            studentDAO.editObj(obj);
        }

        @Override
        public void deleteObj(String id) {
            studentDAO.deleteObj(id);
        }

    @Override
    public List<Student> searchObj(String nameSearch) {
        return studentDAO.searchObj(nameSearch);
    }
}
