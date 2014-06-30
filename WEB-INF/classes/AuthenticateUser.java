import java.sql.*;
class AuthUser
{

	boolean validate(String u,String p)
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\Rohit\\Desktop\\datest2.mdb;}");
		Statement stat=con.createStatement();
       		String s="Select fname from user where email='"+u+"' and password='"+p+"'";
       	 	ResultSet rs=stat.executeQuery(s);
       	 	
       	 	if(rs.next())
       	 	{return true;
       	 	}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
	
}