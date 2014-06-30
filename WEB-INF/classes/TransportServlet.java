import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class TransportServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String src=request.getParameter("source");
		String dest=request.getParameter("dest");
		 try{
		 
       	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   		AuthRoute ar=new AuthRoute();
      	 	boolean result=false;
      	  result=ar.validate(src,dest);
      	  out.println("<html><body><p>Login failed.</p></body></html>");
		
       	 
  		 if(result)
		 {
		 	response.sendRedirect("http://localhost:8081/Html/homepage.html");
		 }
		 else
		{
		response.sendRedirect("http://localhost:8081/Html/MumbaiWays.html");}
		 }
       	 catch(Exception e){}
       	 	
		
	
	}
}