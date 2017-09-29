package com.engagedryan.giflib.service;

import com.engagedryan.giflib.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);


}
