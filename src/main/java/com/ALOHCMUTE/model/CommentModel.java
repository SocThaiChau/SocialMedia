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
	/**
	 * @return the commentId
	 */
	public int getCommentId() {
		return commentId;
	}
	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the image
	 */
	public MultipartFile getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	/**
	 * @return the commentReplyId
	 */
	public int getCommentReplyId() {
		return commentReplyId;
	}
	/**
	 * @param commentReplyId the commentReplyId to set
	 */
	public void setCommentReplyId(int commentReplyId) {
		this.commentReplyId = commentReplyId;
	}
	/**
	 * @return the postId
	 */
	public int getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	
}
