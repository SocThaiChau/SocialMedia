package com.ALOHCMUTE.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Notifications;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.NotificationRepository;

@Service // Đánh dấu đây là một bean của Spring có nhiệm vụ thực hiện các logic xử lý kinh doanh. Annotation này giúp Spring quản lý và tự động quản lý các bean.
public class NotificationService{
	private final NotificationRepository notificationRepository;

    @Autowired
    // Trong constructor, NotificationRepository được inject vào NotificationService thông qua dependency injection
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
// Lưu (hoặc cập nhật) một đối tượng Notifications vào cơ sở dữ liệu thông qua phương thức save.
    public void saveNotification(Notifications notification) {
        notificationRepository.save(notification);
    }
    
// Tìm kiếm các bản ghi Notifications có receiverId tương ứng và có trạng thái (status) là false
    public List<Notifications> getunreadNotificationsByReceiverId(int receiverId) {
    	List<Notifications> unreadNotifications = notificationRepository.findByReceiverIdAndStatus(receiverId, false);

        // Cập nhật trạng thái sau khi đọc
        for (Notifications notification : unreadNotifications) {
            notification.setStatus(true);
            notificationRepository.save(notification);
        }

        return unreadNotifications;
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