package com.ALOHCMUTE.controller;
import java.security.Principal;
import java.util.*;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.service.ICommentService;
import com.ALOHCMUTE.service.ILikesService;
import com.ALOHCMUTE.service.IPostsService;
import com.ALOHCMUTE.service.impl.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.ProfileRepository;
import com.ALOHCMUTE.repository.UserRepository;
import com.ALOHCMUTE.service.IProfileService;

import javax.servlet.http.HttpSession;

@Controller
public class ProfileController {
	private final UserRepository userRepository;
	@Autowired
	IProfileService profileService;
    @Autowired
    IPostsService postsService;
    @Autowired
    private CommentService commentsService;
    @Autowired
    ILikesService likesService;
    @Autowired
    ICommentService commentService;
    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping("/profile")
    public String showUserProfile(ModelMap model, HttpSession session) {
        // Retrieve userId from the session
        int userId = (int) session.getAttribute("userId");
//        List<Posts> listposts = postsService.findAll();
        List<Posts> listposts = postsService.findByUserId(userId);
//        Optional<Profiles> listProfile = profileService.findById(userId);
        Optional<Profiles> listProfileOptional = profileService.findById(userId);

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
        if (listProfileOptional.isPresent()) {
            Profiles listProfile = listProfileOptional.get();
            // The profile exists, and you can use it.
            System.out.println("có profile");
            model.addAttribute("listProfile", listProfile);
        }
        model.addAttribute("base64Images", base64Images);
        model.addAttribute("posts", listposts);
//        model.addAttribute("listProfile", listProfile);
        model.addAttribute("likesService", likesService);
        model.addAttribute("commentService",commentService);


        // Thêm bình luận vào danh sách
        List<Comments> listComments = commentsService.findAll();
        listComments.sort(Comparator.comparingInt(Comments::getCommentId).reversed());

        List<String> base64Images2 = new ArrayList<>();
        for (Comments comment : listComments) {
            byte[] imageData = comment.getImage();
            if (imageData != null && imageData.length > 0) {
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                base64Images2.add(base64Image);
            } else {
                base64Images2.add(null);
            }
        }

        model.addAttribute("comments", listComments);
        model.addAttribute("base64Images2", base64Images2);
        return "profile";
    }
}
