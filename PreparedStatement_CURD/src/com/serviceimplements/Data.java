package com.serviceimplements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Developer;
import com.service.Requirements;

public class Data implements Requirements {
	Developer d = new Developer();
	Scanner s = new Scanner(System.in);

	@Override
	public void createTable() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");
		String sql = "create table developer (id int primary key,name varchar(100),address varchar(200),mobile varchar(100),salary double,experience varchar(100),company varchar(100))";
		Statement smt = con.createStatement();
		smt.execute(sql);
		smt.close();
		con.close();
	}

	@Override
	public void insertData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		System.out.println("Enter a id");
		d.setId(s.nextInt());

		System.out.println("Enter a Name:");
		d.setName(s.next() + s.nextLine());

		System.out.println("Enter a Address:");
		d.setAddress(s.next() + s.nextLine());

		System.out.println("Enter a MobileNo:");
		d.setMobileno(s.next() + s.nextLine());

		System.out.println("Enter a Salary:");
		d.setSalary(s.nextDouble());

		System.out.println("Enter a Experience:");
		d.setExperience(s.next() + s.nextLine());

		System.out.println("Enter a Company Name:");
		d.setCompany(s.next() + s.nextLine());

		String sql = "insert into developer values(?,?,?,?,?,?,?) ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, d.getId());
		ps.setString(2, d.getName());
		ps.setString(3, d.getAddress());
		ps.setString(4, d.getMobileno());
		ps.setDouble(5, d.getSalary());
		ps.setString(6, d.getExperience());
		ps.setString(7, d.getCompany());
		ps.execute();
	}

	@Override
	public void viewSingleData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		System.out.println("Enter Id No:");
		int did = s.nextInt();

		String sql = "select * from developer where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, did);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));
			System.out.println(rs.getString("mobile"));
			System.out.println(rs.getDouble("salary"));
			System.out.println(rs.getString("experience"));
			System.out.println(rs.getString("company"));

		}

	}

	@Override
	public void viewAllData() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");
		String sql = "select * from developer";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			System.out.println("Employee ID:"+rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));
			System.out.println(rs.getString("mobile"));
			System.out.println(rs.getDouble("salary"));
			System.out.println(rs.getString("experience"));
			System.out.println(rs.getString("company"));

		}

	}

	@Override
	public void updateData() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a Id:");
		int dd = s.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		System.out.println(
				"1.UpdateName\n2.UpdateAddress\n3.UpadteMobileNo\n4.UpdateSalary\n5.UpdateExperience\n6.UpadateComapny");
		System.out.println("Enter a Choice:");
		int ch = s.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter ur Name:");
			String name = s.next();
			String sql = "update developer set name=? where id = ?";
			PreparedStatement pr1 = con.prepareStatement(sql);
			pr1.setString(1, name);
			pr1.setInt(2, dd);
			pr1.execute();

			break;
		case 2:
			System.out.println("Enter ur Address:");
			String address = s.next();
			String sql1 = "update developer set address=? where id = ?";
			PreparedStatement pr2 = con.prepareStatement(sql1);
			pr2.setString(1, address);
			pr2.setInt(2, dd);
			pr2.execute();
			break;

		case 3:
			System.out.println("Enter ur MobileNo:");
			String mobileno = s.next() + s.nextLine();
			String sql2 = "update developer set mobileno =? where id =?";
			PreparedStatement pr3 = con.prepareStatement(sql2);
			pr3.setString(1, mobileno);
			pr3.setInt(2, dd);
			pr3.execute();
			break;
		case 4:
			System.out.println("Enter ur salary:");
			String salary = s.next() + s.nextLine();
			String sql3 = "update developer set salary=? where id = ?";
			PreparedStatement pr4 = con.prepareStatement(sql3);
			pr4.setString(1, salary);
			pr4.setInt(2, dd);
			pr4.execute();
			break;

		case 5:
			System.out.println("Enter Experience:");
			String experience = s.next() + s.nextLine();
			String sql4 = "update developer set experience=? where id = ?";
			PreparedStatement pr5 = con.prepareStatement(sql4);
			pr5.setString(1, experience);
			pr5.setInt(2, dd);
			pr5.execute();
			break;
		case 6:
			System.out.println("Enter comapny Name:");
			String company = s.next() + s.nextLine();
			String sql5 = "update developer set company=? where id = ?";
			PreparedStatement pr6 = con.prepareStatement(sql5);
			pr6.setString(1, company);
			pr6.setInt(2, dd);
			pr6.execute();
			break;

		default:
			System.out.println("Enter a correct choise:");
			break;
		}

	}

	@Override
	public void deleteSingleData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd","root","1234");
		System.out.println("Enter ID the u want do to Delete:");
		int id = s.nextInt();
		String query = "DELETE FROM developer where id = ?";
		PreparedStatement pr = con.prepareStatement(query);
		pr.setInt(1, id);
		pr.execute();
		pr.close();
		con.close();

	}

	@Override
	public void deleteAllData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd","root","1234");
		System.out.println("Enter the table Name:");
		String sql = "delete from patient";
		Statement smt = con.createStatement();
		smt.execute(sql);
		smt.close();
		con.close();

	}

	@Override
	public void deleteTable() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		String query = "DROP TABLE patient";
		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

}
