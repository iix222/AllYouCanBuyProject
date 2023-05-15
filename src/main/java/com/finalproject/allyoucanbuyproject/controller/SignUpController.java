package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.UserModel;
import com.finalproject.allyoucanbuyproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

//    @PostMapping("/signup")
//    public String signUp(@RequestParam("userModel") UserModel userModel
//
//
//    ) {
//        // Perform necessary processing and business logic
//        UserModel user = new UserModel(user);
//        userService.save(user);
//
//        // Redirect to a success page or display a success message
//        return "redirect:/signup-success";
//    }

}
