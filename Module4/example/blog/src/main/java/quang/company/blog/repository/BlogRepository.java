package quang.company.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.blog.model.Blog;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
    void deleteAllByIdBlogIn(List<Long> list);

    List<Blog> findBlogByCategory_IdCategoryAndNameBlogContaining(int category,String name);

}
