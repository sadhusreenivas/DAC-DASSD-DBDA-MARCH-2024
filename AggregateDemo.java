package jdbc;
import java.sql.*;

public class AggregateDemo {
	public static void main(String[] args) throws Exception {
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
        
		if(con != null)
			System.out.println("Connection success!");
		
		 Statement st = con.createStatement();
		 String q1 = "select sum(accBal), min(accBal), max(accBal), avg(accBal) from account";
		 ResultSet rs = st.executeQuery(q1);
		 
		 while(rs.next()) {
			 System.out.println("Sum of account balances: "+rs.getDouble(1));
			 System.out.println("Min account balance: "+rs.getDouble(2));
			 System.out.println("Max account balance: "+rs.getDouble(3));
			 System.out.println("Avg of account balances: "+rs.getDouble(4));
		 }
		 
		 con.close();
	}

}
