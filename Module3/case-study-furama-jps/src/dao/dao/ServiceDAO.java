package dao.dao;

import model.Service;

import java.util.List;

public interface ServiceDAO {
    List<Service> showAllObj();
    Service getById(int id);
    void insertNewObj(Service obj);
    void editObj(Service obj);
    void deleteObj(int id);
}
