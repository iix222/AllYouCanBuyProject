package com.finalproject.allyoucanbuyproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cart_items")
@Getter
@Setter
public class CartItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private ProductModel product;

    private double itemPrice;
    private double discountedPrice;
    private int quantity;
    private double totalPrice;

    public String getProductName() {
        return product.getProductName();
    }

    public void setProductName(String productName) {
        product.setProductName(productName);
    }

    public String getDiscount() {
        return product.getDiscount();
    }

    public void setDiscount(String discount) {
        product.setDiscount(discount);
    }
}