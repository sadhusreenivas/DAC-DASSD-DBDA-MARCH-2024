package jdbc;
import java.sql.*;
public class Demo {
	public static void main(String[] args) throws Exception {
		// 1. Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish Connection
		String dburl="jdbc:mysql://localhost:3306/sampledb";
		String uname ="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(dburl, uname, pwd);
        
		if(con != null) {
			System.out.println("Connection success!");
		}
		else {
			System.out.println("Connection failed!!");
		}
		// 3. Create Statement => Stmt, PreStamt, CallStmt
		Statement st = con.createStatement();
		
		String iquery = "insert into student values(123,'qwerty',7.8)";
	    int x =	st.executeUpdate(iquery);
	    if(x>=1)
	    	System.out.println(x+" record(s) inserted");

		
		//4. Execute Query => 
		String query = "select * from student";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getDouble(3));
		}
		// 5. close the connection
		con.close();
		
	}
}