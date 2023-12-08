package com.ALOHCMUTE.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.model.PostsModel;
import com.ALOHCMUTE.service.IPostsService;



@Controller
public class PostsController {
	@Autowired
	IPostsService postsService;
	
	@RequestMapping("home")
	public String listposts(ModelMap model) {
		List<Posts> listposts = postsService.findAll();
		// Sắp xếp listposts theo postId từ lớn đến bé
	    listposts.sort(Comparator.comparingInt(Posts::getPostId).reversed());
		List<String> base64Images = new ArrayList<>();
        for (Posts post : listposts) {
            byte[] imageData = post.getImageData();
            if (imageData != null && imageData.length > 0) {
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                base64Images.add(base64Image);
            } else {
                base64Images.add(null); // hoặc có thể là một giá trị mặc định khác
            }
        }
		model.addAttribute("posts", listposts);	
		model.addAttribute("base64Images", base64Images);
		return "home";
	}
	
	@GetMapping("add")
	public String Add(ModelMap model) {
		PostsModel postsModel = new PostsModel();
		postsModel.setIsEdit(false);
		model.addAttribute("post", postsModel);
		return "AddOrEdit";
		
	}
	@PostMapping("/SaveOrUpdate")
	public ModelAndView SaveOrUpdate(ModelMap model, 
			@Valid @ModelAttribute("posts") PostsModel postsModel,
			@RequestParam("imageData") MultipartFile file,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return new ModelAndView("AddOrEdit");
		}
		Posts entity = new Posts();
		long currentTimestamp = System.currentTimeMillis();
		Date currentDate = new Date(currentTimestamp);        
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String formattedDate = dateFormat.format(currentDate);
		
		if (file != null && !file.isEmpty()) {
	        try (InputStream is = file.getInputStream()) {
	            byte[] imageBytes = is.readAllBytes();
	            entity.setImageData(imageBytes);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return new ModelAndView("AddOrEdit");
	        }
	    }		
		//copy từ Model sang entity
		BeanUtils.copyProperties(postsModel, entity);
		// Lưu thông tin thời gian
		entity.setPostTime(formattedDate);
		postsService.save(entity);
		return new ModelAndView("redirect:/home" ,model);
		
	}
	@GetMapping("/edit/{postId}")
	public ModelAndView edit(ModelMap model,
			@PathVariable("postId") int postId) {
		Optional<Posts> opt = postsService.findById(postId);
		
		PostsModel postsModel = new PostsModel();
		if(opt.isPresent()) {
			Posts entity = opt.get();
			BeanUtils.copyProperties(entity, postsModel); //copy từ entity sang Model
			postsModel.setIsEdit(true);
			model.addAttribute("posts", postsModel);
			return new ModelAndView("AddOrEdit",model);
		}
		
		return new ModelAndView("redirect:/home" ,model);
	}
	@GetMapping("/delete/{postId}")
	public ModelAndView delete(ModelMap model,
			@PathVariable("postId") int postId) {
		postsService.deleteById(postId);
		return new ModelAndView("redirect:/home" ,model); 
	}
}
