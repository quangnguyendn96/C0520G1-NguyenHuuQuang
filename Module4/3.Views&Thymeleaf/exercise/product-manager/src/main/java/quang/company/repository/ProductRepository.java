package quang.company.repository;

import quang.company.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> showAll();
    Product findByName(int id);


    void update(int id, Product student);

    void save(Product student);

    public void remove(int id);

    List<Product> search(String string);
}
