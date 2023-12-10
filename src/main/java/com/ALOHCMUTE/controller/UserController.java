package com.ALOHCMUTE.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ALOHCMUTE.entity.Messages;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.model.MessageModel;
import com.ALOHCMUTE.model.UserModel;
import com.ALOHCMUTE.service.ILikesService;
import com.ALOHCMUTE.service.IMessageService;
import com.ALOHCMUTE.service.IPostsService;
import com.ALOHCMUTE.service.IUsersService;
import com.ALOHCMUTE.service.UserService;

@Controller
public class UserController {


	@Autowired
	IUsersService userService;

	@Autowired
	IPostsService postService;
	
	@Autowired
    ILikesService likesService;

	@GetMapping("/profile/userId={userId}")
	public ModelAndView getPostByUserId(@PathVariable int userId, ModelMap model) {
	    UserModel userModel = new UserModel();
	    List<Posts> userPost = postService.findPostByUserId(userId);  // Fix: Use the provided userId parameter
	    userPost.sort(Comparator.comparingInt(Posts::getPostId).reversed());

	    List<String> base64Images = new ArrayList<>();
	    for (Posts post : userPost) {
	        byte[] imageData = post.getImageData();
	        if (imageData != null && imageData.length > 0) {
	            String base64Image = Base64.getEncoder().encodeToString(imageData);
	            base64Images.add(base64Image);
	        } else {
	            base64Images.add(null);
	        }
	    }
	    model.addAttribute("postsList", userPost);
	    model.addAttribute("base64Images", base64Images);
	    model.addAttribute("user", userModel);
	    model.addAttribute("userId", userId);  // Fix: Use the provided userId parameter
	    model.addAttribute("likesService", likesService);
	    return new ModelAndView("user", model);
	}

}
