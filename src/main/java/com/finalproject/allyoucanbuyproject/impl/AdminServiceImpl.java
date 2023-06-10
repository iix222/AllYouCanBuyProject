package com.finalproject.allyoucanbuyproject.impl;

import com.finalproject.allyoucanbuyproject.model.AdminModel;
import com.finalproject.allyoucanbuyproject.repository.AdminRepository;
import com.finalproject.allyoucanbuyproject.service.AdminService;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminModel createAdmin(AdminModel adminModel) {
        return adminRepository.save(adminModel);
    }

    @Override
    public AdminModel getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public List<AdminModel> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public AdminModel updateAdmin(Long id, AdminModel adminModel) {
        if (adminRepository.existsById(id)) {
            adminModel.setId(id);
            return adminRepository.save(adminModel);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteAdmin(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public AdminModel getAuthenticatedAdmin() {
        return null;
    }

    @Override
    public void saveAdmin(AdminModel admin) {
        adminRepository.save(admin);
    }
    @Override
    public boolean performLogin(String username, String password) {
        return isValidPassword(username, password);
    }
    @Override
    public boolean isValidPassword(String username, String password) {
        AdminModel admin = findAdminByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }
    @Override
    public AdminModel findAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

//    @Override
//    public AdminModel getAuthenticatedAdmin() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null && authentication.isAuthenticated()) {
//            String username = authentication.getName();
//            return findAdminByUsername(username);
//        }
//        return null;
//    }


}
