package com.finalproject.allyoucanbuyproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    @Email
    @NotBlank(message = "Email can't be empty")
    private String email;
    private String address;
    private String role;

    @OneToMany(mappedBy = "user")
    private List<OrderModel> orders;

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
