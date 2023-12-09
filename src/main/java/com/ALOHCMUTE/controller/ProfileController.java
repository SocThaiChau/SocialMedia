package com.ALOHCMUTE.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ALOHCMUTE.entity.Profiles;
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
