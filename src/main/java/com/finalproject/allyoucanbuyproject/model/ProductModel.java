package com.finalproject.allyoucanbuyproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product title cannot be null")
    private String productName;
    private String description;
    private String category;
    private String imageUrl;
    private double price;
    private int quantity;
    private int inventory;
    private String type;
    private String manufacturer;
    private String discount;
    public void setName(String name) {
    }

    public void setDiscount(String discount) {
    }

    public void setDescription(String description) {
        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...");
    }
}