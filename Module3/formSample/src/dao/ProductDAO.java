package dao;

import model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> showAllObj();

    Product getById(String id);

    void insertNewObj(Product obj);

    void editObj(Product obj);

    void deleteObj(String id);
     List<Product> searchObj(String nameSearch);

}
