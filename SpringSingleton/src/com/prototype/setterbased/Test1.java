package com.prototype.setterbased;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	
	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("bean1.xml");
		Employee emp = (Employee)bf.getBean("emp");
		
		System.out.println(emp);
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("bean1.xml");
		Employee emp1 = (Employee) apc.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) apc.getBean("emp2");
		System.out.println(emp2);
		
		
	}
}
