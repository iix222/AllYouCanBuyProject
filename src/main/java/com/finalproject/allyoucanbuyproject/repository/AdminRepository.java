package com.finalproject.allyoucanbuyproject.repository;


import com.finalproject.allyoucanbuyproject.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long> {
    AdminModel getAdminById(Long id);
    List<AdminModel> findAll();
    void deleteAdminById(Long id);

    AdminModel saveAdmin(Long id);
}