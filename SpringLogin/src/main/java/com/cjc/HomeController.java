package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {

	@RequestMapping("/")
	public String login() {
		return "index";
	}
	
	@RequestMapping("/log")
	public String success(@RequestParam("username") String un,@RequestParam("password") String ps) {
		System.out.println(un);
		System.out.println(ps);
		
		return "success";
	}
	
	
	
}
