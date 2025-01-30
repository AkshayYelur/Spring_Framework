package com.braindata.employee.client;

import java.util.Scanner;

import com.braindata.employee.serviceimpl.EmployeeDetails;

public class Test {

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("Enter a Your Choise:");
		
		System.out.println("1.Add Employee:");
		System.out.println("2.View All Details:");
		System.out.println("3.Search Employee:");
		System.out.println("4.Update Employee:");
		System.out.println("5.Delete Employee:");
		System.out.println("6.Exit");
		
		
		int ch = s.nextInt();
		switch(ch) {
		case 1:
			ed.saveEmp();
			System.out.println("Data Inserted SuccessFully....");
			break;
			
		case 2 :
			ed.getAllEmp();
			
			break;
		case 3 :
			ed.searchEmp();
			break;
		case 4:
			ed.updateEmp();
			break;
		case 5:
			ed.deleteEmp();
			break;
		case 6:
			System.exit(ch);
			}
		
	}
	
	}
}
