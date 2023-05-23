package com.redskyfilms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redskyfilms.model.User;
import com.redskyfilms.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User create_user_account(@RequestBody User user){
        return userService.create_user_account(user);
    }
}
