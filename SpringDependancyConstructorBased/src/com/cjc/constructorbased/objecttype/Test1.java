package com.cjc.constructorbased.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean1.xml");
		Student1 stu = (Student1)ap.getBean("s");
		System.out.println(stu);
	}
}
