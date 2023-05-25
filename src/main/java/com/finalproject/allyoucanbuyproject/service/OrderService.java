package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.exceptions.OrderNotFoundException;
import com.finalproject.allyoucanbuyproject.model.OrderLine;
import com.finalproject.allyoucanbuyproject.model.OrderModel;
import com.finalproject.allyoucanbuyproject.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderModel save(OrderModel order) {
        return orderRepository.save(order);
    }
    public List<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderModel updateOrder(Long id, OrderModel orderModel) {
        if (orderModel.getId() == null) {
            throw new IllegalArgumentException("Order ID cannot be null");
        }
        return orderRepository.save(orderModel);
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    public Optional<OrderModel> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }

    public OrderModel addOrderLine(Long orderId, OrderLine orderLine) {
        Optional<OrderModel> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            OrderModel order = optionalOrder.get();
            order.getOrderLines().add(orderLine);
            orderLine.setOrderModel(order);
            return orderRepository.save(order);
        } else {
            throw new OrderNotFoundException("Order not found with ID: " + orderId);
        }
    }
}
