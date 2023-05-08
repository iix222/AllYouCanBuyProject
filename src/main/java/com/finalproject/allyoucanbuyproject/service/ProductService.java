package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductModel save(ProductModel product) {
        return productRepository.save(product);
    }

    public List<ProductModel> getAllProducts() { return productRepository.findAll(); }

}
