package com.ALOHCMUTE.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

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
import com.ALOHCMUTE.model.PostsModel;
import com.ALOHCMUTE.service.CommentService;
import com.ALOHCMUTE.service.FileUploadService;
import com.ALOHCMUTE.service.PostService;
import com.ALOHCMUTE.service.UserService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
    private CommentService commentsService;
	
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


    // Display all comments
    @GetMapping("/list")
    public String listComments(Model model) {
        List<Comments> comments = commentsService.findAll();
        model.addAttribute("comments", comments);
        return "redirect:/home";
    }
    
	
	/*
	 * @GetMapping("comments/{postId}") public String viewComments(@PathVariable
	 * Posts postId, ModelMap model) { Posts post = postService.getPostById(postId);
	 * // Fetch comments based on the postId using your service or repository
	 * List<Comments> comments = commentsService.getCommentsByPostId(postId);
	 * 
	 * // Add comments to the model model.addAttribute("post", post);
	 * model.addAttribute("comments", comments); return "comment"; }
	 */
	 

	/*
	 * // Display a specific comment
	 * 
	 * @GetMapping("/{commentId}") public String viewComment(@PathVariable int
	 * commentId, Model model) { List<Comments> comments =
	 * commentsService.getCommentById(commentId); model.addAttribute("commentId",
	 * commentId); model.addAttribute("comments", comments); return "comments/view";
	 * }
	 * 
	 * @GetMapping("add-comment") public String Add(ModelMap model) { CommentModel
	 * commentModel = new CommentModel(); model.addAttribute("comment",
	 * commentModel); return "home";
	 * 
	 * }
	 */
    @PostMapping("/save-or-update-comment")
    public ModelAndView addComment(ModelMap model, @Valid @ModelAttribute("comments") CommentModel commentModel,
    								@RequestParam("image") MultipartFile imageFile){
    	Comments comment = new Comments();
        
    	if (!imageFile.isEmpty()) {
            try (InputStream is = imageFile.getInputStream()) {
            	byte[] imageBytes = is.readAllBytes();
                comment.setImage(imageBytes);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
        }
        BeanUtils.copyProperties(commentModel, comment);

        commentsService.saveComment(comment);

     	return new ModelAndView("redirect:/home", model);
    }
    
//    @PostMapping("/add-comment")
//    public ModelAndView addComment(ModelMap model, @RequestParam("content") String content, @RequestParam("image") MultipartFile imageFile){
//        Comments comment = new Comments();
//        
//        if (!imageFile.isEmpty()) {
//            try (InputStream is = imageFile.getInputStream()) {
//            	byte[] imageBytes = is.readAllBytes();
//                comment.setImage(imageBytes);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//        }
//        
//        comment.setContent(content);
//
//        // Save the comment
//        commentsService.saveComment(comment);
//
//        return new ModelAndView("redirect:/home", model);
//    }
}
