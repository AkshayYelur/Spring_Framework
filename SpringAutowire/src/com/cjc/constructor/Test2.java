package com.cjc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean2.xml");
	Student st = (Student)ap.getBean("s");
	System.out.println(st);
}
}
