package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<CategoryModel> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @PostMapping("/categories")
    public CategoryModel createCategory(@RequestBody CategoryModel category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/categories/{id}")
    public CategoryModel updateCategory(@PathVariable Long id, @RequestBody CategoryModel category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}