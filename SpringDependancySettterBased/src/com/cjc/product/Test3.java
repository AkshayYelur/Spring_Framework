package com.cjc.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean3.xml");
		Product p=(Product)ap.getBean("product");
		
	System.out.println(p);
		
				
	}
	

}
