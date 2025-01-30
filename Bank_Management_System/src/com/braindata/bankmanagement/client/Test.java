package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceimpl.Sbi;

public class Test {

	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
		
		Rbi r=new Sbi();
		while(true)
		{
		System.out.println("enter choise");
		System.out.println("enter 1 for create account");
		System.out.println("enter 2 for display All details");
		System.out.println("enter 3 for diposite money");
		System.out.println("enter 4 for withdrawal");	
		System.out.println("enter 5 for balace check");	
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			r.createAccount();
			break;
			case 2:
			r.displayAllDetails();
			break;	
			case 3:
			r.depositeMoney();
			break;
			case 4:
			r.withdrawal();
			break;
			case 5:
			r.balanceCheck();					
			break;
		}
	}
		
		
		
		
		
		
		
	}
	
	
}
