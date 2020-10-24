package quang.company.repository;

import quang.company.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImp implements ProductRepository{
    static Map<Integer, Product> myMap = new HashMap<>();

    static {
        myMap.put(1, new Product(1, "Samsung S9", "telephone", 10));
        myMap.put(2, new Product(2, "Nokia Symbian", "telephone", 10));
        myMap.put(3, new Product(3, "Iphone X", "telephone", 10));
        myMap.put(4, new Product(4, "Samsung S10", "camera", 10));
        myMap.put(5, new Product(5, "Sharp", "telephone", 10));
        myMap.put(6, new Product(6, "Mitsubishi", "frige", 10));

    }

    @Override
    public List<Product> showAll() {
        return new ArrayList<>(myMap.values());
    }

    @Override
    public Product findByName(int id) {
        return (myMap.get(id));
    }

    @Override
    public void update(int id, Product product) {
        myMap.put(id, product);
    }

    @Override
    public void save(Product product) {
        myMap.put(product.getId(), product);
    }

    @Override
    public List<Product> search(String string) {
        return null;
    }

    @Override
    public void remove(int id) {
        myMap.remove(id);
    }
}
