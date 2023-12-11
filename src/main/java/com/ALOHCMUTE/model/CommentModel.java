package com.ALOHCMUTE.model;

import java.util.Date;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentModel {
	private int commentId;
	private String content;
	private Date createTime;
	private MultipartFile image = null;
	private int commentReplyId;
	private int postId;
	private Users users;

}
