package com.redskyfilms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redskyfilms.entity.UserEntity;
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

    @GetMapping("/user/{id}")
    public Optional<UserEntity> get_user_by_id(@PathVariable Long id){
        return userService.get_user_by_id(id);
    }
}
