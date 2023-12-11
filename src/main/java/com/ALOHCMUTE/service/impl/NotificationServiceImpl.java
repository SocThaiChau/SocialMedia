package com.ALOHCMUTE.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.ALOHCMUTE.service.NotificationService;
import com.ALOHCMUTE.entity.Notifications;
import com.ALOHCMUTE.repository.NotificationRepository;


public class NotificationServiceImpl {
	private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }


	
	public void createNotificationForNewPost(int userId, int postId) {
		 Notifications notification = new Notifications();
	        notification.setActivity("New post created by user #" + userId + " at #" + new Date());
	        notification.setUsersId (userId);
	        notification.setStatus(false);
	        notification.setCreateTime(new Date());
	        notification.setPostId(postId);
	        // Lưu thông báo vào cơ sở dữ liệu
	        notificationRepository.save(notification);
	}


}
