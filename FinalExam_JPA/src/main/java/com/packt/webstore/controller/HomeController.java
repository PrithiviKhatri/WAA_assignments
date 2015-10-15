package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {


	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		System.out.println("in welcome ");
		model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only pace to live, work and play!!");
		
		return "welcome";
	}
 
}
