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
public class UserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody UserModel userModel){
        userModel.setRegistrionDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(201).body(userService.createUser(userModel));
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> read(){
        return ResponseEntity.status(200).body(userService.readUser());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Long id, @RequestBody UserModel userModel){
        Optional<UserModel> optionalUserModel = this.userService.findUser(id);
        if(!optionalUserModel.isPresent()){
            return ResponseEntity.status(404).body("Nenhum usuário encontrado");
        }

        var updateUser = optionalUserModel.get();
        updateUser.setName(userModel.getName());
        updateUser.setEmail(userModel.getEmail());
        updateUser.setPhone(userModel.getPhone());

        return ResponseEntity.status(200).body(this.userService.createUser(updateUser));

    }

}
