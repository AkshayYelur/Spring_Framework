package com.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

public static void main(String[] args) {
	
	ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
	Student st= (Student) apc.getBean("s1");
}



}



