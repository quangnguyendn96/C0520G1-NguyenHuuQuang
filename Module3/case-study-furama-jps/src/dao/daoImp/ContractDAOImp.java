package dao.daoImp;

import dao.dao.ContractDAO;
import dao.dbConnection.DBConnection;
import model.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDAOImp implements ContractDAO {
    private static final String INSERT_NEW_CONTRACT_DETAIL = "insert into contract_detail values (?,?,?,?,?,?,?,?,?)";
    private static final String TABLE_NAME = " contract ";
    private static final String SELECT_OBJ = "select * from " + TABLE_NAME;
    private static final String SELECT_OBJ_BY_ID = "select * from " + TABLE_NAME + "where id_contract = ?";
    private static final String EDIT_OBJ = "update" + TABLE_NAME + "set id_employee = ?, id_customer = ?,id_service = ?," +
            " contract_date= ?,contract_expire = ?,deposit_money=?, total_money= ? where id_contract = ?";
    private static final String INSERT_NEW_OBJ = "insert into " + TABLE_NAME + "values (?,?,?,?,?,?,?,?)";
    private static final String DELETE_OBJ = "delete from" + TABLE_NAME + "where id_contract = ?";


    @Override
    public List<Contract> showAllObj() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        // objList
        List<Contract> objectList = new ArrayList<>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String idContract = rs.getString("id_contract");
                    String idEmployee = rs.getString("id_employee");
                    String idCustomer = rs.getString("id_customer");
                    String idService = rs.getString("id_service");
                    String contractDate = rs.getString("contract_date");
                    String identityCardEmployee = rs.getString("contract_expire");
                    double depositMoney = rs.getDouble("deposit_money");
                    double totalMoney = rs.getDouble("total_money");
                    objectList.add(new Contract(idContract, idEmployee, idCustomer, idService, contractDate,
                            identityCardEmployee, depositMoney, totalMoney));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return objectList;
    }

    @Override
    public void insertNewObj(Contract contract) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_OBJ);
                statement.setString(1, contract.getIdContract());
                statement.setString(2, contract.getIdEmployee());
                statement.setString(3, contract.getIdCustomer());
                statement.setString(4, contract.getIdService());
                statement.setString(5, contract.getContractDate());
                statement.setString(6, contract.getContractExpire());
                statement.setDouble(7, contract.getDepositMoney());
                statement.setDouble(8, contract.getTotalMoney());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        DBConnection.close();

    }

    @Override
    public void editObj(Contract obj) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(EDIT_OBJ);
                statement.setString(8, obj.getIdContract());
                statement.setString(1, obj.getIdEmployee());
                statement.setString(2, obj.getIdCustomer());
                statement.setString(3, obj.getIdService());
                statement.setString(4, obj.getContractDate());
                statement.setString(5, obj.getContractExpire());
                statement.setDouble(6, obj.getDepositMoney());
                statement.setDouble(7, obj.getTotalMoney());
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
        if(connection != null){
            try{
                preparedStatement = connection.prepareStatement(DELETE_OBJ);
                preparedStatement.setString(1,id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }


    public Contract getById(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        Contract contract = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_OBJ_BY_ID);
                preparedStatement.setString(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    String idContract = rs.getString("id_contract");
                    String idEmployee = rs.getString("id_employee");
                    String idCustomer = rs.getString("id_customer");
                    String idService = rs.getString("id_service");
                    String contractDate = rs.getString("contract_date");
                    String identityCardEmployee = rs.getString("contract_expire");
                    double depositMoney = rs.getDouble("deposit_money");
                    double totalMoney = rs.getDouble("total_money");
                    contract = new Contract(idContract, idEmployee, idCustomer, idService, contractDate,
                            identityCardEmployee, depositMoney, totalMoney);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return contract;
    }
}
