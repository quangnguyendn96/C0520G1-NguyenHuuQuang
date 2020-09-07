package dao.customerDAO;

import dao.dbConnection.DBConnection;
import model.customer.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImp implements CustomerDAO {
    private static final String SELECT_ELEMENT = "select * from customer";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from customer where id = ?";
    private static final String EDIT_ELEMENT = "update into customer values (?,?,?,?,?,?,?,?,?) where id = ?";
    private static final String INSERT_NEW_ELEMENT = "insert into customer values (?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_ELEMENT = "delete from customer where id_customer = ?";


    @Override
    public List<Customer> showAllCustomer() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Customer> customerList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ELEMENT);
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

    @Override
    public void insertNewCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_ELEMENT);
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

    @Override
    public void editCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_ELEMENT);
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


    public Customer getIdCustomer(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Customer customer = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
                preparedStatement.setInt(1,id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int idTypeCustomer = rs.getInt("id_type_customer");
                    String nameCustomer = rs.getString("name_customer");
                    String dayOfBirthCustomer = rs.getString("day_of_birth_customer");
                    int genderCustomer = rs.getInt("gender_customer");
                    String identityCard = rs.getString("identity_card");
                    String phoneCustomer = rs.getString("phone_customer");
                    String emailCustomer = rs.getString("email_customer");
                    String addCustomer = rs.getString("add_customer");
                    customer = new Customer(id, idTypeCustomer, nameCustomer, dayOfBirthCustomer,
                            genderCustomer, identityCard, phoneCustomer, emailCustomer, addCustomer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return customer;
    }
    public void showAllInforEachCustomer(int id){
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement;
        try {
            callableStatement = connection.prepareCall("call all_info_customer(?)");
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteCustomer(int id){
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        if(connection != null){
            try{
                preparedStatement = connection.prepareStatement(DELETE_ELEMENT);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

}
