package com.firewood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorlController {
	
	@RequestMapping("/hello")
	public String helloWorld(Model m) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		m.addAttribute("message", message);
		return "hello";
	}
}
