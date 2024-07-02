package jdbc;

import java.sql.*;

public class DBConnection {

	public Connection getDbConnection() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl="jdbc:mysql://localhost:3306/sampledb";
		String uname ="root";
		String pwd="root";
		
		Connection con = DriverManager.getConnection(dburl, uname, pwd);
		
		return con;
	}
	
}
