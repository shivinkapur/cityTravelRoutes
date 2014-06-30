import java.io.*;
import java.net.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import java.sql.*;

public class loggingout extends HttpServlet 
{
	String uname;
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
	{
		
       	response.setContentType("text/html");
     	PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);

		uname=(String)session.getAttribute("name");
		if(uname==null)
		{
			out.println("<html><body>");
			out.println("<center>No User Is Logged in<br>");
			out.println("<a href=\"http://localhost:8081/Html/MumbaiWays.html\" > click here to login </a></center>");
			out.println("</body></html>");
			return;
		}
		session.removeAttribute("name");
		session.invalidate();
		out.println("<html><body>");
		out.println("<center><h1>LOGGED OUT SCUCCESSFULLY</h1><br>");
		out.println("<a href=\"http://localhost:8081/Html/homepage.html\" >  </a></center>");
		out.close();
	}
}
    
    
   
