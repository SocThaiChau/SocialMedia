package com.ALOHCMUTE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ALOHCMUTE.model.UserDto;
import com.ALOHCMUTE.service.IUsersService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserRegistrationController {
	private IUsersService userService;
    @ModelAttribute("userdto")
    public UserDto userResgistrationDto(){
        return new UserDto();
    }
    @GetMapping("/registration")
    public String showRegistrationForm(){
        return "/registration";
    }

    @PostMapping("/registration")
    public String registerUserAccount(@ModelAttribute("userdto") UserDto userDto){
        if(userService.checkUserbyEmail(userDto.getEmail())){
            return "redirect:/registration?emailexist";
        }
        if(userDto.getPassword().equals(userDto.getCheckPass())==false){
            return "redirect:/registration?checkpass";
        }
        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
