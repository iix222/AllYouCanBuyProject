package com.finalproject.allyoucanbuyproject.repository;

import com.finalproject.allyoucanbuyproject.model.UserModel;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
