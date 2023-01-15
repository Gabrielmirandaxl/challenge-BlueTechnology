package com.challenge.crud.controller;

import com.challenge.crud.model.UserModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserController {
    ResponseEntity<UserModel> create(UserModel usuario);
    ResponseEntity<List<UserModel>> read();
    ResponseEntity<List<UserModel>> findEmailUser(String email);
    ResponseEntity<UserModel> findOneUser(Long id);
    ResponseEntity<UserModel> update(UserModel userModel, Long id);
    ResponseEntity<String> delete(Long id);

}
