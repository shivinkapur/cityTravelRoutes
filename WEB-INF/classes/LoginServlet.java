import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//HttpSession session = response.getSession(true);
		//String u=(String)session.getAttribute("name");
		String u=request.getParameter("name");
		String p=request.getParameter("pass");
		 try{
		 
       	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   		AuthUser au=new AuthUser();
      	 	boolean result=false;
      	  result=au.validate(u,p);
      	  out.println("<html><body><p>Login failed.</p></body></html>");
			if(result)
		{
			HttpSession session = request.getSession(true);			
			session.setAttribute("name" , u);
			response.sendRedirect("http://localhost:8081/Html/MumbaiWays.html");
			
			//display(request,response, u);
		}
		else
		{
		
			out.println("<h1> INVALID USERNAME OR PASSWORD .</h1><br>");
			out.println("<a href=\"http://localhost:8081/Html/homepage.html\" > Please Try Again </a>");
			//response.sendRedirect("http://localhost:8080/musicbook/login.html");
		}
		//val.close();
		}catch(Exception e){
		
			out.println(e.getMessage());//Print trapped error.
			out.println("inside catch");
		}
	}
	
	
       	
  		 /*if(result)
		 {
		 	response.sendRedirect("http://localhost:8081/Html/MumbaiWays.html");
		 }
		 else
		{
		response.sendRedirect("http://localhost:8081/Html/homepage.html");}
		 }
       	 catch(Exception e){}*/
       	 	
		
	
	
	
}