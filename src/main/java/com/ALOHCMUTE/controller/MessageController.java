package com.ALOHCMUTE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("message")
	public String Message(ModelMap model) {
		return "message";
	}
}
