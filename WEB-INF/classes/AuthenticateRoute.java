import java.sql.*;
class AuthRoute
{

	boolean validate(String src,String dest)
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\Rohit\\Desktop\\rotransport1.mdb;}");
		Statement stat=con.createStatement();
       		String s="Select bus from transport where source='"+src+"' and destination='"+dest+"'";
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