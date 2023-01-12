package com.challenge.crud.service;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel createUser(UserModel userModel){
        return this.userRepository.save(userModel);
    }

    public List<UserModel> readUser(){
        return this.userRepository.findAll();
    }



}
