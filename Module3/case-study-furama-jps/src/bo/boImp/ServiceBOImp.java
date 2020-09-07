package bo.boImp;

import bo.bo.ServiceBO;
import dao.dao.ServiceDAO;
import dao.daoImp.ServiceDAOImp;
import model.Service;

import java.util.List;

public class ServiceBOImp implements ServiceBO {
    ServiceDAO serviceDAO = new ServiceDAOImp();

    @Override
    public List<Service> showAllObj() {
        return serviceDAO.showAllObj();
    }

    @Override
    public Service getById(int id) {
        return serviceDAO.getById(id);
    }

    @Override
    public void insertNewObj(Service obj) {
        serviceDAO.insertNewObj(obj);
    }

    @Override
    public void editObj(Service obj) {
        serviceDAO.editObj(obj);
    }

    @Override
    public void deleteObj(int id) {
        serviceDAO.deleteObj(id);
    }
}
