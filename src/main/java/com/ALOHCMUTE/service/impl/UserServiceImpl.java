package com.ALOHCMUTE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.UserRepository;
import com.ALOHCMUTE.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Users findUserById(int receiverId) {
		return userRepository.findUserById(receiverId);
	}

}
