package dao;

import model.Contract;
import model.Customer;
import model.Employee;
import model.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuramaDAOImp implements FuramaDAO {
    private static final String SELECT_CUSTOMER = "select * from customer";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from customer where id = ?";
    private static final String SELECT_SERVICE = "select * from service";
    private static final String SELECT_EMPLOYEE = "select * from employee";
    private static final String SELECT_CONTRACT = "select * from contract";
    private static final String INSERT_NEW_CUSTOMER = "insert into customer values (?,?,?,?,?,?,?,?,?)";
    private static final String INSERT_NEW_CONTRACT = "insert into contract values (?,?,?,?,?,?,?,?)";
    private static final String DELETE_CUSTOMER = "delete from customer where id_customer = ?";
    private static final String INSERT_NEW_CONTRACT_DETAIL = "insert into contract_detail values (?,?,?,?,?,?,?,?,?)";


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
                preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }
}
