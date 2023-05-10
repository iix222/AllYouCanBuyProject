package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.UserModel;
import com.finalproject.allyoucanbuyproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserModel user) {
        userService.save(user);
        return "redirect:/login"; // Redirect to the login page
    }


    @PostMapping("/save")
    public String saveUser(@ModelAttribute UserModel userModel) {
        userService.save(userModel);
        return "redirect:/";
    }
}