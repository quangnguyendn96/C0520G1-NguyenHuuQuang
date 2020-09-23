package quang.company.service;

import org.springframework.stereotype.Service;
import quang.company.model.Product;
import quang.company.repository.ProductRepository;
import quang.company.repository.ProductRepositoryImp;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    ProductRepository repository = new ProductRepositoryImp();

    @Override
    public List<Product> showAll() {
        return repository.showAll();
    }

    @Override
    public Product findByName(int id) {
        return repository.findByName(id);
    }

    @Override
    public void update(int id, Product product) {
        repository.update(id, product);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public List<Product> search(String string) {
        return null;
    }
}
