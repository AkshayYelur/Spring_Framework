package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	
	
	@RequestMapping("/")
	public String preLogin() {
		System.out.println("This is Spring Container Click me");
		return "index";
	}
	
	@RequestMapping("/reg")
	public String succesPage() {
		return "success";
	}
	
	
}
