package com.finalproject.allyoucanbuyproject.repository;

import com.finalproject.allyoucanbuyproject.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}