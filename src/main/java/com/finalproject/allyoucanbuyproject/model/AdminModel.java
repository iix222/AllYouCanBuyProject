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

    public AdminModel(String firstName, String lastName, String username, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    private final AdminRepository adminRepository;

    public AdminModel(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdminModel findAdminByUsername(String username) {
        for (AdminModel admin : adminModelList) {
            if (admin.getUsername().equals(username)) {
                return admin;
            }
        }
        return null;
    }
        AdminModel admin = new AdminModel("John", "Star", "john.star", "SetAdminJohn123!", "john.star@gmail.com");

        List<AdminModel> adminModelList = ; //Retrieve admin users from storage/database from repository
        public boolean isValidPassword (String password){
            return this.password.equals(password);
        }
        public boolean performLogin (String username, String password){
            AdminModel admin = findAdminByUsername(username);

            if (admin != null && admin.isValidPassword(password)) {
                return true;
            }
            return false;
        }
        public void saveToJsonFile (String filePath) throws IOException {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try (FileWriter writer = new FileWriter(filePath)) {
                gson.toJson(this, writer);
            }
            try {
                admin.saveToJsonFile("admin.js");
                System.out.println("Admin data saved to JSON file.");
            } catch (IOException e) {
                System.err.println("Error saving admin data to JSON file: " + e.getMessage());
            }

        }
    }



