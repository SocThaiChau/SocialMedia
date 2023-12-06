package com.ALOHCMUTE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String trangchu() {
		return "home";
	}
	@RequestMapping(value="/home")
	public String tranghome() {
		return "home";
	}

	@RequestMapping(value="/index")
	public String trangindex() {
		return "index";
	}
	
}
