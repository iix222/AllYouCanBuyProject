package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.OrderLine;
import com.finalproject.allyoucanbuyproject.service.OrderLineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orderLines")
public class OrderLineController {
    private final OrderLineService orderLineService;

    public OrderLineController(OrderLineService orderLineService) {
        this.orderLineService = orderLineService;
    }

    @PostMapping
    public ResponseEntity<OrderLine> createOrderLine(@RequestBody OrderLine orderLine) {
        OrderLine createdOrderLine = orderLineService.createOrderLine(orderLine);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrderLine);
    }

    @PutMapping("/{orderLineId}")
    public ResponseEntity<OrderLine> updateOrderLine(@PathVariable Long orderLineId, @RequestBody OrderLine orderLine) {
        Optional<OrderLine> existingOrderLine = orderLineService.getOrderLineById(orderLineId);
        if (existingOrderLine.isPresent()) {
            orderLine.setId(orderLineId);
            OrderLine updatedOrderLine = orderLineService.updateOrderLine(orderLine);
            return ResponseEntity.ok(updatedOrderLine);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{orderLineId}")
    public ResponseEntity<Void> deleteOrderLine(@PathVariable Long orderLineId) {
        Optional<OrderLine> existingOrderLine = orderLineService.getOrderLineById(orderLineId);
        if (existingOrderLine.isPresent()) {
            orderLineService.deleteOrderLine(orderLineId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
