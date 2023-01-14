package com.challenge.crud.service;

import com.challenge.crud.exceptions.ExceptionBadRequest;
import com.challenge.crud.libs.ValidacaoUser;
import com.challenge.crud.model.UserModel;
import com.challenge.crud.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserModel createUser(UserModel userModel){
        ValidacaoUser.validation(userModel);

        Boolean existsEmail = this.userRepository.existsByEmail(userModel.getEmail());
        Boolean existsPhone = this.userRepository.existsByPhone(userModel.getPhone());

        if(existsEmail) throw new ExceptionBadRequest("Email já cadastrado");

        if(existsPhone) throw new ExceptionBadRequest("Telefone já cadastrado");

        return this.userRepository.save(userModel);
    }

    @Override
    public List<UserModel> readUser(){
        return this.userRepository.findAll();
    }

    @Override
    public UserModel findUser(Long id){
        Optional<UserModel> usuario = this.userRepository.findById(id);

        return usuario.orElseThrow( () -> new ExceptionBadRequest("Nenhum usuário encontrado"));
    }

    @Override
    public UserModel updateUser(Long id, UserModel userModel){
        ValidacaoUser.validation(userModel);

        UserModel user = this.findUser(id);
        user.setName(userModel.getName());
        user.setEmail(userModel.getEmail());
        user.setPhone(userModel.getPhone());

        return this.userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id){
        boolean exists = this.userRepository.existsById(id);

        if(exists) this.userRepository.deleteById(id);
    }



}
