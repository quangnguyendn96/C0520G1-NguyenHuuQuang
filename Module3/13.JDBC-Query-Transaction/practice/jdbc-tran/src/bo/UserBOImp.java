package bo;

import dao.UserDAO;
import dao.UserDAOImp;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class UserBOImp implements  UserBO {
    UserDAO userDAO = new UserDAOImp();
    @Override
    public void insertUser(User user) throws SQLException {
        userDAO.updateUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userDAO.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userDAO.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
         userDAO.insertUserStore(user);
    }
    public void insertUpdateUseTransaction(){
         userDAO.insertUpdateUseTransaction();
    };

}
