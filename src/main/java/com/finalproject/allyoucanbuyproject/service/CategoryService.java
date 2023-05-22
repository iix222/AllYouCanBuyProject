package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.repository.CategoryRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();
    }

    public CategoryModel getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElse(null);
    }

    public CategoryModel createCategory(CategoryModel category) {
        return categoryRepository.save(category);
    }

    public CategoryModel updateCategory(CategoryModel category) {
        if (category.getId() == null) {
            throw new IllegalArgumentException("Category ID cannot be null");
        }
        return categoryRepository.save(category);
    }

    public boolean deleteCategory(Long id) {
        try {
            categoryRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }
}