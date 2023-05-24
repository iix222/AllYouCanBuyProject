package com.finalproject.allyoucanbuyproject.repository;

import com.finalproject.allyoucanbuyproject.model.CartItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemModel, Long> {

}