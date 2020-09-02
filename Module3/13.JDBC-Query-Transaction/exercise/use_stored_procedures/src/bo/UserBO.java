package bo;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserBO {
    public void insertUser(User user) throws SQLException;

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public User getUserById(int id);

    public void insertUserStore(User user) throws SQLException;

}
