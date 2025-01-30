package com.cjc.login.registration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	List<Student> sl=new ArrayList<Student>();
		
	
	@RequestMapping("/")
	public String homePage() {
		
		
		return "index";
	}
	
	@RequestMapping("/regi")
	public String registerPage() {
		
		
		return "registration";
	}
	
	@RequestMapping("/register")
	public String registerPagetoGome(@ModelAttribute Student s) {
	sl.add(s);
		System.out.println(sl);
		return "index";
	}
	
	@RequestMapping("/login")
	public String successPage(@RequestParam ("username") String us,@RequestParam ("password") String ps,Model m) {
		
		if(us.equals("admin")&&ps.equals("admin")) {
			m.addAttribute("data",sl);
			return "success";
		}
		else {
			for (Student student : sl) {
				if (us.equals(student.getUsername())&& ps.equals(student.getPassword())) {
					List<Student>sl1=new ArrayList<Student>();
					sl1.add(student);
					m.addAttribute("data",sl1);
					return "success";
				}
				System.out.println();
			}
		}
		return ps;
		
		
	}
	
	
}
