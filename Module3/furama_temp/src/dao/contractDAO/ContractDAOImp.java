package dao.contractDAO;

import dao.dbConnection.DBConnection;
import model.contract.Contract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDAOImp implements ContractDAO {
    private static final String SELECT_CONTRACT = "select * from contract";
    private static final String INSERT_NEW_CONTRACT = "insert into contract values (?,?,?,?,?,?,?,?)";
    private static final String INSERT_NEW_CONTRACT_DETAIL = "insert into contract_detail values (?,?,?,?,?,?,?,?,?)";
    @Override
    public List<Contract> showAllContract() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        List<Contract> contractList = new ArrayList<Contract>();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CONTRACT);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int idContract = rs.getInt("id_contract");
                    int idEmployee = rs.getInt("id_employee");
                    int idCustomer = rs.getInt("id_customer");
                    int idService  = rs.getInt("id_service");
                    String contractDate  = rs.getString("contract_date");
                    String identityCardEmployee = rs.getString("contract_expire");
                    double depositMoney = rs.getDouble("deposit_money");
                    double totalMoney = rs.getDouble("total_money");
                    contractList.add(new Contract(idContract, idEmployee, idCustomer, idService , contractDate ,
                            identityCardEmployee, depositMoney, totalMoney));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return contractList;
    }

    @Override
    public void insertNewContract(Contract contract) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_CONTRACT);
                statement.setInt(1, contract.getIdContract());
                statement.setInt(2, contract.getIdEmployee());
                statement.setInt(3, contract.getIdCustomer());
                statement.setInt(4, contract.getIdService());
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
}
