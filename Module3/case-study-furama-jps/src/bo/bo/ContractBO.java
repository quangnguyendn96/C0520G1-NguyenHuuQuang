package bo.bo;

import model.Contract;

import java.util.List;

public interface ContractBO {
    List<Contract> showAllObj();
    Contract getById(String id);
    void insertNewObj(Contract obj);
    void editObj(Contract obj);
    void deleteObj(String id);
}
