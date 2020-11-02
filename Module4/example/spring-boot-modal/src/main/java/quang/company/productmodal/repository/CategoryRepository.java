package quang.company.productmodal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.productmodal.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}