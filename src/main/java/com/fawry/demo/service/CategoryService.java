package com.fawry.demo.service;

import com.fawry.demo.repository.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    Category addCategory(Category category);
    List<Category> getAll();
    Category getCategory(Long id);
    Category updateCategory(Long id , Category category);
    void deleteCategory(Long id);
}
