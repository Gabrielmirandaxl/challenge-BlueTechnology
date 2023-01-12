package com.challenge.crud.service;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public UserModel createUser(UserModel userModel){
        return this.userRepository.save(userModel);
    }



}
