package com.cjc.constructorbased.primitivetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
		Student stu =(Student)ap.getBean("s");
		
System.out.println(stu);
	}

}
