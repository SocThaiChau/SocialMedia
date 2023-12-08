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
	
}
