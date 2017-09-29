package com.engagedryan.giflib.DAO;

import com.engagedryan.giflib.model.Category;

import java.util.List;

public interface ICategoryDAO {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);


}
