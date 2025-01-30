package com.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Employee;


@Controller
public class HomeController {

	List<Employee> el = new ArrayList<Employee>();
	
	@RequestMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/openreg")
	public String registerPage() {
		return "register";
	}

	@RequestMapping("/register")
	public String saveData(@ModelAttribute Employee e ) {
		el.add(e);
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("username") String us,@RequestParam("password") String ps,Model m) {
		
		if(us.equals("admin")&&ps.equals("admin")) {
			
			m.addAttribute("data",el);
			
			return "success";
		}
		else {
		for (Employee emp : el) {
			if(us.equals(emp.getUsername())&&ps.equals(emp.getPassword())) {
				List<Employee> l = new ArrayList<Employee>();
				l.add(emp);
				m.addAttribute("data",l);
				
				return "success";
			}
			else {
				return "login";
			}
		}
		
		}
		return "login";
	}
	@RequestMapping("/delete")
	public String deleteEployee(@RequestParam("id") int id,Model m) {
		for (Employee employee : el) {
			if (employee.getId()==id) {
				el.remove(employee);
				m.addAttribute("data",el);
				break;
				
			}
		}
		
		return "success";
	}
	
}
