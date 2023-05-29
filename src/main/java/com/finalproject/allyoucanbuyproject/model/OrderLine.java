package com.finalproject.allyoucanbuyproject.model;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
public class OrderLine {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductModel productModel;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderModel orderModel;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}