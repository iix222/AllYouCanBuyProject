package com.finalproject.allyoucanbuyproject.model;

import javax.persistence.*;

import com.finalproject.allyoucanbuyproject.repository.AdminRepository;
import lombok.Getter;
import lombok.Setter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.util.List;


@Entity
@Getter
@Setter
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;

    public AdminModel() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}



