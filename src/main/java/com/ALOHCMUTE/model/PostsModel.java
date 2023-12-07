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
	private String content;
	private String image;
	private MultipartFile imageFile; // Luu anh
	private Date postTime;
	private boolean privacyLevel;
	private boolean isEdit = false;
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
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
