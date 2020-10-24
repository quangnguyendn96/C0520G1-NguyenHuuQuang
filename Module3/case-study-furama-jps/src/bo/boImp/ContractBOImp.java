package bo.boImp;

import bo.bo.ContractBO;
import dao.dao.ContractDAO;
import dao.daoImp.ContractDAOImp;
import model.Contract;

import java.util.List;

public class ContractBOImp implements ContractBO {
    ContractDAO contractDAO = new ContractDAOImp();

    @Override
    public List<Contract> showAllObj() {
        return contractDAO.showAllObj();
    }

    @Override
    public Contract getById(String id) {
        return contractDAO.getById(id);
    }

    @Override
    public void insertNewObj(Contract obj) {
        contractDAO.insertNewObj(obj);
    }

    @Override
    public void editObj(Contract obj) {
        contractDAO.editObj(obj);
    }

    @Override
    public void deleteObj(String id) {
        contractDAO.deleteObj(id);
    }
}
