package com.ALOHCMUTE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.service.CommentService;
import com.ALOHCMUTE.service.UserService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
    private CommentService commentsService;
	
	@Autowired
	private UserService usersService;

    // Display all comments
    @GetMapping("/list")
    public String listComments(Model model) {
        List<Comments> comments = commentsService.getAllComments();
        model.addAttribute("comments", comments);
        return "comments/list";
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
    public String addComment(@RequestParam("commentId") int commentId, @RequestParam("content") String content) {
        Comments comment = new Comments();
        comment.setCommentId(commentId);
        comment.setContent(content);

        // Save the comment
        commentsService.saveComment(comment);

        return "redirect:/home";
    }
}
