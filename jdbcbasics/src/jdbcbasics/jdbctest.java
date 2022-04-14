package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class jdbctest {
	public static void main(String[] args) {
		System.out.println("JDBC Test");
//		Connection con = null;
//		Statement st = null;
//		ResultSet res = null;
		try (
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","*Paddu@18");
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery("select * from account");	){
//			int rs=st.executeUpdate("insert into account values(4,'Harsha','P',10000)");
//			System.out.println("Number of rows inserted: "+rs);
//			int res=st.executeUpdate("update account set balance=5000 where Accno=2");
//			System.out.println("Number of rows updated: "+res);
//			int res=st.executeUpdate("delete from account where Accno=1");
//			System.out.println("Number of rows deleted: "+res);
			//res=st.executeQuery("select * from account");
			//System.out.println("Number of rows updated: "+res);
			while(res.next())
			{
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
//		finally {
//			
//			try {
//				res.close();
//				st.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
	}
}
