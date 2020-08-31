package dao;

import model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> showAll();

    boolean save(Product product);

    Product findById(int id);

    void remove(int id);
}
