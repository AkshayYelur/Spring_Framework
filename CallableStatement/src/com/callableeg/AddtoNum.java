package com.callableeg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class AddtoNum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callablestatement","root","1234");
		CallableStatement cs = con.prepareCall("{call addtwonumbers(?,?,?)}");
				
				cs.setInt(1,20);
				cs.setInt(2,30);
				cs.registerOutParameter(3,Types.INTEGER);
				cs.execute();
				System.out.println(cs.getInt(3));
				
	}

}
