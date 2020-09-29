package quang.company.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog save(Blog blog);

    Blog findById(Long id);

    void delete(Long id);

    void deleteAllByIdBlogIn(List<Long> list);

    List<Blog> findBlogByName(int category, String name);
    Page<Blog> findAll(Pageable pageable);
}
