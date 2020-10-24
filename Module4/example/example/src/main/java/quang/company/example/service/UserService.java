package quang.company.example.service;

import quang.company.example.model.Question;
import quang.company.example.model.User;

import java.util.List;


public interface UserService {


    List<User> findAll();


    public User findById(Long id);

    public void save(User question);

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
