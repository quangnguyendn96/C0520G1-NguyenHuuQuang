package bo.contractBO;

import dao.contractDAO.ContractDAO;
import dao.contractDAO.ContractDAOImp;
import model.contract.Contract;

import java.util.List;

public class ContractBOImp implements ContractBO {
    ContractDAO contractDAO = new ContractDAOImp();

    @Override
    public List<Contract> showAllContract() {
        return contractDAO.showAllContract();
    }

    @Override
    public void insertNewContract(Contract contract) {
        contractDAO.insertNewContract(contract);
    }
}
