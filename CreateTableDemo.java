package jdbc;
import java.sql.*;
public class CreateTableDemo {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/sampledb";
		String uname ="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(dburl, uname, pwd);
        if(con != null) {
        	System.out.println("Connection success!");
        }
		
        Statement st = con.createStatement();
        String cquery = "create table account (accId int, accType varchar(20),accBal float)";
        
        int x = st.executeUpdate(cquery);
        if(x>=0)
        	System.out.println("Table created successfully!");
        else
        	System.out.println("Failed.....!!");
        
        con.close();
	}

}
