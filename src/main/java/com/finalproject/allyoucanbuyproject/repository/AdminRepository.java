package com.finalproject.allyoucanbuyproject.repository;


import com.finalproject.allyoucanbuyproject.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long> {}
