package com.cj.ims.app.client;

import java.util.Scanner;

import com.cj.ims.app.serviceimpl.KarveNagar;
import com.cj.ims.app.servicesi.CJC;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CJC cjc = new KarveNagar();
	while(true) {
	System.out.println("1.ADD COURSE");
	
	System.out.println("2.VIEW COURSE");
	
	System.out.println("3.ADD FACULTY");
	
	System.out.println("4.VIEW FACULTY");
	
	System.out.println("5.ADD BATCH");
	
	System.out.println("6.VIEW BATCH");
	
	System.out.println("7.ADD STUDENT");
	
	System.out.println("8.VIEW STUDENT");
	
	
	
	System.out.println("Enter Your Choice:");
	int ch = sc.nextInt();
	
	
		
	switch(ch) {
	case 1: 
		cjc.addCourse();
		break;
	case 2:
		cjc.viewCourse();
		break;
	case 3:
		cjc.addFaculty();
		break;
	case 4:
		cjc.viewFaculty();
		break;
	case 5:
		cjc.addBatch();
		break;
	case 6:
		cjc.viewBatch();
		break;
	case 7:
		cjc.addStudent();
		break;
	case 8:
		cjc.viewStudent();
		break;
		
	default:
		System.out.println("Wrong choice");
		
	
	}
	}
}
}
