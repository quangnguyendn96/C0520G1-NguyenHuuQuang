package quang.company.productmodal.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import quang.company.productmodal.model.Product;
import quang.company.productmodal.repository.ProductRepository;
import quang.company.productmodal.service.ProductService;

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
    public Page<Product> findAllByStatusProductTrue(Pageable pageable) {
        return productRepository.findAllByStatusProductTrue(pageable);
    }

    @Override
    public Page<Product> findAllByNameProductContaining(String name, Pageable pageable) {
        return productRepository.findAllByNameProductContaining(name,pageable);
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

    //    @Override
//    public void deleteAllByIdProductIn(List<Long> list) {
//        productRepository.deleteAllByIdProductIn(list);
//    }
    @Override
    public Page<Product> findBlogByName(int category, String name, Pageable pageable) {
        return productRepository.findProductByCategory_IdCategoryAndNameProductContaining(category, name, pageable);
    }

    @Override
    public void deleteByCheckBox(List<Long> list) {
        for (Long product : list) {
            Product product1 = productRepository.findById(product).orElse(null);
            product1.setStatusProduct(false);
            productRepository.save(product1);
        }
    }
}
