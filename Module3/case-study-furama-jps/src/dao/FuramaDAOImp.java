package dao;

import model.Customer;
import model.Employee;
import model.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuramaDAOImp implements FuramaDAO {
    private static final String SELECT_CUSTOMER = "select * from customer";
    private static final String SELECT_SERVICE = "select * from service";
    private static final String SELECT_EMPLOYEE = "select * from employee";
    private static final String INSERT_NEW_CUSTOMER = "insert into customer values (?,?,?,?,?,?,?,?,?)";

    @Override
    public List<Customer> showAllCustomer() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Customer> customerList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int idCustomer = rs.getInt("id_customer");
                    int idTypeCustomer = rs.getInt("id_type_customer");
                    String nameCustomer = rs.getString("name_customer");
                    String dayOfBirthCustomer = rs.getString("day_of_birth_customer");
                    int genderCustomer = rs.getInt("gender_customer");
                    String identityCard = rs.getString("identity_card");
                    String phoneCustomer = rs.getString("phone_customer");
                    String emailCustomer = rs.getString("email_customer");
                    String addCustomer = rs.getString("add_customer");
                    customerList.add(new Customer(idCustomer, idTypeCustomer, nameCustomer, dayOfBirthCustomer,
                            genderCustomer, identityCard, phoneCustomer, emailCustomer, addCustomer));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return customerList;
    }

    public List<Service> showAllService() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Service> serviceList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_SERVICE);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int id_service = rs.getInt("id_service");
                    String name_service = rs.getString("name_service");
                    double area_service = rs.getDouble("area_service");
                    int number_floor = rs.getInt("number_floor");
                    int maximum_customer = rs.getInt("maximum_customer");
                    double cost_rent = rs.getDouble("cost_rent");
                    int id_type_service = rs.getInt("id_type_service");
                    int id_type_rent = rs.getInt("id_type_rent");
                    String description_other_convenience = rs.getString("description_other_convenience");
                    double pool_area = rs.getDouble("pool_area");
                    String standard_room = rs.getString("standard_room");
                    serviceList.add(new Service(id_service, name_service, area_service, number_floor, maximum_customer, cost_rent,
                            id_type_service, id_type_rent, description_other_convenience, pool_area, standard_room));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return serviceList;
    }

    public List<Employee> showAllEmployee() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Employee> employeeList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int id_employee = rs.getInt("id_employee");
                    String name_employee = rs.getString("name_employee");
                    int id_positive = rs.getInt("id_positive");
                    int id_degree_education = rs.getInt("id_degree_education");
                    int id_division = rs.getInt("id_division");
                    String day_of_birth = rs.getString("day_of_birth");
                    String identity_card_employee = rs.getString("identity_card_employee");
                    double salary = rs.getDouble("salary");
                    String phone_number = rs.getString("phone_number");
                    String email_employee = rs.getString("email_employee");
                    String address_employee = rs.getString("address_employee");
                    String username = rs.getString("username");
                    employeeList.add(new Employee(id_employee, name_employee, id_positive, id_degree_education, id_division, day_of_birth,
                            identity_card_employee, salary, phone_number, email_employee, address_employee, username));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return employeeList;
    }

    @Override
    public void insertNewCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_CUSTOMER);
                statement.setInt(1, customer.getIdCustomer());
                statement.setInt(2, customer.getIdTypeCustomer());
                statement.setString(3, customer.getNameCustomer());
                statement.setString(4, customer.getDayOfBirthCustomer());
                statement.setInt(5, customer.getGenderCustomer());
                statement.setString(6, customer.getIdentityCard());
                statement.setString(7, customer.getPhoneCustomer());
                statement.setString(8, customer.getEmailCustomer());
                statement.setString(9, customer.getAddCustomer());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        DBConnection.close();
    }
}
