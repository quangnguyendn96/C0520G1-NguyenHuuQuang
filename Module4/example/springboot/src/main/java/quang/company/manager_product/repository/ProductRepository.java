package quang.company.manager_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import quang.company.manager_product.model.Product;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    void deleteAllByIdProductIn(List<Long> list);
    List<Product> findProductByCategory_IdCategoryAndNameProductContaining(int category,String name);
}
