package jdbc;

import java.sql.*;

public class CRUDDemo {

	public static void main(String[] args) throws Exception {

		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
		
		if(con != null)
			System.out.println("Connection established");
        
		// C R U D demonstration 
		Statement st = con.createStatement();
	    String iquery ="insert into account values(555,'Current', 45000)";
	    int x = st.executeUpdate(iquery);
	    if(x>=0)
	    	System.out.println(x+" record(s) inserted");
	    
	    String uquery ="update account set accBal = accBal+5000 where accId = 222";
	    int y = st.executeUpdate(uquery);
	    if(y>=0)
	    	System.out.println(y+" record(s) updated");
	    
	    int z = st.executeUpdate("delete from account where accBal <=40000");
	    if(z>=0)
	    	System.out.println(z+" record(s) deleted");
	    
	    ResultSet rs = st.executeQuery("select * from account");
	    System.out.println("ACC No:\tAcc Type:\tAcc Bal:");
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+"\t"+rs.getString("accType")+"\t   "+rs.getDouble(3));
	    }
	    con.close();
	}
}
