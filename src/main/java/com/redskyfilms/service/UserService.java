package com.redskyfilms.service;

import java.util.Optional;
import com.redskyfilms.entity.UserEntity;
import com.redskyfilms.model.User;

public interface UserService {

    User create_user_account(User user);

    Optional<UserEntity> get_user_by_id(Long id);
    
}
