package jdbc;
import java.sql.*;
import java.util.Scanner;
public class TxMgmtDemo {
	
	public static void main(String[] args) throws Exception {
	
		Scanner reader = new Scanner(System.in);
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
		if(con != null)
			System.out.println("Connection established");
		
		con.setAutoCommit(false); // commit is now false...
        // Transfer transaction
		Statement st = con.createStatement();
		System.out.println("Please enter account Id and amount to withdraw");
		int witid = reader.nextInt();
		double amt = reader.nextDouble();
		String wquery = "update account set accBal = accBal-"+amt+" where accId="+witid;
		st.addBatch(wquery); // batch of statements
		
		System.out.println("Please enter account to deposit");
		int depid = reader.nextInt();
		String dquery = "update account set accBal = accBal+"+amt+" where accId="+depid;
        st.addBatch(dquery);
        
       int[] x =  st.executeBatch(); // 
        
       // logic for commit and rollback
       
       boolean flag = false;
       
       for(int i=0; i<x.length; i++) {
    	   if(x[i] == 0) {
    		   flag = true; // failed action
    		   break;
    	   }
       }
       
       if(flag == true) {
    	   con.rollback();
    	   System.out.println("Transaction rolled back");
       }
       else {
    	   con.commit();
    	   System.out.println("Transaction fully done");
       }
    	   
       ResultSet rs = st.executeQuery("select * from account");
       while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
       }
       
       con.close();
        
	}

}
