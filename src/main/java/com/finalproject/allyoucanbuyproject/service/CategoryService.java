package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryModel createCategory(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    public CategoryModel updateCategory(CategoryModel categoryModel) {
        if (categoryModel.getId() == null) {
            throw new IllegalArgumentException("Category ID cannot be null");
        }
        return categoryRepository.save(categoryModel);
    }

    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<CategoryModel> getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    public List<CategoryModel> getCategoryTree() {
        List<CategoryModel> rootCategories = categoryRepository.findByParentIdIsNull();
        populateChildren(rootCategories);
        return rootCategories;
    }

    private void populateChildren(List<CategoryModel> categories) {
        for (CategoryModel category : categories) {
            List<CategoryModel> children = categoryRepository.findByParentId(category);
            category.setChildCategories(children);
            populateChildren(children);
        }
    }
}