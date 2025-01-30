package com.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	List<Admin> al = new ArrayList<Admin>();
	
	List<Employee> el = new ArrayList<Employee>();
	
	//Starting
	@RequestMapping("/")
	public String home() {
		
		
	return "home"; 
	}
	
	//Admin login
	@RequestMapping("/admin")
	public String adminLogin() {
		
		return "adminlogin";
	}
	
	//Employee Login
	@RequestMapping("/employee")
	public String employeeLogin() {
		
		return "employeelogin";
	}
	
	
	//AdminRegistration
	@RequestMapping("/adminreg")
	public String adminRegistration() {
		
		
		
		return "adminregister";
	}
	
	//Employee Registration 
	@RequestMapping("/employeereg")
	public String employeeRegistration() {
		return "employeeregister";
	}
	
	//emptohomepage
	@RequestMapping("/empregtohomepage")
	public String employeeRegistrationtohomePage(@ModelAttribute Employee e) {
		
		
		el.add(e);
		return "employeelogin";
	}
	
	//adminregtohomepage
	@RequestMapping("/adminregtohomepage")
	public String adminRegistrationtohomePage(@ModelAttribute Admin a) {
		al.add(a);
	return "adminlogin";
	}
	
	//EmpSucess
	@RequestMapping("/employeesuccess")
	public String employeeLoginsuccess(Model m) {
		m.addAttribute("data", al);
		return "success";
	}
	
	//adminsucess
	@RequestMapping("/adminsuccess")
	public String adminLoginsuccess(Model m) {
		m.addAttribute("data", al);
		return "success";
	}
	
	
}
