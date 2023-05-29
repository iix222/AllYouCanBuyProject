package com.finalproject.allyoucanbuyproject.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class UpdateUserRequest {
    @NotNull
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    @Email(message = "Please enter email in correct format")
    @NotNull (message = "Email can't be empty")
    private String email;
    private String address;
    private String role;



}
