package dao;

import dao.dbConnection.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImp implements StudentDAO {
    //cột trong table
    private static final String col_1 = "id";
    private static final String col_2 = "name";
    private static final String col_3 = "class_name";
    private static final String col_4 = "gender";
    private static final String col_5 = "id_card";
    private static final String col_6 = "day_of_birth";
    private static final String col_7 = "phone_number";
    private static final String col_8 = "";


    // đổi tên table
    private static final String TABLE_NAME = " student ";
    private static final String SELECT_OBJ = "select * from " + TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from " + TABLE_NAME + "where  " + col_1 + "= ?";
    private static final String EDIT_OBJ = "update" + TABLE_NAME + "set " + col_2 + " = ? ," + col_3 + "= ? ," + col_4 + "= ? ," + col_5 + "= ? ,"
            + col_6 + "= ? ," + col_7 + "= ? where " + col_1 + "= ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where " + col_1 + " = ?";
    private static final String SEARCH_OBJ = "select * from" + TABLE_NAME + "where " + col_2 + " like ?";

    // đổi tên obj
    @Override
    public List<Student> showAllObj() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Student> objList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String id = rs.getString(col_1);
                    String name = rs.getString(col_2);
                    String nameClass = rs.getString(col_3);
                    String gender = rs.getString(col_4);
                    String idCard = rs.getString(col_5);
                    String dayOfBirth = rs.getString(col_6);
                    String phoneNumber = rs.getString(col_7);
                    objList.add(new Student(id, name, nameClass, gender, idCard,
                            dayOfBirth, phoneNumber));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objList;
    }

    // đổi tên phương thức
    @Override
    public void insertNewObj(Student obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_OBJ);
                statement.setString(1, obj.getId());
                statement.setString(2, obj.getName());
                statement.setString(3, obj.getClassName());
                statement.setInt(4, Integer.parseInt(obj.getGender()));
                statement.setInt(5, Integer.parseInt(obj.getIdCard()));
                statement.setString(6, obj.getDayOfBirth());
                statement.setString(7, obj.getPhoneNumber());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();

    }

    @Override
    public void editObj(Student obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_OBJ);
                statement.setString(1, obj.getName());
                statement.setString(2, obj.getClassName());
                statement.setInt(3, Integer.parseInt(obj.getGender()));
                statement.setInt(4, Integer.parseInt(obj.getIdCard()));
                statement.setString(5, obj.getDayOfBirth());
                statement.setString(6, obj.getPhoneNumber());
                statement.setString(7, obj.getId());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

    // không đổi
    @Override
    public void deleteObj(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_OBJ);
                preparedStatement.setString(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

    // đổi tên object
    public Student getById(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Student student = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
                preparedStatement.setString(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String name = rs.getString(col_2);
                    String nameClass = rs.getString(col_3);
                    String gender = rs.getString(col_4);
                    String idCard = rs.getString(col_5);
                    String dayOfBirth = rs.getString(col_6);
                    String phoneNumber = rs.getString(col_7);
                    student = new Student(id, name, nameClass, gender, idCard,
                            dayOfBirth, phoneNumber);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return student;
    }

    @Override
    public List<Student> searchObj(String nameSearch) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Student> objectList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SEARCH_OBJ);
                preparedStatement.setString(1, "%" + nameSearch + "%");
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String id = rs.getString(col_1);
                    String name = rs.getString(col_2);
                    String nameClass = rs.getString(col_3);
                    String gender = rs.getString(col_4);
                    String idCard = rs.getString(col_5);
                    String dayOfBirth = rs.getString(col_6);
                    String phoneNumber = rs.getString(col_7);
                    objectList.add(new Student(id, name, nameClass, gender, idCard,
                            dayOfBirth, phoneNumber));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objectList;
    }
}



