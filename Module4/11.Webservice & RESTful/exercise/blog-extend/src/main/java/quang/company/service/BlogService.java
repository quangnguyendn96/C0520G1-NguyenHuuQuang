package quang.company.service;

import quang.company.model.Blog;

import java.util.List;

public interface BlogService {
     List<Blog> findAll();

     Blog save(Blog blog);

     Blog findById(Long id);
    void delete(Long id);

}
