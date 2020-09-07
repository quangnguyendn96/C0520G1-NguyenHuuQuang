package dao.dao;

import model.Contract;

import java.util.List;

public interface ContractDAO {
    List<Contract> showAllObj();
    Contract getById(int id);
    void insertNewObj(Contract obj);
    void editObj(Contract obj);
    void deleteObj(int id);
}
