package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.repository.CategoryRepository;
import com.finalproject.allyoucanbuyproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

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

        // Add the following method to populate the products
        public void populateProducts() {
            List<ProductModel> products = getProductsFromServerJS();

            for (ProductModel product : products) {
                productRepository.save(product);
            }
        }

        private List<ProductModel> getProductsFromServerJS() {
            List<ProductModel> productList = new ArrayList<>();

            productList.add(createProduct(1L, "Garden furniture", "Garden", "https://m.media-amazon.com/images/I/71AGDYIh4qL._AC_SX679_.jpg", "15% off", "99€"));
            productList.add(createProduct(2L, "Headphones", "Electronics", "https://m.media-amazon.com/images/I/61q8Esn5UvL._AC_SY879_.jpg", "15% off", "50€"));
            productList.add(createProduct(3L, "Instant camera", "Electronics", "https://m.media-amazon.com/images/I/412JsUs79hL._AC_SX679_.jpg", "50% off", "89€"));
            productList.add(createProduct(4L, "Dog bed", "Pets", "https://m.media-amazon.com/images/I/810uFCMRFuL._AC_SL1500_.jpg", "35% off", "49€"));
            productList.add(createProduct(5L, "Fountain", "Garden", "https://m.media-amazon.com/images/I/81VkLCn0gCL._AC_SX679_.jpg", "15% off", "150€"));
            productList.add(createProduct(6L, "Tempered glass", "Electronics", "https://m.media-amazon.com/images/I/61fkIpO4SxL._AC_SL1500_.jpg", "35% off", "9.95€"));
            productList.add(createProduct(7L, "Statue", "Garden", "https://m.media-amazon.com/images/I/81ljUc1awvL._AC_SL1500_.jpg", "35% off", "35€"));
            productList.add(createProduct(8L, "Dog bowl", "Pets", "https://m.media-amazon.com/images/I/61GYd8qG2QL._AC_SL1500_.jpg", "15% off", "35€"));
            productList.add(createProduct(9L, "Apple watch", "Electronics", "https://m.media-amazon.com/images/I/71wiSqyzn6L._AC_SL1500_.jpg", "0% off", "259€"));
            productList.add(createProduct(10L, "Cat toy set", "Pets", "https://m.media-amazon.com/images/I/61NPu0p-wsL._AC_SL1000_.jpg", "0% off", "15€"));
            productList.add(createProduct(11L, "Carrier", "Pets", "https://m.media-amazon.com/images/I/81jNiuZUXjL._AC_SL1500_.jpg", "0% off", "35€"));
            productList.add(createProduct(12L, "Lawnmower", "Garden", "https://m.media-amazon.com/images/I/71dCUT0RF1L._AC_SL1500_.jpg", "0% off", "349€"));

            return productList;
        }

        private ProductModel createProduct(Long id, String name, String category, String imageUrl, String discount, String price) {
            ProductModel productModel = new ProductModel();
            productModel.setId(id);
            productModel.setName(name);
            productModel.setCategory(category);
            productModel.setImageUrl(imageUrl);
            productModel.setDiscount(discount);
            productModel.setPrice(Double.parseDouble(price));
            // Set other properties of the ProductModel as needed
            return productModel;
        }

    public List<CategoryModel> listCategories() {
        return categoryRepository.findAll();
    }
}
