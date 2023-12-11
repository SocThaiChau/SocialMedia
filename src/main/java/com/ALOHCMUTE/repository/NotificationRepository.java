package com.ALOHCMUTE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ALOHCMUTE.entity.Notifications;

@Repository
public interface NotificationRepository extends JpaRepository<Notifications, Integer>{
	// Lấy danh sách thông báo theo receiverId và status
    List<Notifications> findByReceiverIdAndStatus(int receiverId, Boolean status);

    // Lấy danh sách thông báo theo userId và status
    List<Notifications> findByUsers_UserIdAndStatus(int userId, Boolean status);

    // Lấy danh sách thông báo theo postId và status
    List<Notifications> findByPosts_PostIdAndStatus(int postId, Boolean status);

    // Lấy danh sách thông báo theo notificationId
	List<Notifications> findById(int notificationId);
}
