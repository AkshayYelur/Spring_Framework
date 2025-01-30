package com.braindata.bankmanagement.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {

	
	
//List<List<Account>>ll=new ArrayList<>();
	List<Account>ll=new ArrayList<>();//123
	
	Scanner sc=new Scanner(System.in);
	public void createAccount()
	{
		Account a=new Account();	
		long digit=0;
		System.out.println("enter account number");//12345678901234
		long l1=sc.nextLong();
		long l2=l1;
		if(l1!=0 && l1>0)
		{
		while(l1!=0)
		{
			digit++;
			l1=l1/10;
			
		}
			if(digit==12)
			{
			a.setAccNo(l2);
			System.out.println("enter account holder name");
			a.setName(sc.next()+sc.next());
			
			System.out.println("enter account holder adhar no");
			long adhar=sc.nextLong();//12343212343212
			long adhar1=adhar;
			long adhardigit=0;
			if(adhar!=0)
			{
			while(adhar!=0 && adhar>0)
			{
				adhardigit++;
				adhar=adhar/10;	
			}
			if(adhardigit==12)
			{
			a.setAdharNo(adhar1);
			System.out.println("enter account holeder mobile no");
			long mob=sc.nextLong();
			long mob1=mob;
			long mobdigit=0;
			if(mob!=0)
			{
			while(mob!=0 && mob>0)
			{
				mobdigit++;
				mob=mob/10;
			}
			if(mobdigit==10)
			{
			a.setMobNo(mob1);
			System.out.println("enter account gender");
			String m=sc.next();//hjhjg
			String male="male";
			String female="female";
			String other="other";
			if(m.equalsIgnoreCase(male)||m.equalsIgnoreCase(female)||m.equalsIgnoreCase(other))
			{
			a.setGender(m);
			System.out.println("enter account age");
			int age=sc.nextInt();
			if(age>18)
			{
			a.setAge(age);
			System.out.println("enter account balance");
			double balance=sc.nextDouble();
			if(balance>0)
			{
			a.setBalance(balance);
			
			}
			}
			}
			}
			
			}
			
			}
		}
			
		
			}
		}	
		//l.add(a);
		ll.add(a);
	}
	public void displayAllDetails()
	{
		
		Iterator<Account>itr=ll.iterator();
		while(itr.hasNext())
		{
			Account a4=itr.next();
				System.out.println(a4);
			}
		
		}
		
		
//		for(List<Account> a1:ll)
//		{
//			Account a3=a1;
//			for(Account a2:a1)
//			{
//				System.out.println(a2);
//			}
//		}
		
		
	
	public void depositeMoney()
	{
		System.out.println("enter Acount number");
		long ac1=sc.nextLong();
		for(Account a2:ll)// chta hemant 
			{
			if(a2.getAccNo()==ac1)
			{
				System.out.println("enter diposit ammount");
				double diposit=sc.nextDouble();
				if(diposit>0)
				{
		 		double b=a2.getBalance()+diposit;//
				System.out.println("money diposite Succesfully");
			System.out.println("diposited last amount " +diposit);
			a2.setBalance(b);	
			
			}
		}
		}
		
		
	}
	
	public void withdrawal()
	{
		
		System.out.println("enter Acount number");
		long ac1=sc.nextLong();
		for(Account a2:ll)// chta hemant 
		{
		if(a2.getAccNo()==ac1)
		{
			System.out.println("enter withdrawal ammount");
			double withdrawal=sc.nextDouble();
			if(withdrawal>0)
			{
				double b=a2.getBalance()-withdrawal;//
				a2.setBalance(b);
				System.out.println("money diposite Succesfully");
		}
		}}
		
		
				
	}	
	public void balanceCheck()
	{
		System.out.println("enter Acount number");
		long ac1=sc.nextLong();
		for(Account a2:ll)// chta hemant 
		{
		if(a2.getAccNo()==ac1)
		{
			System.out.println(" total remaining balance is " +a2.getBalance());
		}
		}}
		
		
	
	
}
