package dao.daoImp;


import dao.dao.EmployeeDAO;
import dao.dbConnection.DBConnection;

import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO {
    private static final String TABLE_NAME = " employee ";
    private static final String SELECT_OBJ = "select * from " + TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from " + TABLE_NAME + "where id_employee = ?";
    private static final String EDIT_OBJ = "update" + TABLE_NAME + "set name_employee = ?, id_positive = ?,id_degree_education = ?," +
            " id_division= ?, day_of_birth = ?,identity_card_employee=?, salary= ?,phone_number = ?,email_employee= ?," +
            "address_employee=?, username= ? where id_employee = ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where id_employee = ?";

    @Override
    public List<Employee> showAllObj() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        // objList
        List<Employee> objList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String idEmployee = rs.getString("id_employee");
                    String nameEmployee = rs.getString("name_employee");
                    String idPositive = rs.getString("id_positive");
                    String idDegreeEducation = rs.getString("id_degree_education");
                    String idDivision = rs.getString("id_division");
                    String dayOfBirth = rs.getString("day_of_birth");
                    String identityCardEmployee = rs.getString("identity_card_employee");
                    double salary = rs.getDouble("salary");
                    String phoneNumber = rs.getString("phone_number");
                    String emailEmployee = rs.getString("email_employee");
                    String addressEmployee = rs.getString("address_employee");
                    String username = rs.getString("username");
                    objList.add(new Employee(idEmployee, nameEmployee, idPositive, idDegreeEducation, idDivision, dayOfBirth,
                            identityCardEmployee, salary, phoneNumber, emailEmployee, addressEmployee, username));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objList;
    }

    @Override
    public void insertNewObj(Employee obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_OBJ);
                statement.setString(1, obj.getIdEmployee());
                statement.setString(2, obj.getNameEmployee());
                statement.setString(3, obj.getIdPositive());
                statement.setString(4, obj.getIdDegreeEducation());
                statement.setString(5, obj.getIdDivision());
                statement.setString(6, obj.getDayOfBirth());
                statement.setString(7, obj.getIdentityCardEmployee());
                statement.setDouble(8, obj.getSalary());
                statement.setString(9, obj.getPhoneNumber());
                statement.setString(10, obj.getEmailEmployee());
                statement.setString(11, obj.getAddressEmployee());
                statement.setString(12, obj.getUsername());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();

    }

    @Override
    public void editObj(Employee obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_OBJ);
                statement.setString(12, obj.getIdEmployee());
                statement.setString(1, obj.getNameEmployee());
                statement.setString(2, obj.getIdPositive());
                statement.setString(3, obj.getIdDegreeEducation());
                statement.setString(4, obj.getIdDivision());
                statement.setString(5, obj.getDayOfBirth());
                statement.setString(6, obj.getIdentityCardEmployee());
                statement.setDouble(7, obj.getSalary());
                statement.setString(8, obj.getPhoneNumber());
                statement.setString(9, obj.getEmailEmployee());
                statement.setString(10, obj.getAddressEmployee());
                statement.setString(11, obj.getUsername());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

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


    public Employee getById(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Employee employee = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
                preparedStatement.setString(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String idEmployee = rs.getString("id_employee");
                    String nameEmployee = rs.getString("name_employee");
                    String idPositive = rs.getString("id_positive");
                    String idDegreeEducation = rs.getString("id_degree_education");
                    String idDivision = rs.getString("id_division");
                    String dayOfBirth = rs.getString("day_of_birth");
                    String identityCardEmployee = rs.getString("identity_card_employee");
                    double salary = rs.getDouble("salary");
                    String phoneNumber = rs.getString("phone_number");
                    String emailEmployee = rs.getString("email_employee");
                    String addressEmployee = rs.getString("address_employee");
                    String username = rs.getString("username");
                    employee = new Employee(idEmployee, nameEmployee, idPositive, idDegreeEducation, idDivision, dayOfBirth,
                            identityCardEmployee, salary, phoneNumber, emailEmployee, addressEmployee, username);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return employee;
    }
}

