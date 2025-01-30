package com.braindata.employee.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindata.employee.Employee;
import com.braindata.employee.service.I;

public class EmployeeDetails implements I {

	
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void saveEmp()  {
		// TODO Auto-generated method stub
		//1.
		Employee e = new Employee();
		System.out.println("Enter s Eid:");
		int eid= sc.nextInt();
		e.setEid(eid);
		System.out.println("Enter a Ename:");
		String ename=sc.next()+sc.nextLine();
		e.setName(ename);
		
		System.out.println("Enter a Contact:");
		long contact =sc.nextLong();
		e.setContact(contact);
		System.out.println("Enter a Salary:");
		double salary = sc.nextDouble();
		e.setSalary(salary);
		System.out.println("Enter a Email:");
		String email = sc.next()+sc.nextLine();
		e.setEmail(email);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","1234");
			String sql ="insert into employee VALUES("+eid+",'"+ename+"',"+contact+","+salary+",'"+email+"')";
			System.out.println(sql);
			Statement smt = con.createStatement();
			boolean b = smt.execute(sql);
			smt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void getAllEmp() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","1234");
			String sql="select * from employee";
			//System.out.println(sql);
			Statement smt = con.createStatement();
						ResultSet rs	=smt.executeQuery(sql);
						while(rs.next()) {
							
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getLong(3));
							System.out.println(rs.getDouble(4));
							System.out.println(rs.getString(5));
						}
			
			smt.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

	@Override
	public void searchEmp() {
		// TODO Auto-generated method stub
		Employee e2 = new Employee();
		System.out.println("Enter a Employye Id:");
		int eid = sc.nextInt();
		e2.setEid(eid);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","1234");
			String sql="select * from employee where eid = "+eid+"";
			//System.out.println(sql);
			Statement smt = con.createStatement();
						ResultSet rs	=smt.executeQuery(sql);
						while(rs.next()) {
							
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getLong(3));
							System.out.println(rs.getDouble(4));
							System.out.println(rs.getString(5));
						}
			
			smt.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updateEmp() {
		// TODO Auto-generated method stub
		Employee e3 = new Employee();
		System.out.println("Enter a Name:");
		String ename= sc.next()+sc.nextLine();
		System.out.println("Enter a Employee Id:");
		int eid = sc.nextInt();
		e3.setName(ename);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","1234");
			String sql = "update employee set ename='"+ename+"' where eid="+eid+" ";
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(sql);
			System.out.println(i);
			smt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEmp() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter a Id you want delete:");
		int i4 = sc.nextInt();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","1234");
			String sql = "delete from employee where eid = "+i4+"";
			
			Statement smt= con.createStatement();
			int n =smt.executeUpdate(sql);
			System.out.println(n);
			smt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	

}
