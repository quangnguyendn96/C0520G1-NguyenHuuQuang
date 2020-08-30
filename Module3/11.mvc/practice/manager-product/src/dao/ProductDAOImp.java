package dao;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImp implements ProductDAO {
    private static List<Product> listProduct;

    static {
        listProduct = new ArrayList<>();
        listProduct.add(new Product("1","Television","1000","electronic","new"));
        listProduct.add(new Product("2","Smartphone","500","electronic","new"));
        listProduct.add(new Product("3","shoe","100","fashion","available"));
        listProduct.add(new Product("4","milk","10","beverage","warning"));
        listProduct.add(new Product("5","laptop","2000","electronic","old"));
        listProduct.add(new Product("6","fan","50","electronic","new"));
        listProduct.add(new Product("7","meal","20","food","available"));
        listProduct.add(new Product("8","coca","5","beverage","available"));
        listProduct.add(new Product("9","shirt","70","fashion","new"));
        listProduct.add(new Product("10","underwear","80","fashion","old"));
    }

    @Override
    public List<Product> showAll() {
        return listProduct;
    }

    @Override
    public boolean save(Product product) {
        return listProduct.add(product);
    }

    @Override
    public Product findById(String id) {
        return null;

    }
}
