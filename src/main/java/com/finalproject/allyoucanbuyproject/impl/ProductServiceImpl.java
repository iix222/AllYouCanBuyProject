package com.finalproject.allyoucanbuyproject.impl;

import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.repository.ProductRepository;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel getProductById(Long id) {
        Optional<ProductModel> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);
    }

    @Override
    public ProductModel addProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public List<ProductModel> searchProducts(String query) {
        return productRepository.findByProductNameContainingIgnoreCase(query);
    }
}