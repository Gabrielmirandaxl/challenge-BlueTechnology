package com.challenge.crud.service;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public UserModel findUser(Long id){
        Optional<UserModel> usuario = this.userRepository.findById(id);
        return usuario.orElseThrow( ()-> new RuntimeException("teste"));
    }

    public UserModel updateUser(Long id, UserModel userModel){
        UserModel user = this.findUser(id);
        user.setName(userModel.getName());
        user.setEmail(userModel.getEmail());
        user.setPhone(userModel.getPhone());

        return this.userRepository.save(userModel);
    }


    public void deleteUser(Long id){
        boolean exists = this.userRepository.existsById(id);

        if(exists) this.userRepository.deleteById(id);
    }



}
