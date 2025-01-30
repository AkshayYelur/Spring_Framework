package com.cjc.setterbased.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean2.xml");
	Student2 stu = (Student2)ap.getBean("s");
	
	System.out.println(stu.getMylist());
	System.out.println(stu.getMyset());
	System.out.println(stu.getMymap());
}
}
