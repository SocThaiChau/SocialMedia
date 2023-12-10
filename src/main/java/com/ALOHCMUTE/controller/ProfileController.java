package com.ALOHCMUTE.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.repository.UserRepository;
import com.ALOHCMUTE.service.IProfileService;
@Controller
public class ProfileController {
	private final UserRepository userRepository;
	private final IProfileService profileService;
    @Autowired
    public ProfileController(UserRepository userRepository, IProfileService profileService) {
        this.userRepository = userRepository;
        this.profileService = profileService;
    }
    @RequestMapping("/profile/{userId}")
    public String showUserProfile(@PathVariable int userId, ModelMap model) {
        Profiles userProfile = profileService.findByUserId(userId);
        
        if (userProfile != null) {
            model.addAttribute("userProfile", userProfile);
            return "profile"; // Return your profile view
        } else {
            // Handle case when no profile is found for the given userId
            // You can redirect or display an error message
            return "profile_not_found"; // Return a custom error view
        }
    }
}
