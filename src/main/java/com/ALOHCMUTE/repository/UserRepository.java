package com.ALOHCMUTE.repository;

import com.ALOHCMUTE.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ALOHCMUTE.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	Users findByUserName(String username);
	Users findByUserId(int userId);
}
