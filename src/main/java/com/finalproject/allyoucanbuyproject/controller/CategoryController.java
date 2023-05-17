package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.service.CategoryService;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/categories")
    public List<CategoryModel> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @PostMapping("/categories")
    public CategoryModel createCategory(@RequestBody CategoryModel categoryModel) {
        return categoryService.createCategory(categoryModel);
    }

    @PutMapping("/categories/{id}")
    public CategoryModel updateCategory(@PathVariable Long id, @RequestBody CategoryModel categoryModel) {
        return categoryService.updateCategory(id, categoryModel);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
    @GetMapping("/main")
    public String mainPage(Model model) {
        List<CategoryModel> categories = productService.listCategories();
        model.addAttribute("categories", categories);
        return "index"; // Replace with the name of your HTML template
    }
}