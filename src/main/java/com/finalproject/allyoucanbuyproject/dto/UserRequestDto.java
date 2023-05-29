package com.finalproject.allyoucanbuyproject.dto;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
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
