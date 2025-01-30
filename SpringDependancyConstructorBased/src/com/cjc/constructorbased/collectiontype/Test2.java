package com.cjc.constructorbased.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
public static void main(String[] args) {
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean2.xml");
	Student2 stu=(Student2)ap.getBean("s");
	System.out.println(stu);
}
}
