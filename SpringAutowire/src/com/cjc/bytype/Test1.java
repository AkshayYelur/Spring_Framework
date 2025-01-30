package com.cjc.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
public static void main(String[] args) {
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean1.xml");
	com.cjc.bytype.Student stu=ap.getBean("s",Student.class);
	System.out.println(stu);
	
	//Employee emp = (Employee) ap.getBean("emp");
	//System.out.println("emp");
}
}
