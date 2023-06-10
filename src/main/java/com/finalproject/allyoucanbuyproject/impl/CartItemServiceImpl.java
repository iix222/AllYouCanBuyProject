package com.finalproject.allyoucanbuyproject.impl;

import com.finalproject.allyoucanbuyproject.exceptions.NotFoundException;
import com.finalproject.allyoucanbuyproject.model.CartItemModel;
import com.finalproject.allyoucanbuyproject.repository.CartItemRepository;
import com.finalproject.allyoucanbuyproject.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItemModel> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public CartItemModel getCartItemById(Long id) {
        return cartItemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Cart item not found"));
    }

    @Override
    public void saveCartItem(CartItemModel cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public CartItemModel updateCartItem(Long id, CartItemModel updatedCartItem) {
        CartItemModel existingCartItem = cartItemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cart item not found with ID: " + id));

        // Update the properties of existingCartItem with the values from updatedCartItem
        existingCartItem.setProductName(updatedCartItem.getProductName());
        existingCartItem.setItemPrice(updatedCartItem.getItemPrice());
        existingCartItem.setDiscountedPrice(updatedCartItem.getDiscountedPrice());
        existingCartItem.setDiscount(updatedCartItem.getDiscount());
        existingCartItem.setQuantity(updatedCartItem.getQuantity());
        existingCartItem.setTotalPrice(updatedCartItem.getTotalPrice());

        // Save the updated cart item
        return cartItemRepository.save(existingCartItem);
    }

    @Override
    public CartItemModel addToCart(CartItemModel cartItem) {
        if (cartItem == null || cartItem.getProduct() == null || cartItem.getQuantity() <= 0) {
            throw new IllegalArgumentException("Invalid cart item");
        }

        // Perform calculations or apply discounts if needed

        double itemPrice = cartItem.getProduct().getPrice();
        int quantity = cartItem.getQuantity();
        double totalPrice = itemPrice * quantity;

        // Set the calculated total price in the cart item
        cartItem.setTotalPrice(totalPrice);

        CartItemModel savedCartItem = cartItemRepository.save(cartItem);
        return cartItemRepository.save(cartItem);
    }
}