package com.challenge.crud.controller;

import com.challenge.crud.service.UserService;

public class UserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
}
