package com.ALOHCMUTE.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.service.CommentService;
import com.ALOHCMUTE.service.FileUploadService;
import com.ALOHCMUTE.service.UserService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
    private CommentService commentsService;
	
	@Autowired
	private UserService usersService;
	
	@Autowired
    private FileUploadService fileUploadService;

    // Display all comments
    @GetMapping("/list")
    public String listComments(Model model) {
        List<Comments> comments = commentsService.getAllComments();
        model.addAttribute("comments", comments);
        return "redirect:/home";
    }

    // Display a specific comment
    @GetMapping("/{commentId}")
    public String viewComment(@PathVariable int commentId, Model model) {
    	List<Comments> comments = commentsService.getCommentById(commentId);
        model.addAttribute("commentId", commentId);
        model.addAttribute("comments", comments);
        return "comments/view";
    }

    @PostMapping("/add-comment")
    public String addComment(@RequestParam("content") String content, @RequestParam("image") MultipartFile imageFile,
    							HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Comments comment = new Comments();
        
        if (!imageFile.isEmpty()) {
            String uniqueFileName = fileUploadService.saveFile(imageFile, "D:\\Pictures");
            comment.setImage(uniqueFileName);
        }
        
        comment.setContent(content);

        // Save the comment
        commentsService.saveComment(comment);
        
        // tra ve views
     	resp.sendRedirect(req.getContextPath() + "/home");

        return "redirect:/home";
    }
}
