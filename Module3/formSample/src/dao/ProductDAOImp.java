package dao;

import dao.dbConnection.DBConnection;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImp implements ProductDAO {
    //cột trong table
    private static final String col_1 = "id";
    private static final String col_2 = "name";
    private static final String col_3 = "price";
    private static final String col_4 = "amount_number";
    private static final String col_5 = "color";
    private static final String col_6 = "description";
    private static final String col_7 = "category";
 ;


    // đổi tên table
    private static final String TABLE_NAME = " product ";
    private static final String SELECT_OBJ = "select * from " + TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from " + TABLE_NAME + "where  " + col_1 + "= ?";
    private static final String EDIT_OBJ = "update " + TABLE_NAME + "set " + col_2 + " = ? ," + col_3 + "= ? ," + col_4 + "= ? ," + col_5 + "= ? ,"
                 + col_6 + "= ? ," + col_7 + "= ? " + " where " + col_1 + "= ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where " + col_1 + " = ?";
    private static final String SEARCH_OBJ = "select * from" + TABLE_NAME + "where " + col_2 + " like ?";
    private static final String sort = "select * from" + TABLE_NAME + "order by " + col_2;

    // đổi tên obj
    @Override
    public List<Product> showAllObj() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Product> objList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String id = rs.getString(col_1);
                    String name = rs.getString(col_2);
                    String price = rs.getString(col_3);
                    String amountNumber = rs.getString(col_4);
                    String color = rs.getString(col_5);
                    String description = rs.getString(col_6);
                    String category = rs.getString(col_7);
                    objList.add(new Product(id, name, price, amountNumber, color,description,
                            category));
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
    public void insertNewObj(Product obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_OBJ);
                statement.setString(1, obj.getId());
                statement.setString(2, obj.getName());
                statement.setDouble(3, Double.parseDouble(obj.getPrice()));
                statement.setInt(4, Integer.parseInt(obj.getAmountNumber()));
                statement.setString(5, obj.getColor());
                statement.setString(6, obj.getDescription());
                statement.setString(7, obj.getCategory());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();

    }

    @Override
    public void editObj(Product obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_OBJ);
                statement.setString(7, obj.getId());
                statement.setString(1, obj.getName());
                statement.setDouble(2, Double.parseDouble(obj.getPrice()));
                statement.setInt(3, Integer.parseInt(obj.getAmountNumber()));
                statement.setString(4, obj.getColor());
                statement.setString(5, obj.getDescription());
                statement.setString(6, obj.getCategory());
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
    public Product getById(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Product product = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
                preparedStatement.setString(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String name = rs.getString(col_2);
                    String price = rs.getString(col_3);
                    String amountNumber = rs.getString(col_4);
                    String color = rs.getString(col_5);
                    String description = rs.getString(col_6);
                    String category = rs.getString(col_7);
                    product = new Product(id, name, price, amountNumber, color,description,
                            category);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return product;
    }

    @Override
    public List<Product> searchObj(String nameSearch) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Product> objectList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SEARCH_OBJ);
                preparedStatement.setString(1, "%" + nameSearch + "%");
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String id = rs.getString(col_1);
                    String name = rs.getString(col_2);
                    String price = rs.getString(col_3);
                    String amountNumber = rs.getString(col_4);
                    String color = rs.getString(col_5);
                    String description = rs.getString(col_6);
                    String category = rs.getString(col_6);
                    objectList.add(new Product(id, name, price, amountNumber, color,description,
                            category));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objectList;
    }


}



