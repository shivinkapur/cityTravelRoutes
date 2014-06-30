import java.io.*;
import java.net.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServletn extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
       	 
       	 
       	 	response.setContentType("text/html");
     		PrintWriter out = response.getWriter();
String fn=request.getParameter("fname");
String ln=request.getParameter("lname");
String em=request.getParameter("email");
String pw=request.getParameter("password");
String ph=request.getParameter("phone");
//String z=request.getParameter("zip");
//String c=request.getParameter("country");
//String g=request.getParameter("option");


//String cl=request.getParameter("club");
//String t=request.getParameter("tmname");
/*if(!cp.equals(pw))
		{
	out.println("<html><body>");
	out.println("<h2>Password mismatch</h2>");
	out.println("<a href=http://localhost:8080/RegisterPage/finalform.html>Register again</a>");
			
			out.println("</body></html>");
			
		}	

        	
			
			
			
		else{
  */  
    try{
       	 
       	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
out.println("hi");
	
   		 Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\Rohit\\Desktop\\datest2.mdb;}"); 
	out.println("hi");
	
    	 Statement stat=con.createStatement();
       	 String str="insert into user values('"+fn+"','"+ln+"','"+em+"','"+pw+"','"+ph+"')"; 
	out.println("hi");
	
       	 stat.executeUpdate(str);
       	 out.println("hi");
       	 }
       	 catch(Exception e){
       	 	System.out.println(e);}
    out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Login</title>");
        	out.println("</head>");
      		out.println("<body>");
    		out.println("Registered Successfully");
    		out.println("<a href=http://localhost:8081/Html/homepage.html>CLICK HERE</a> TO LOGIN: ");
    		out.println("</body>");
        	out.println("</html>");
    }
//}
    }
    
   
