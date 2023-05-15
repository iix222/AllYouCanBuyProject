package com.finalproject.allyoucanbuyproject.repository;

import com.finalproject.allyoucanbuyproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findAllByUserName(String userName);

}
