package dao.contractDAO;

import model.contract.Contract;

import java.util.List;

public interface ContractDAO {
    List<Contract> showAllContract();
    void insertNewContract(Contract contract);
}
