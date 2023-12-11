package com.ALOHCMUTE.model;

import java.util.Date;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class NotificationModel {
	private int notificationId;
	private String activity;
	private Date createTime;
    private int receiverId;
    private Boolean status;
    private int userID;
    private int postID;
}
