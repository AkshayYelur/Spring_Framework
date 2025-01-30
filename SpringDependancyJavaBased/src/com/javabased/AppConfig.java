package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("s1")
	public Student s() {
		Student stu = new Student();
		return stu;
	}
	
	
}
