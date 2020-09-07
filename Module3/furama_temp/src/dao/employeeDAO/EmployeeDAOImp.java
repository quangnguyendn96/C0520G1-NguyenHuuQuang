package dao.employeeDAO;

import dao.dbConnection.DBConnection;
import model.employee.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO {
    private static final String SELECT_EMPLOYEE = "select * from employee";

    public List<Employee> showAllEmployee() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Employee> employeeList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int idEmployee = rs.getInt("id_employee");
                    String nameEmployee = rs.getString("name_employee");
                    int idPositive = rs.getInt("id_positive");
                    int idDegreeEducation = rs.getInt("id_degree_education");
                    int idDivision = rs.getInt("id_division");
                    String dayOfBirth  = rs.getString("day_of_birth");
                    String identityCardEmployee = rs.getString("identity_card_employee");
                    double salary = rs.getDouble("salary");
                    String phoneNumber = rs.getString("phone_number");
                    String emailEmployee = rs.getString("email_employee");
                    String addressEmployee  = rs.getString("address_employee");
                    String username = rs.getString("username");
                    employeeList.add(new Employee(idEmployee, nameEmployee, idPositive, idDegreeEducation, idDivision, dayOfBirth ,
                            identityCardEmployee, salary, phoneNumber, emailEmployee, addressEmployee , username));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return employeeList;
    }
}
