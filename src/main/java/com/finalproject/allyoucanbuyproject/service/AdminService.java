package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.AdminModel;

import java.util.List;

public interface AdminService {
    AdminModel createAdmin(AdminModel adminModel);
    AdminModel getAdminById(Long id);
    List<AdminModel> getAllAdmins();
    AdminModel updateAdmin(Long id, AdminModel adminModel);
    boolean deleteAdmin(Long id);

    AdminModel getAuthenticatedAdmin();
}