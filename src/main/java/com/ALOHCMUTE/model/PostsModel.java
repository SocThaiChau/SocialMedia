package com.ALOHCMUTE.model;

import java.util.Date;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

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
	private boolean isEdit = false;
	public boolean isEdit() {
		return isEdit;
	}
	public void setEdit(boolean isEdit) {
		this.isEdit = isEdit;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
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
	public boolean isPrivacyLevel() {
		return privacyLevel;
	}
	public void setPrivacyLevel(boolean privacyLevel) {
		this.privacyLevel = privacyLevel;
	}
	
}
