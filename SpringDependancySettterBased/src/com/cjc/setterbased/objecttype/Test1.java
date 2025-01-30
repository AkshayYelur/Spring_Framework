package com.cjc.setterbased.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.setterbased.primitive.Student;

public class Test1 {
public static void main(String[] args) {
	
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("bean1.xml");
	Stundent1 stu = (Stundent1)ap.getBean("s");
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr().getPadd());
	System.out.println(stu.getAddr().getLadd());
}
}
