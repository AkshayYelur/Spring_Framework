package com.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String  indexPage() {
		System.out.println("This is Spring Container Click me");
		return "index";
	}
	
	@RequestMapping("/reg")
	public String successPage() {
		return "success";
	}
	
	}

