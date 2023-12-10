package com.ALOHCMUTE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ALOHCMUTE.entity.Messages;
import com.ALOHCMUTE.entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer>{
	@Query("SELECT p FROM Posts p WHERE p.users.userId = :userId")
	List<Posts> findPostById(@Param("userId") int userId);
}
