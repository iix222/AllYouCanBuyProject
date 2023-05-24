package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.OrderLine;
import com.finalproject.allyoucanbuyproject.repository.OrderLineRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderLineService {
    private final OrderLineRepository orderLineRepository;

    public OrderLineService(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public OrderLine createOrderLine(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }

    public OrderLine updateOrderLine(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }

    public void deleteOrderLine(Long orderLineId) {
        orderLineRepository.deleteById(orderLineId);
    }

    public Optional<OrderLine> getOrderLineById(Long orderLineId) {
        return orderLineRepository.findById(orderLineId);
    }

}