package quang.company.manager_product.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.manager_product.model.Product;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    void deleteAllByIdProductIn(List<Long> list);
    Page<Product> findProductByCategory_IdCategoryAndNameProductContaining(int category, String name, Pageable pageable);
}
