package com.finalproject.allyoucanbuyproject.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        try {
            // Read the contents of data.js file
            File file = ResourceUtils.getFile("src/main/resources/static/js/data.js");
            String jsonData = Files.readString(file.toPath(), StandardCharsets.UTF_8);

            // Parse the JSON data from data.js
            List<ProductModel> products = parseProductsFromJson(jsonData);

            // Return the products as a response
            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            // Handle any exceptions that occur
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Helper method to parse the products from JSON
    private List<ProductModel> parseProductsFromJson(String jsonData) {
        try {
            // Create an instance of ObjectMapper to parse JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Use the ObjectMapper to convert JSON into a List<ProductModel>
            return objectMapper.readValue(jsonData, new TypeReference<List<ProductModel>>() {});
        } catch (Exception e) {
            // Handle any exceptions that occur
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable("id") Long id) {
        ProductModel product = productService.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel product) {
        ProductModel newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public List<ProductModel> searchProducts(@RequestParam("query") String query) {
        return productService.searchProducts(query);
    }
}
