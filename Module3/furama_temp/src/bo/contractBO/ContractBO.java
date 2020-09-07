package bo.contractBO;

import model.contract.Contract;

import java.util.List;

public interface ContractBO {
    List<Contract> showAllContract();

    void insertNewContract(Contract contract);
}
