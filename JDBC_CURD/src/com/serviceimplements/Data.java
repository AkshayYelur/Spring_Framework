package com.serviceimplements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.service.Requirements;

public class Data implements Requirements {

	Scanner s = new Scanner(System.in);

	@Override
	public void createTable() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");
		String sql = "CREATE TABLE patient (id INT primary key,name VARCHAR(100),address VARCHAR(255),mobileno VARCHAR(15),disease VARCHAR(100) )";
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

		System.out.println("Enter ID:");
		int id = s.nextInt();

		System.out.println("Enter a NAME:");
		String name = s.next() + s.nextLine();

		System.out.println("Enter a Address:");
		String address = s.next() + s.nextLine();

		System.out.println("Enter s MOBILENO:");
		String mobileno = s.next() + s.nextLine();

		System.out.println("Enter s DISEASE:");
		String disease = s.next() + s.nextLine();

		String query = "INSERT INTO patient VALUES(" + id + ",'" + name + "','" + address + "','" + mobileno + "','"
				+ disease + "')";

		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

	@Override
	public void viewSingleData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");
		System.out.println("Enter id of patient :");
		int id = s.nextInt();

		String query = "SELECT * FROM jdbc_curd.patient WHERE id = (" + id + ")";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("address") + " "
					+ rs.getString("mobileno") + " " + rs.getString("disease"));

		}

	}

	@Override
	public void viewAllData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		String query = "SELECT * FROM jdbc_curd.patient";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt("id") + rs.getString("name") + rs.getString("address")
					+ rs.getString("mobileno") + rs.getString("disease"));

		}

	}

	@Override
	public void updateData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		System.out.println("Enter ID:");
		int id = s.nextInt();

		System.out.println("Enter a NAME:");
		String name = s.next() + s.nextLine();

		System.out.println("Enter a Address:");
		String address = s.next() + s.nextLine();

		System.out.println("Enter s MOBILENO:");
		String mobileno = s.next() + s.nextLine();

		System.out.println("Enter s DISEASE:");
		String disease = s.next() + s.nextLine();

		String query = "UPDATE patient SET  name ='" + name + "',address='" + address + "',mobileno='" + mobileno
				+ "',disease='" + disease + "' WHERE id = " + id + "";
		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

	@Override
	public void deleteSingleData() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		System.out.println("Enter ID the u want do to Delete:");
		int id = s.nextInt();
		String query = "DELETE FROM jdbc_curd.patient where id =(" + id + ")";
		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

	@Override
	public void deleteAllData() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

		
		
		String query = "DELETE FROM cjc";
		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

	@Override
	public void deleteTable() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd", "root", "1234");

	

		String query = "DROP TABLE student";
		Statement smt = con.createStatement();
		smt.execute(query);
		smt.close();
		con.close();

	}

}
