package bo;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserBO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
//    public User selectUser1(String id);
    public List<User> searchUsers(String country);
    public List<User> sortByName() throws SQLException;
}
