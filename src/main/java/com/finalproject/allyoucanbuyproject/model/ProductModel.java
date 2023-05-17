package com.finalproject.allyoucanbuyproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message= "Product can't be null")
    private String title;
    private String desc;
    private String category;
    private String imageUrl;
    private double price;
    private int quantity;
    private int inventory;


    public void setName(String name) {
    }

    public void setDiscount(String discount) {
    }
}
