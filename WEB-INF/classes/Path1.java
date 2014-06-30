import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.net.*;
public class Path1 extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String src=request.getParameter("source");
		String dest=request.getParameter("dest");
		String mot=request.getParameter("mot");
		String s="";
		ResultSet rs; 
		 try{
				out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Login</title>");
        	out.println("</head>");
      		out.println("<body>HI"); 
       	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\Rohit\\Desktop\\Transport.mdb;}");
		 Statement stat=con.createStatement();
		 	out.println("Hello");
		 //	if(mot=="Bus")
		 //	{
		 		out.println("In Bus");
		 		s="Select * from Transport";
       		//	s="(Select Bus_no from Transport where Area='"+src+"') intersects(Select Bus_no from Transport where Area='"+dest+"')";
		 	//}
      	 	 //else if(mot=="Train")
      	 	 //{
      	 	 	//	out.println("In train");
      	 	 	//	s="(Select Train_no from Transport where Area='"+src+"') union(Select Train_no from Transport where Area='"+dest+"')";
      	 	 //}
       	  rs=stat.executeQuery(s);
       	  rs.next();
	
    		out.println("<p>The selected Path is:"+rs+"</p></br>");
    		//out.println("<a href=http://localhost:8081/Html/homepage.html>CLICK HERE</a> TO LOGIN: ");
    		
    	out.println("</body>");
        	out.println("</html>");	
		}
		catch(Exception e){
			System.out.println(e);
			}
       		
	}
	
}