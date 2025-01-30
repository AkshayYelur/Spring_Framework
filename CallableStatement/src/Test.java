import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con=null;
		 CallableStatement cs=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callablestatement","root","1234");
		 cs = con.prepareCall("{call insertdata(?,?)}");
		 cs.setInt(1,2 );
		 cs.setString(2, "kunal");
		cs.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			cs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		}
		System.out.println("Data Inserted Successfully...");
	}

}
