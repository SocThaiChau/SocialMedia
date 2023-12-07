package com.ALOHCMUTE.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.model.PostsModel;
import com.ALOHCMUTE.service.IPostsService;



@Controller
@RequestMapping("home/post")
public class PostsController {
	@Autowired
	IPostsService postsService;
	
	@RequestMapping("")
	public String listposts(ModelMap model) {
		List<Posts> listposts = postsService.findAll();
		model.addAttribute("posts", listposts);
		return "home";
	}
	
	@GetMapping("add")
	public String Add(ModelMap model) {
		PostsModel postsModel = new PostsModel();
		postsModel.setIsEdit(false);
		model.addAttribute("post", postsModel);
		return "home/AddOrEdit";
		
	}
	
	@GetMapping("add")
	public ModelAndView saveOrUpdate(ModelMap model, @Valid @ModelAttribute("post") PostsModel  postsModel, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("");
		}
		Posts entity new Posts();
		//copy từ Model sang entity
		BeanUtils.copyProperties(postsModel, entity);
		
		postsService.save(entity);
		return new ModelAndView("forward:/home" ,model);
		
	}
}
