import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test {
public static void main(String[] args) {
	Connection con  = null;
	PreparedStatement ps = null;
	
	
	try {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","1234");
//	String sql="insert into student values(?,?)";
//	String sql1="insert into student values(?,?)";
	String sql="Update student set name='Manoj Rane' where rollno = 105";
	String sql1="insert into student values(109,'Shubham mohto')";
	
	
	
	Statement smt = con.createStatement();
	smt.execute(sql);
	smt.execute(sql1);
	
	/*
	ps=con.prepareStatement(sql);
	ps.setInt(1, 107);
	ps.setString(2, "Akash Kore");
	ps=con.prepareStatement(sql1);
	ps.setInt(1, 108);
	ps.setString(2, "Hemant sakarge");
	
	ps.execute();
	ps.close();
	con.close();
	*/
	//System.out.println("Succefully Added...");
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
