package bo;

import dao.ProductDAO;
import dao.ProductDAOImp;
import model.Product;

import java.util.List;

public class ProductBOImp implements ProductBO {
    ProductDAO productDAO = new ProductDAOImp();

    @Override
    public List<Product> showAllObj() {
        return productDAO.showAllObj();
    }

    @Override
    public Product getById(String id) {
        return productDAO.getById(id);
    }

    @Override
    public void insertNewObj(Product obj) {
        productDAO.insertNewObj(obj);
    }

    @Override
    public void editObj(Product obj) {
        productDAO.editObj(obj);
    }

    @Override
    public void deleteObj(String id) {
        productDAO.deleteObj(id);
    }

    @Override
    public List<Product> searchObj(String nameSearch) {
        return productDAO.searchObj(nameSearch);
    }


}
