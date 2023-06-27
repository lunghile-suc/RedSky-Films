package com.redskyfilms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redskyfilms.exceptions.UserNotFound;
import com.redskyfilms.model.User;
import com.redskyfilms.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create_user_account(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> get_user_by_id(Long id) {
        User user = userRepository.findById(id).orElse(null);

        if(user==null){
            throw new UserNotFound("User with " + id + " is not found");
        }else{
            return userRepository.findById(id);
        }
    }
}
