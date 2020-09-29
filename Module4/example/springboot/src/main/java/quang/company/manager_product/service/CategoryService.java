package quang.company.manager_product.service;

import quang.company.manager_product.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category save(Category category);

    Category findById(Integer id);
    void delete(Integer id);
}
