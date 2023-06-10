package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.CartItemModel;

import java.util.List;

public interface CartItemService {
    List<CartItemModel> getAllCartItems();
    CartItemModel getCartItemById(Long id);
    void saveCartItem(CartItemModel cartItem);
    void deleteCartItem(Long id);
    CartItemModel updateCartItem(Long id, CartItemModel updatedCartItem);
    CartItemModel addToCart(CartItemModel cartItem);

}