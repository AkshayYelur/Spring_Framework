package com.jb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("emp")
	public Employee e() {
		Employee emp = new Employee();
		return emp;
	}
	
}
