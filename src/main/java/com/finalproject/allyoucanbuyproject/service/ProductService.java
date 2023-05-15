package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(ProductModel productModel) {
        productRepository.save(productModel);
    }

    public List<ProductModel> getProductsByCategory(CategoryModel categoryModel) {
        return productRepository.findByCategory(categoryModel);
    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(ProductModel productModel) {
        productRepository.delete(productModel);
    }

    public ProductModel updateProduct(ProductModel productModel) {
        if (productModel.getId() == null) {
            throw new IllegalArgumentException("Product ID cannot be null");
        }
        return productRepository.save(productModel);
    }

    public void deleteById(Long id) {
    }
}