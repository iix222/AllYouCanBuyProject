package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.AdminModel;
import com.finalproject.allyoucanbuyproject.repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) { this.adminRepository = adminRepository; }

    public void save(AdminModel adminModel) { adminRepository.save(adminModel); }
}
