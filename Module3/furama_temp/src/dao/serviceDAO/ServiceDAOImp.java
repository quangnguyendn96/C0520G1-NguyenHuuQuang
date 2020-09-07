package dao.serviceDAO;

import dao.dbConnection.DBConnection;
import model.service.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOImp implements ServiceDAO{
    private static final String SELECT_SERVICE = "select * from service";
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
}
