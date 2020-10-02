package quang.company.manager_product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.manager_product.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
