package com.ALOHCMUTE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.ALOHCMUTE.entity.Notifications;
import com.ALOHCMUTE.service.NotificationService;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Endpoint để lưu thông báo mới
    @PostMapping
    public ResponseEntity<Void> createNotification(@RequestBody Notifications notification) {
        notificationService.saveNotification(notification);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // Endpoint để lấy thông báo chưa đọc của một người dùng
    @GetMapping("/unread/{receiverId}")
    public ResponseEntity<List<Notifications>> getUnreadNotifications(@PathVariable int receiverId) {
        List<Notifications> unreadNotifications = notificationService.getunreadNotificationsByReceiverId(receiverId);
        return ResponseEntity.ok(unreadNotifications);
    }


}


