package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String HOST = "localhost";
    private static final String POST = "3306";
    private static final String DATABASE = "furama_database_jsp";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "12345678";
    private static Connection connection;

    static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST+":" + POST+"/" + DATABASE, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    static void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}