package jdbc;
import java.sql.*;
public class CSTDemo {

	public static void main(String[] args) throws Exception {
		
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
		if(con != null)
			System.out.println("Connection established");
		
		// call stored function
		String query = "{? = call add_ab(?,?)}"; // {}
		CallableStatement cst = con.prepareCall(query);
		
		cst.setInt(2, 123);
		cst.setInt(3, 321);
		cst.registerOutParameter(1, Types.INTEGER);
		
		cst.execute();
		
		int res = cst.getInt(1);
		System.out.println("Result (sum) is: "+res);
		
	
		
		// call stored procedures 
		/*
		String query = "call first_pro(?,?)"; // 1?: in and 2? out {}
		CallableStatement cst = con.prepareCall(query);
		
		cst.setInt(1, 15); // first ? is set
		cst.registerOutParameter(2, Types.INTEGER); // registering out parameter

		// execute procedure
		cst.execute();
		
		int res = cst.getInt(2); // getting 2nd ? = result
		System.out.println("The result of procedure: "+res);
		*/
		con.close();
		
	}

}
