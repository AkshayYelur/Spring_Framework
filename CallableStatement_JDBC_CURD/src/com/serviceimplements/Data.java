package com.serviceimplements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.model.Teacher;
import com.service.Requirement;

public class Data implements Requirement {
	
	Scanner s = new Scanner(System.in);
//	Data d = new Data();
	Teacher t = new Teacher();
	

	@Override
	public void createTable() throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.cj.mysql.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callablestatement_jdbc","root","1234");
		String sql ="{call create_table}";
		CallableStatement cs = con.prepareCall(sql);
		cs.execute();
		System.out.println("Table is created.....");
		
		
		
		
		
	}

	@Override
	public void insertData() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a ID:");
		t.setId(s.nextInt());
		
		System.out.println("Enter a Name:");
		t.setName(s.next()+s.nextLine());
		
		System.out.println("Enter a Address:");
		t.setAddress(s.next()+s.nextLine());
		
		System.out.println("Enter a MobileNo:");
		t.setMobileno(s.next()+s.nextLine());
		
		System.out.println("Enter a Salary:");
		t.setAddress(s.next()+s.nextLine());
		
		Class.forName("com.cj.mysql.Driver");
		Connection  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/callablestatement_jdbc","root","1234");
		String sql = "{call inserdata(?,?,?,?,?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.setInt(1,t.getId());
		cs.setString(2,t.getName());
		cs.setString(3,t.getAddress());
		cs.setString(4,t.getMobileno());
		cs.setDouble(5,t.getSalary());
		cs.executeUpdate();
		
		
	
	}

	@Override
	public void viewSingleData() throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void viewAllData() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSingleData() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllData() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTable() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
