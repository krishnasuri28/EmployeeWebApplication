package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	@RequestMapping("/user")
	public String userHome () {
		return "index";
	}
	
	@RequestMapping("/admin")
	public String adminHome () {
		return "index";
	}

}
