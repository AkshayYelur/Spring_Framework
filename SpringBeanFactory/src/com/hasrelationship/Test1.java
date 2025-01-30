package com.hasrelationship;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("bean1.xml");
		
		Teacher1 t =  (Teacher1)bf.getBean("ss");
		
	//	Scanner sc = new Scanner(System.in);
		t.setTid(1);
		t.setTname("Kunal");
		t.stu.setId(12);
		t.stu.setName("Ravi");
		t.stu.setCourse("java");
		
		
	}
}
