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
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private BigDecimal totalCost;

    private String deliveryAddress;

    private String userAddress;

    private LocalDate orderDate;

    @OneToMany(mappedBy = "orderModel")
    private List<OrderLine> orderLine = new ArrayList<>();


    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserModel user;

}