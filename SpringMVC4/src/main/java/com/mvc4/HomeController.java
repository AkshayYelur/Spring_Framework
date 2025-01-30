package com.mvc4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
@Controller
public class HomeController {

	List<Student> al = new ArrayList<Student>();
	
	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/openreg")
	public String preRegister() {
		
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s) {
		al.add(s);
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("username") String us,@RequestParam("password") String ps,Model m) {
		
		if(us.equals("admin")&&ps.equals("admin")) {
			
			m.addAttribute("data",al);
			
			return "success";
		}
		else {
		return "login";
		}
		
	}
	
	
	}

