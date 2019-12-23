package com.example.validate_form.service.impl;

import com.example.validate_form.model.User;
import com.example.validate_form.repository.UserRepository;
import com.example.validate_form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
