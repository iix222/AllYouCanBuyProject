package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts(final ModelMap modelMap) {
        List<ProductModel> products = productService.getAllProducts();
        modelMap.addAttribute("products", products);
        return "main";
    }

    @GetMapping("/products/create")
    public String showCreateProductForm(ModelMap modelMap) {
        ProductModel productModel = new ProductModel();
        modelMap.addAttribute("product", productModel);
        return "create-product";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute("product")ProductModel productModel) {
        productService.addProduct(productModel);
        return "redirect:/products";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }
}


