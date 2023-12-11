package com.ALOHCMUTE.service;

import java.util.List;

import com.ALOHCMUTE.entity.Users;

public interface IUserService {
	
	List<Users> findAll();

	Users findUserById(int receiverId);

	List<Users> findUserByUserName(String userName);

	<S extends Users> S save(S entity);
	
	
}
