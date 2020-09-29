package quang.company.manager_product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.manager_product.model.Product;
import quang.company.manager_product.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }


    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void deleteAllByIdProductIn(List<Long> list) {
        productRepository.deleteAllByIdProductIn(list);
    }
    @Override
    public List<Product> findBlogByName(int category,String name) {
        return productRepository.findProductByCategory_IdCategoryAndNameProductContaining(category,name);
    }
}
