package dao.daoImp;


import dao.dao.ServiceDAO;
import dao.dbConnection.DBConnection;

import model.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOImp implements ServiceDAO {
    private static final String TABLE_NAME = " service ";
    private static final String SELECT_OBJ = "select * from " + TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from " + TABLE_NAME + "where id_service = ?";
    private static final String EDIT_OBJ = "update" + TABLE_NAME + "set name_service = ?, area_service = ?,number_floor = ?," +
            " maximum_customer= ?, cost_rent = ?,id_type_service=?, id_type_rent= ?,description_other_convenience = ?,pool_area= ?," +
            "standard_room=?, where id_service = ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where id_service = ?";

    @Override
        public List<Service> showAllObj() {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement;
            // objList
            List<Service> objList = new ArrayList<>();
            if (connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(SELECT_OBJ);
                    ResultSet rs = preparedStatement.executeQuery();
                    while (rs.next()) {
                        int idService = rs.getInt("id_service");
                        String nameService = rs.getString("name_service");
                        double areaService = rs.getDouble("area_service");
                        int numberFloor = rs.getInt("number_floor");
                        int maximumCustomer = rs.getInt("maximum_customer");
                        double costRent = rs.getDouble("cost_rent");
                        int idTypeService = rs.getInt("id_type_service");
                        int idTypeRent = rs.getInt("id_type_rent");
                        String descriptionOtherConvenience = rs.getString("description_other_convenience");
                        double poolArea = rs.getDouble("pool_area");
                        String standardRoom = rs.getString("standard_room");
                        objList.add(new Service(idService, nameService, areaService, numberFloor, maximumCustomer, costRent,
                                idTypeService, idTypeRent, descriptionOtherConvenience, poolArea, standardRoom));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
            return objList;
        }

        @Override
        public void insertNewObj(Service obj) {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement;

            if (connection != null) {
                try {
                    statement = connection.prepareStatement(INSERT_NEW_OBJ);
                    statement.setInt(1, obj.getIdService());
                    statement.setString(2, obj.getNameService());
                    statement.setDouble(3, obj.getAreaService());
                    statement.setInt(4, obj.getNumberFloor());
                    statement.setInt(5, obj.getMaximumCustomer());
                    statement.setDouble(6, obj.getCostRent());
                    statement.setInt(7, obj.getIdTypeService());
                    statement.setDouble(8, obj.getIdTypeRent());
                    statement.setString(9, obj.getDescriptionOtherConvenience());
                    statement.setDouble(10, obj.getPoolArea());
                    statement.setString(11, obj.getStandardRoom());
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }
            DBConnection.close();

        }

        @Override
        public void editObj(Service obj) {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement;
            if (connection != null) {
                try {
                    statement = connection.prepareStatement(EDIT_OBJ);
                    statement.setInt(11, obj.getIdService());
                    statement.setString(1, obj.getNameService());
                    statement.setDouble(2, obj.getAreaService());
                    statement.setInt(3, obj.getNumberFloor());
                    statement.setInt(4, obj.getMaximumCustomer());
                    statement.setDouble(5, obj.getCostRent());
                    statement.setInt(6, obj.getIdTypeService());
                    statement.setDouble(7, obj.getIdTypeRent());
                    statement.setString(8, obj.getDescriptionOtherConvenience());
                    statement.setDouble(9, obj.getPoolArea());
                    statement.setString(10, obj.getStandardRoom());
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.close();
        }

        @Override
        public void deleteObj(int id) {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement;
            if (connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(DELETE_OBJ);
                    preparedStatement.setInt(1, id);
                    preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.close();
        }


        public Service getById(int id) {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement;
            Service service = null;
            if (connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
                    preparedStatement.setInt(1, id);
                    ResultSet rs = preparedStatement.executeQuery();
                    while (rs.next()) {
                        int idService = rs.getInt("id_service");
                        String nameService = rs.getString("name_service");
                        double areaService = rs.getDouble("area_service");
                        int numberFloor = rs.getInt("number_floor");
                        int maximumCustomer = rs.getInt("maximum_customer");
                        double costRent = rs.getDouble("cost_rent");
                        int idTypeService = rs.getInt("id_type_service");
                        int idTypeRent = rs.getInt("id_type_rent");
                        String descriptionOtherConvenience = rs.getString("description_other_convenience");
                        double poolArea = rs.getDouble("pool_area");
                        String standardRoom = rs.getString("standard_room");
                        service = new Service(idService, nameService, areaService, numberFloor, maximumCustomer, costRent,
                                idTypeService, idTypeRent, descriptionOtherConvenience, poolArea, standardRoom);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
            return service;
        }
    }


