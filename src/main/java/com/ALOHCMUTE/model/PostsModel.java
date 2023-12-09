package com.ALOHCMUTE.model;

import java.util.Date;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import com.ALOHCMUTE.entity.Users;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class PostsModel {
	private int postId;
	private String content;
	private MultipartFile imageData =null;
	private String postTime;
	private boolean privacyLevel = true;
    private Users users;
	private boolean isEdit = false;
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
	 * @return the imageData
	 */
	public MultipartFile getImageData() {
		return imageData;
	}
	/**
	 * @param imageData the imageData to set
	 */
	public void setImageData(MultipartFile imageData) {
		this.imageData = imageData;
	}
	/**
	 * @return the postTime
	 */
	public String getPostTime() {
		return postTime;
	}
	/**
	 * @param postTime the postTime to set
	 */
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	/**
	 * @return the privacyLevel
	 */
	public boolean isPrivacyLevel() {
		return privacyLevel;
	}
	/**
	 * @param privacyLevel the privacyLevel to set
	 */
	public void setPrivacyLevel(boolean privacyLevel) {
		this.privacyLevel = privacyLevel;
	}
	/**
	 * @return the isEdit
	 */
	public boolean isEdit() {
		return isEdit;
	}
	/**
	 * @param isEdit the isEdit to set
	 */
	public void setEdit(boolean isEdit) {
		this.isEdit = isEdit;
	}
	
	
}
