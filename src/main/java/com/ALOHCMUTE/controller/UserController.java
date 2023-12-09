package com.ALOHCMUTE.controller;

import java.security.Principal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.service.UserService;

@Controller
public class UserController {
	
	  @Autowired private UserService userService;
	  
	  @GetMapping("/user/profile") public String getUserProfile(Model model, Principal principal) { 
		  if (principal == null) { 
			  return "redirect:/login";
		  }
	  
	  String username = principal.getName(); 
	  //String username = "NV01"; 
	  Users user = userService.getUserByUsername(username);
	  
	  if (user == null) { 
		  return "redirect:/error"; 
	  }
	  
	  List<Posts> posts = user.getPosts(); model.addAttribute("user", user);
	  model.addAttribute("posts", posts); return "user/profile"; }
	 
}
