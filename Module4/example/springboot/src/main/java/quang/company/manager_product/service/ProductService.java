package quang.company.manager_product.service;

import org.springframework.stereotype.Service;
import quang.company.manager_product.model.Product;

import java.util.List;


public interface ProductService {
    public List<Product> findAll();

    public Product save(Product product);

    public Product findById(Long id);
    void delete(Long id);
    void deleteAllByIdProductIn(List<Long> list);
    List<Product> findBlogByName(int category,String name);
}
