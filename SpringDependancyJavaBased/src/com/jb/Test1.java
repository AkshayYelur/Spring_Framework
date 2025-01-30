package com.jb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
public static void main(String[] args) {
	
	ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
	Employee e1 = (Employee) apc.getBean("emp");
	
}
}
