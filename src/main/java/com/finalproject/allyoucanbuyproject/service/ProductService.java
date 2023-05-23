package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getAllProducts();

    ProductModel getProductById(Long id);

    ProductModel addProduct(ProductModel productModel);
}