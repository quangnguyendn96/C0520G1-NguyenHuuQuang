package dao.daoImp;

import dao.dao.CustomerDAO;
import dao.dbConnection.DBConnection;
import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImp implements CustomerDAO {
    private static final String TABLE_NAME =" customer ";
    private static final String SELECT_OBJ = "select * from "+ TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from "+  TABLE_NAME + "where id_customer = ?";
    private static final String EDIT_OBJ = "update" + TABLE_NAME + "set id_type_customer = ?, name_customer = ?,day_of_birth_customer = ?," +
            " gender_customer= ?,identity_card = ?,phone_customer=?, email_customer= ?,add_customer=? where id_customer = ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where id_customer = ?";

    @Override
    public List<Customer> showAllObj() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        // objList
        List<Customer> objectList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int idCustomer = rs.getInt("id_customer");//col_1
                    int idTypeCustomer = rs.getInt("id_type_customer");//col_2
                    String nameCustomer = rs.getString("name_customer");
                    String dayOfBirthCustomer = rs.getString("day_of_birth_customer");
                    int genderCustomer = rs.getInt("gender_customer");
                    String identityCard = rs.getString("identity_card");
                    String phoneCustomer = rs.getString("phone_customer");
                    String emailCustomer = rs.getString("email_customer");
                    String addCustomer = rs.getString("add_customer");//col_
                    objectList.add(new Customer(idCustomer, idTypeCustomer, nameCustomer, dayOfBirthCustomer, genderCustomer,
                            identityCard, phoneCustomer, emailCustomer, addCustomer));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objectList;
    }

    @Override
    // obj
    public void insertNewObj(Customer obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_OBJ);
                statement.setInt(1, obj.getIdCustomer());
                statement.setInt(2, obj.getIdTypeCustomer());
                statement.setString(3, obj.getNameCustomer());
                statement.setString(4, obj.getDayOfBirthCustomer());
                statement.setInt(5, obj.getGenderCustomer());
                statement.setString(6, obj.getIdentityCard());
                statement.setString(7, obj.getPhoneCustomer());
                statement.setString(8, obj.getEmailCustomer());
                statement.setString(9, obj.getAddCustomer());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

    @Override
    public void editObj(Customer obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_OBJ);
                statement.setInt(1, obj.getIdTypeCustomer());
                statement.setString(2, obj.getNameCustomer());
                statement.setString(3, obj.getDayOfBirthCustomer());
                statement.setInt(4, obj.getGenderCustomer());
                statement.setString(5, obj.getIdentityCard());
                statement.setString(6, obj.getPhoneCustomer());
                statement.setString(7, obj.getEmailCustomer());
                statement.setString(8, obj.getAddCustomer());
                statement.setInt(9, obj.getIdCustomer());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }


    public Customer getById(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Customer customer = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
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

    public void deleteObj(int id){
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        if(connection != null){
            try{
                preparedStatement = connection.prepareStatement(DELETE_OBJ);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

}
