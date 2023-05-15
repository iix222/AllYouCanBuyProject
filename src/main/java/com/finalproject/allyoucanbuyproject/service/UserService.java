package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.dto.UpdateUserRequest;
import com.finalproject.allyoucanbuyproject.model.UserModel;
import com.finalproject.allyoucanbuyproject.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel saveUser(UserModel userModel) { return
        userRepository.save(userModel);
    }

    public List<UserModel> getAllUsers() {return userRepository.findAll();}

    public UserModel getUserById(Long userId) {return userRepository.findById(userId).orElse(null);}

    public List<UserModel> getUserByUserName(String userName) {
        return userRepository.findAllByUserName(userName);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public UserModel updateById(Long id, UpdateUserRequest updateUserRequest) {
        UserModel userModel = new UserModel();
        userModel.setId(id);
        userModel.setUserName(updateUserRequest.getUserName());
        userModel.setFirstName(updateUserRequest.getFirstName());
        userModel.setAddress(updateUserRequest.getAddress());
        userModel.setEmail(updateUserRequest.getEmail());
        userModel.setLastName(updateUserRequest.getLastName());
        userModel.setRole(userModel.getRole());
        return userRepository.save(userModel);
    }


}
