package com.ALOHCMUTE.controller;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.ProfileRepository;
import com.ALOHCMUTE.repository.UsersRepository;
import com.ALOHCMUTE.service.IProfileService;
@Controller
public class ProfileController {
	
	private final UsersRepository userRepository;
	@Autowired
	IProfileService profileService;
	@Autowired
    public ProfileController(UsersRepository userRepository, IProfileService profileService) {
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