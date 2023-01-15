package com.challenge.crud.service;

import com.challenge.crud.model.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> readUser();
    List<UserModel> findByEmail(String email);
    UserModel createUser(UserModel userModel);
    UserModel findUser(Long id);
    UserModel updateUser(Long id, UserModel userModel);
    void deleteUser(Long id);
}
