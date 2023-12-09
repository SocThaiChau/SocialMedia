package com.ALOHCMUTE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ALOHCMUTE.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

	@Query("SELECT u FROM Users u WHERE u.userId = :receiverId")
	Users findUserById(@Param("receiverId") int receiverId);
	Users findByUserName(String username);
	Users findByUserId(int userId);
}
