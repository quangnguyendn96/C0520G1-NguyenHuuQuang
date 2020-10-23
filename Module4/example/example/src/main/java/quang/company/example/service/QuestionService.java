package quang.company.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.example.model.Question;


import java.util.List;


public interface QuestionService{


    List<Question> findAll();

//    Page<Product> findAllByNameProductContaining(String name, Pageable pageable);
//    Page<Product> findAllByDateImport(String name, Pageable pageable);
//    Page<Product> findAllByDateExport(String name, Pageable pageable);
//    Page<Product> findAllByIdProductContaining(String name, Pageable pageable);
//    Page<Product> findAllByCategoryContaining(String name, Pageable pageable);
//    Page<Product> findAllByPriceProductContaining(Double name, Pageable pageable);
//
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
