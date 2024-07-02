package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PSTDemo {
	public static void main(String[] args) throws Exception {
		Scanner reader = new Scanner(System.in);
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
		if(con != null)
			System.out.println("Connection established");
        
		// PreparedStatement
		String q1 = "insert into account values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(q1);
      
        System.out.println("Enter id, type and bal for account");
        int id = reader.nextInt();
        String type = reader.next();
        double bal = reader.nextDouble();
        
        pst.setInt(1, id);
        pst.setString(2, type);
        pst.setDouble(3, bal);
        
        int x = pst.executeUpdate();
        if(x>=0)
        	System.out.println(x+" record(s) inserted");
        
		ResultSet rs = pst.executeQuery("select * from account");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	}

}
