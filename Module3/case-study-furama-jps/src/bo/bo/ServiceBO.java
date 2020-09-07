package bo.bo;

import model.Employee;
import model.Service;

import java.util.List;

public interface ServiceBO {
    List<Service> showAllObj();
    Service getById(int id);
    void insertNewObj(Service obj);
    void editObj(Service obj);
    void deleteObj(int id);
}
