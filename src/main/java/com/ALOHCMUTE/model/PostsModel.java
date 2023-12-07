package com.ALOHCMUTE.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostsModel {
	private int postId;
	private String content;
	private MultipartFile imageData =null;
	private String postTime;
	private boolean privacyLevel = true;
	private boolean isEdit = false;
	
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public MultipartFile getImageData() {
		return imageData;
	}
	public void setImageData(MultipartFile imageData) {
		this.imageData = imageData;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	public boolean isPrivacyLevel() {
		return privacyLevel;
	}
	public void setPrivacyLevel(boolean privacyLevel) {
		this.privacyLevel = privacyLevel;
	}
	public boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(boolean isEdit) {
		this.isEdit = isEdit;
	}
	
	
}
