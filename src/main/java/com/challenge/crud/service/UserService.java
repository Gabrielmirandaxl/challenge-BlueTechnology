package com.challenge.crud.service;

import com.challenge.crud.repository.UserRepository;

public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    


}
