package com.ALOHCMUTE.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentModel {
	private int commentId;
	private String content;
	private Date createTime;
	private MultipartFile image = null;
	private int commentReplyId;
	private Posts postId;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public int getCommentReplyId() {
		return commentReplyId;
	}
	public void setCommentReplyId(int commentReplyId) {
		this.commentReplyId = commentReplyId;
	}
	public Posts getPostId() {
		return postId;
	}
	public void setPostId(Posts postId) {
		this.postId = postId;
	}
}
