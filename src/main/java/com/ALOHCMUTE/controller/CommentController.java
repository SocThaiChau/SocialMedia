package com.ALOHCMUTE.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.model.CommentModel;
import com.ALOHCMUTE.service.CommentService;
import com.ALOHCMUTE.service.PostService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
    private CommentService commentsService;
	
	@Autowired
    private PostService postService;
	
	@GetMapping("/list")
	public String listComments(Model model) {
	    List<Comments> comments = commentsService.findAll();

	    // Iterate through comments and limit to the top 5
	    List<Comments> top5Comments = comments.stream().limit(5).collect(Collectors.toList());

	    model.addAttribute("top5Comments", top5Comments);
	    model.addAttribute("allComments", comments);

	    return "redirect:/home";
	}
	
	@RequestMapping("home")
	public String listComments(ModelMap model) {
	    List<Comments> listComments = commentsService.findAll();

	    List<String> base64Images = new ArrayList<>();
	    for (Comments comment : listComments) {
	        byte[] imageData = comment.getImage();
	        if (imageData != null && imageData.length > 0) {
	            String base64Image = Base64.getEncoder().encodeToString(imageData);
	            base64Images.add(base64Image);
	        } else {
	            base64Images.add(null);
	        }
	    }

	    model.addAttribute("comments", listComments);
	    model.addAttribute("base64Images", base64Images);
	    return "home";
	}


//    // Display all comments
//    @GetMapping("/list")
//    public String listComments(Model model) {
//        List<Comments> comments = commentsService.findAll();
//        model.addAttribute("comments", comments);
//        return "redirect:/home";
//    }
	
    @PostMapping("/save-comment")
    public ModelAndView addComment(ModelMap model, @Valid @ModelAttribute("comments") CommentModel commentModel,
    								@RequestParam("image") MultipartFile imageFile){
    	Comments comment = new Comments();
    	
    	Posts post = postService.getPostById(commentModel.getPostId());
        
    	if (!imageFile.isEmpty()) {
            try (InputStream is = imageFile.getInputStream()) {
            	byte[] imageBytes = is.readAllBytes();
                comment.setImage(imageBytes);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
        }
    	comment.setPosts(post);
        BeanUtils.copyProperties(commentModel, comment);

        commentsService.saveComment(comment);

     	return new ModelAndView("redirect:/home", model);
    }
}
