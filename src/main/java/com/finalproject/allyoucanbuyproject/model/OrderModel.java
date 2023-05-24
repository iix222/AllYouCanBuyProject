package com.finalproject.allyoucanbuyproject.model;

import com.finalproject.allyoucanbuyproject.service.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private BigDecimal totalCost;
    private String deliveryAddress;
    private String userAddress;
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }



}