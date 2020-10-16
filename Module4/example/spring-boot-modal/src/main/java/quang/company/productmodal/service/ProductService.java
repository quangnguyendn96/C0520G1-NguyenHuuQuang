package quang.company.productmodal.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.productmodal.model.Product;

import java.util.List;


public interface ProductService {
    List<Product> findAll();

    Page<Product> findAllByStatusProductTrue(Pageable pageable);

    Page<Product> findAllByNameProductContaining(String name, Pageable pageable);

    Product save(Product product);

    Product findById(Long id);

    void delete(Long id);

    Page<Product> findBlogByName(int category, String name, Pageable pageable);

    void deleteByCheckBox(List<Long> list);
}
