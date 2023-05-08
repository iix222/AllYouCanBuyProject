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

    @GetMapping("/users")
    public String showUsersPage(ModelMap modelMap) {
        UserModel user = new UserModel();
        modelMap.addAttribute("User", user);
        return "create-user";
    }

    @PostMapping("/users")
    public String createUser(@ModelAttribute("user") UserModel userModel) {
        userService.save(userModel);
        return "redirect:/books";
    }
}