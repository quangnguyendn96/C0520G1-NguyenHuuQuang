package quang.company.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.example.model.Question;


import java.util.List;


public interface QuestionService {


    List<Question> findAll();


    public Question findById(Long id);

    public void save(Question question);

    public void deleteById(Long id);

//    void add(Product product);
//
//    Product findById(Long id);
//
//    void delete(Long id);
//
//    Page<Product> findBlogByName(int category, String name, Pageable pageable);
//    Page<Product> findByAllField(String name, Pageable pageable);
//
//    void deleteByCheckBox(List<Long> list);
}
