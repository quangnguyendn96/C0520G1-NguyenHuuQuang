package quang.company.productmodal.service;

import quang.company.productmodal.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category save(Category category);

    Category findById(Integer id);
    void delete(Integer id);
}
