package bo;

import dao.ProductDAO;
import dao.ProductDAOImp;
import model.Product;

import java.util.List;

public class ProductBOImp implements ProductBO {
    private ProductDAO productDao = new ProductDAOImp();
    @Override
    public List<Product> showAll() {
        return productDao.showAll();
    }

    @Override
    public boolean save(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }

    @Override
    public void remove(int id) {
        productDao.remove(id);
    }
}
