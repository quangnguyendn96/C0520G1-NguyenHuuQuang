package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
}
