package com;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BeanFactory bf = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student)apc.getBean("s");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a Name:");
		s.setName(sc.next());
		
		System.out.println("Enter a Id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter Course name");
		
		s.setCourse(sc.next());
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		
		
		
	}

}
