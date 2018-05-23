package com.commons.project.service.impl;

import com.commons.project.model.User;
import com.commons.project.repository.UserRepository;
import com.commons.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务层
 * by vision
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {

        return userRepository.findAll();
    }
}
