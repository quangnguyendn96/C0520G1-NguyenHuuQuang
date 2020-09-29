package quang.company.manager_product.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.manager_product.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
