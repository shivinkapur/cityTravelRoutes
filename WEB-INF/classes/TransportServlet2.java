import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class TransportServlet2 extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String src=request.getParameter("source");
		String dest=request.getParameter("dest");
		 try{
		 
       	 //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   		//AuthRoute ar=new AuthRoute();
      	 	//boolean result=false;
      	  //result=ar.validate(src,dest);
      	  //out.println("<html><body><p>Login failed.</p></body></html>");
      	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\Rohit\\Desktop\\rotransport1.mdb;}");
		Statement stat=con.createStatement();
		out.println("hi");
       		String s="Select * from transport where source='"+src+"' and destination='"+dest+"'";
       	
       	 	ResultSet rs=stat.executeQuery(s);
       	 	/*while (rs.next())
       	 	{
       	 	
       	 	out.println("<tr>");
			out.println("<td>"+rs.getString("bus")+"</td>");
			out.println("<td>"+rs.getString("train")+"</td>");	
			out.println("<td>"+rs.getString("rickshaw")+"</td>");
			out.println("<td>"+rs.getString("taxi")+"</td>");
			out.println("</tr>");
       	 	}*/
       	 	
       	 	
       	 	
out.println("<html>");
out.println("<head>");
out.println("<link href=\"style2.css\" rel=\"stylesheet\"  type=\"text.css\">");
out.println("<title>Route Found</title>");
out.println("<head><style type=\"text/css\">.style1");
out.println("{font-size: large;}</style>");
out.println("<body>");
out.println("<div id=\"wrap\"><div id=\"contents\"><div id=\"heading\">");
out.println("<table border=\"0\" height=\"100%\" width=\"100%\">");
out.println("<tr><td>");
out.println("<a href=\"http://www.google.co.in/\"  target=\"_blank\">");
out.println("<img src=\"google_logo.jpg\" width=\"150px\" height=\"80px\">");
out.println("</a></td><td>");
out.println("<p align=\"center\">");
out.println("<font size=\"10\" color=\"#660000\"	face=\"Bradley Hand ITC\"><b>GETTINGTHERE.COM</font></p></b></td>");
out.println("<td><a href=\"http://www.microsoft.com\"  target=\"_blank\"><img src=\"microsoft-logo1.jpg\" width=\"150px\" height=\"80px\"></a></td></tr>");
out.println("</table>");
out.println("</div><div id=\"table\">	<table border=\"1\" width=\"100%\" height=\"100%\">");
out.println("<tr ><td align=\"center\"><b><a href=\"homepage.html\" target=\"_self\" >Home</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"About.html\" target=\"_self\" >About</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"form5.html\" target=\"_self\" >Register</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"Downloads.html\" target=\"_self\" >Downloads</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"FAQs.html\" target=\"_self\" >FAQ&#39;s</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"Help.html\" target=\"_self\" >Help</a></b></td>");
out.println("<td align=\"center\"><b><a href=\"ContactUs.html\" target=\"_self\" >Contact Us</a></b></td>");
out.println("<td colspan=\"1\" rowspan=\"1\" align=\"right\"> <t> <b> <font size=4 color=&#000066>");
out.println("<script type=\"text/javascript\"><!--");
		out.println("var currentTime = new Date()");
		out.println("var hours = currentTime.getHours()");
		out.println("var minutes = currentTime.getMinutes()");
		out.println("if (minutes < 10){minutes = \"0\" + minutes}");
		out.println("document.write(hours + \":\" + minutes + \" \")//-->");
		out.println("</script></b></font></t></td></tr>");
out.println("<tr><td colspan=\"8\" rowspan=\"4\" align=\"center\"><a href=\"http://www.yatra.com/connect/www/content/ck.php?n=ac31e2f4&amp;cb=0808201101\" target=\"_blank\"><img src=\"http://www.yatra.com/connect/www/content/avw.php?zoneid=432&amp;cb=0808201101&amp;n=ac31e2f4\" border=\"0\" alt=\"\"></a></td></tr></table></div>");

out.println("<div id=\"main\">");


out.println("<p class=\"style1\">");

	while (rs.next())
       	 	{
       	 	out.println("<table>");
       	 	out.println("<tr>");
       	 	out.println("<td>Bus Number</td>");
    
			out.println("<td>"+rs.getString("bus")+"</td></tr>");
			
			out.println("<tr><td>Nearest Station</td>");
			out.println("<td>"+rs.getString("train")+"</td></tr>");
			out.println("<tr><td>Rickshaw Fare</td>");	
			out.println("<td>"+rs.getString("rickshaw")+"</td></tr>");
			out.println("<tr><td>Taxi Fare</td>");
			out.println("<td>"+rs.getString("taxi")+"</td>");
			out.println("</tr>");
			out.println("</table>");
       	 	}


out.println("</p></div></div>");
out.println("</body>");
out.println("</html>");	 	
       	 	
       	 	
       	 	
       	 	
       	 
  		 /*if(result)
		 {
		 	response.sendRedirect("http://localhost:8081/Html/homepage.html");
		 }
		 else
		{
		response.sendRedirect("http://localhost:8081/Html/MumbaiWays.html");}*/
		 }
       	 catch(Exception e){}
       	 	
		
	
	}
}