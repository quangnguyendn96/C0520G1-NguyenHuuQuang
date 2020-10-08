package quang.company.blog.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.blog.model.Blog;
import quang.company.blog.repository.BlogRepository;
import quang.company.blog.service.BlogService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }


    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void deleteAllByIdBlogIn(List<Long> list) {
        blogRepository.deleteAllByIdBlogIn(list);
    }

    @Override
    public List<Blog> findBlogByName(int category, String name) {
        return blogRepository.findBlogByCategory_IdCategoryAndNameBlogContaining(category,name);
    }


}
