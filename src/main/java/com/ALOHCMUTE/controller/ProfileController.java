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
import org.springframework.web.bind.annotation.RequestMapping;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.ProfileRepository;
import com.ALOHCMUTE.repository.UserRepository;
import com.ALOHCMUTE.service.IProfileService;
@Controller
public class ProfileController {
	private final UserRepository userRepository;
	@Autowired
	IProfileService profileService;
    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping("/profile")
    public String showUserProfile(ModelMap model) {
        List<Profiles> listProfile = profileService.findAll();
        model.addAttribute("listProfile", listProfile);
        return "profile";
    }
}
