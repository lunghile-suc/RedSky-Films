package com.redskyfilms.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redskyfilms.entity.UserEntity;
import com.redskyfilms.model.User;
import com.redskyfilms.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create_user_account(User user) {
        
        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);

        userRepository.save(userEntity);

        return user;
    }

    @Override
    public Optional<UserEntity> get_user_by_id(Long id) {

        return userRepository.findById(id);
    }
}
