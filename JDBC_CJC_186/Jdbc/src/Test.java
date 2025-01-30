import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class Test {
public static void main(String[] args) throws Exception {
	
	
	
	
	Scanner s = new Scanner(System.in);
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","1234");
	
	//String sql = "create table  student (rollno int(4),name char(20),addr char (20))";

	int rollno;
	String name;
	String address;
	
	String sql = null;
	for(int i =1 ;i<=5;i++) {
		
		System.out.println("Enter a Student Rollno:");
		 rollno = s.nextInt();
		
		System.out.println("Enter a Name:");
		 name = s.next()+s.nextLine();
		
		System.out.println("Enter a Address:");
		 address = s.next();
		 
		 sql = "insert into student values("+rollno+",'"+name+"','"+address+"')";
		 Statement smt = con.createStatement();
			
		 smt.execute(sql);
		 smt.close();
		
	}
	//String sql ="Select * from student";
	

		con.close();
	 
	
	//String sql = "delete from student where rollno=4"; 
	//String sql = "update student set name='ravi' where rollno=5" ;
			
	/*
	while(rs.next()) {
		
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));
	}
	*/
	System.out.println("Data ...");
	//System.out.println("Table created successfully");
	
	
	
	
	
}
}
