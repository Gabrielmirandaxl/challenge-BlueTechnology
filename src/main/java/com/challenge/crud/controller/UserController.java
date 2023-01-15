package com.challenge.crud.controller;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/user")
public class UserController implements IUserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @Override
    @PostMapping
    public ResponseEntity<UserModel> create(@RequestBody UserModel userModel){
        return ResponseEntity.status(201).body(this.userService.createUser(userModel));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UserModel>> read(){
        return ResponseEntity.status(200).body(this.userService.readUser());
    }

    @Override
    @GetMapping("/pesq")
    public ResponseEntity<List<UserModel>> findEmailUser(@RequestParam("email") String email){
        return ResponseEntity.status(200).body(this.userService.findByEmail(email));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findOneUser(@PathVariable Long id){
        return ResponseEntity.status(200).body(this.userService.findUser(id));
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
