package quang.company.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.blog.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
