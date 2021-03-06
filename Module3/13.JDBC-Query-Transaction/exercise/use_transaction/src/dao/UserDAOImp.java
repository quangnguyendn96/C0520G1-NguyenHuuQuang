package dao;

import model.User;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImp implements UserDAO {

    private static final String SELECT_USERS_ByID = "select id,name,email,country from users where id = ?";
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    @Override
    public void insertUserStore(User user) throws SQLException {
        try {
            Connection connection = DBConnection.getConnection();
            CallableStatement callableStatement = connection.prepareCall("CALL insert_user(?,?,?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_USERS_ByID);
                statement.setInt(1, id);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user = new User(id, name, email, country);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return user;
    }


    @Override
    public List<User> selectAllUsers() {
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();
        if (connection != null) {
            try {
                callableStatement = connection.prepareCall("CALL show_all_user()");
                resultSet = callableStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    userList.add(new User(id, name, email, country));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    callableStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted = false;
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement;

        try {
            callableStatement = connection.prepareCall("call delete_user(?)");
            callableStatement.setInt(1, id);
            rowDeleted = callableStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) {
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement;
        boolean rowUpdated = true;
        try {
            callableStatement = connection.prepareCall("CALL update_user(?,?,?,?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, user.getId());

            rowUpdated = callableStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }


    @Override

    public User getUserById(int id) {
        User user = null;
        try {
            Connection connection = DBConnection.getConnection();
            CallableStatement callableStatement = connection.prepareCall("CALL get_user_by_id(?)");
            {

                callableStatement.setInt(1, id);
                ResultSet rs = callableStatement.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String country = rs.getString("country");
                    user = new User(id, name, email, country);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override

    public void insertUpdateUseTransaction() {
    }

    @Override

    public void addUserTransaction(User user, int idContract, String nameContract) throws SQLException {

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            if (connection != null) {
                connection.setAutoCommit(false);

                preparedStatement = connection.prepareStatement("insert into users value (?,?,?)");
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getEmail());
                preparedStatement.setString(3, user.getCountry());
                preparedStatement.executeUpdate();

                preparedStatement = connection.prepareStatement("insert into contract value (?,?)");
                preparedStatement.setInt(1, idContract);
                preparedStatement.setString(1, nameContract);
                preparedStatement.executeUpdate();

                connection.commit();
                connection.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
                DBConnection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
