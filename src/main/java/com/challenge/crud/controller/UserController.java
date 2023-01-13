package com.challenge.crud.controller;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController implements IUserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @Override
    @PostMapping
    public ResponseEntity<UserModel> create(@RequestBody UserModel userModel){
        userModel.setRegistrionDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(201).body(this.userService.createUser(userModel));
    }
    @Override
    @GetMapping
    public ResponseEntity<List<UserModel>> read(){
        return ResponseEntity.status(200).body(this.userService.readUser());
    }
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findOneUser(@PathVariable Long id){
        UserModel user = this.userService.findUser(id);
        return ResponseEntity.status(200).body(user);
    }
    @Override
    @PutMapping("/{id}")
    public ResponseEntity<UserModel> update(@RequestBody UserModel userModel, @PathVariable Long id){

        return ResponseEntity.status(200).body(this.userService.updateUser(id, userModel));

    }
    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        this.userService.deleteUser(id);
        return ResponseEntity.status(200).body("Usuário deletado");

    }


}
