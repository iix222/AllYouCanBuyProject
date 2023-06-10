package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.CartItemModel;
import com.finalproject.allyoucanbuyproject.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart/items")
public class CartItemController {

    private final CartItemService cartItemService;

    @Autowired
    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public List<CartItemModel> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable("id") Long id) {
        cartItemService.deleteCartItem(id);
    }

    @PutMapping("/{id}")
    public CartItemModel updateCartItem(@PathVariable Long id, @RequestBody CartItemModel cartItem) {
        return cartItemService.updateCartItem(id, cartItem);
    }

    @PostMapping
    public ResponseEntity<CartItemModel> addToCart(@RequestBody CartItemModel cartItem) {
        CartItemModel addedCartItem = cartItemService.addToCart(cartItem);
        return ResponseEntity.ok(addedCartItem);
    }
}
