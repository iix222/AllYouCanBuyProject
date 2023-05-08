package com.finalproject.allyoucanbuyproject.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductModel {
    private Long id;

    @NotNull(message= "Product can't be null")
    private String title;
    private String desc;
    private String category;
    private int price;

}
