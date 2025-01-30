package com.callable.storedprocedure;

public class DisplaySingledata {
	package com.callable.storedprocedure;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import com.mysql.cj.jdbc.CallableStatement;

	public class Employee {

		public static void main(String[] args) throws ClassNotFoundException,SQLException {
			// TODO Auto-generated method stub
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_curd","root","1234");
		
			String sql="{call DisplaySingleData(?)}";
			CallableStatement cs=(CallableStatement) con.prepareCall(sql);
			cs.setInt(1, 102);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				
				System.out.println("Employee Id:"+rs.getInt("eid"));
				System.out.println("Employee Name:"+rs.getString("ename"));
				System.out.println("Employee Id:"+rs.getDouble("esalary"));
				
			}
			cs.close();
			con.close();
			
			
		}

	}

}
