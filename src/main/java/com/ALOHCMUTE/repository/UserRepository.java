package com.ALOHCMUTE.repository;

import com.ALOHCMUTE.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	Users findByUserId(int userId);
}
