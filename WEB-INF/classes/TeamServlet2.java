import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class TeamServlet2 extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String t=request.getParameter("points");
		String disp="";
try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=c:\\Nikki\\we1.mdb;}");
		Statement stat=con.createStatement();
       		String s="Select * from LeagueTable where Lname='"+t+"'";
       	 	ResultSet rs=stat.executeQuery(s);
		out.println("<html><body><table border=1>");
		//out.println("<tr><td>POSITION</td><td>TEAM NAME</td><td>POINTS</td>");
		while(rs.next())
		{out.println("<tr>");
		out.println("<td>"+rs.getString("bus")+"</td>");
		out.println("<td>"+rs.getString("train")+"</td>");	
		out.println("<td>"+rs.getString("rickshaw")+"</td>");
		out.println("<td>"+rs.getString("taxi")+"</td>");
		out.println("</tr>");
			}
		out.println("</table></body></html>");
}
catch(Exception e)
{}

}}