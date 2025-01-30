package com.cjc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
	Customer cust = (Customer)ap.getBean("c");
	System.out.println(cust);
	
	cust.getOr().getP().getSup().getEmail().forEach(s -> System.out.println(s));
	cust.getOr().getP().getSup().getContact().forEach(s -> System.out.println(s));
	cust.getOr().getP().getSup().getContact().forEach(s -> System.out.println(s));
	
	
}
}
