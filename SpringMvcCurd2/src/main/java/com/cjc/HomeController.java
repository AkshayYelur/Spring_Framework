package com.cjc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.cjc.module.Student;


@Controller
public class HomeController {
	
	List<Student> al = new ArrayList<Student>();
	
	@RequestMapping("/")
	public String loginPage() {
		
	return "login";
	}
	
	@RequestMapping("/register")
	public String registerPage() {
		
		return "register";
	}
	
	
	
	
	@RequestMapping("/save")
	public String successPage(@ModelAttribute Student s,Model m) {
		//m.addAttribute("data",al);
		
		al.add(s);
		System.out.println(al);
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("username") String us,@RequestParam("password") String ps,Model m) {
		if(us.equals("admin")&&ps.equals("admin")) {
			m.addAttribute("data",al);
			return "success";
		}
		else
		{
			for (Student student : al) {
				if (student.getUsername().equals(us)&&student.getPassword().equals(ps))
				{
					List<Student>sl=new ArrayList<Student>();
					sl.add(student);
					m.addAttribute("data",sl);
					return "success";
				}
			}
		}
		
		
		return "login";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("rollno") int r,Model m) {
		
		for (Student student : al) {
			if(student.getRollno()==r) {
				al.remove(student);
				m.addAttribute("data", al);
				return "success";
			}
		}
		
		return "success";
	}
	
	@RequestMapping("/update")
	public String updateData(@RequestParam("rollno") int r,Model m) {
		for (Student student : al) {
			if(student.getRollno()==r) {
				
				m.addAttribute("data",student);
				return "update";
			
			}
		}
		return null;
		
		
	}
	
	@RequestMapping("/doupdate")
	public String doUpdate(@ModelAttribute Student ss,Model m) {
		for (Student student : al) {
			if (ss.getRollno()==student.getRollno()){
				int index=al.indexOf(student);
				al.set(index, ss);
				
				m.addAttribute("data",al);
				return "success";
			}
		}
		
		
		
		return "success";
	}
	
	

}


