package com.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
		
			Student stu = (Student) apc.getBean("s");
		
			System.out.println(stu);
		
			Student stu1 = (Student) apc.getBean("s1");
			
			System.out.println(stu1);		
	}
}
