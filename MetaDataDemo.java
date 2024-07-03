package jdbc;
import java.sql.*;
public class MetaDataDemo {
	public static void main(String[] args) throws Exception {
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDbConnection();
		if(con != null)
			System.out.println("Connection established");
		
		// DataBaseMetaData
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
		System.out.println(dbmd.getURL());
		System.out.println(dbmd.getUserName());
		
        String[] tables ={"TABLE"};
        ResultSet rs1 = dbmd.getTables(null, null, null, tables); //
        
        while(rs1.next()){
            System.out.println(rs1.getString(3));
	}
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from account");
		// metadata of ResultSet
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount()); // 3
		
		for(int i=1; i<=rsmd.getColumnCount();i++ ) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
        System.out.println();        
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
        }
	}

}
