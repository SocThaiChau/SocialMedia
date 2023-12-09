package com.ALOHCMUTE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

    public Users getUserByUsername(String username) {
        return userRepository.findByUserName(username);
    }

    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
