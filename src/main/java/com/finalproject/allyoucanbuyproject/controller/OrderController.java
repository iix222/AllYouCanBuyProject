package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.OrderModel;
import com.finalproject.allyoucanbuyproject.model.UserModel;
import com.finalproject.allyoucanbuyproject.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public String createOrder(@ModelAttribute("order") OrderModel orderModel) {
       orderService.save(orderModel);
       return "redirect:/orders";
   }

@GetMapping("/orders")
    public List<OrderModel> getAllOrders() { return orderService.getAllOrders();}

    @GetMapping("/orders/{id}")
    public Optional<OrderModel> getOrderById(Long id) {
        return orderService.getOrderById(id);}

    @PutMapping("/orders/{id}")
    public OrderModel updateOrder(@PathVariable Long id, @RequestBody OrderModel orderModel) {
        return orderService.updateOrder(id, orderModel);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Long id) { orderService.deleteOrder(id); }
}
