package com.ALOHCMUTE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.service.UserService;

@Controller
public class SearchController {
	@Autowired
    private UserService userService;

    @PostMapping("/search")
    public String searchUser(@RequestParam String keyword, Model model) {
        Users user = userService.getUserByUsername(keyword);

        if (user != null) {
            model.addAttribute("user", user);
            return "redirect:/users/" + user.getUserId() + "/profile";
        } else {
            // Xử lý trường hợp không tìm thấy người dùng
            return "redirect:/search?error=true";
        }
    }
}
