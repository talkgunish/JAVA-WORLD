package Filter1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Signup1 implements Filter {
	
	FilterConfig con=null;

public void init (FilterConfig con)
 { 
				this.con=con;
	System.out.print(" this is filter config");
 }
@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
{
	// program for the first package Filter1...
	
	/*String name=request.getParameter("username");
	String pass=request.getParameter("password");
	String phone=request.getParameter("phone");
	if(name.equals("ducat")&&pass.equals("ducat"))
	{
		try {
			
			chain.doFilter(request, response);
			 this itself is sending the objects of request and response...and the next statement of dispatcher 
			 * will again send thereby we have commented that
			//and where to send the objects it finds from web.xml
			
			//request.getRequestDispatcher("servlet").include(request, response);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
	else { try {
		PrintWriter out=response.getWriter();
		out.println("please fillin correct details");
		out.println("<html><body bgcolor='silver'><a href='signup.html'><br>");
		out.println("<input type='button' value='login again'>");
		out.println("</a></body></html>");
				//request.getRequestDispatcher("signup.html").include(request, response);
		}
	
	catch(Exception e)
	{
		System.out.print(e);
	}
	}

		
 
public void destroy() {}
} */

// program for second package Filter2...
	System.out.print("heyyaaa!!!");
	int id=Integer.valueOf(request.getParameter("id"));
	String who=request.getParameter("admin");
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String username=request.getParameter("username");
	String pass=request.getParameter("password");

 
	Connection conn=null;
	
	String driver=con.getInitParameter("driver");
	String url=con.getInitParameter("url");
	String user=con.getInitParameter("user");
	String pass2=con.getInitParameter("pass");
	// System.out.print(driver + "hiiiiiiiiiiiii  ");
	
	try {
		
	Class.forName(driver);
	/*try {
		PrintWriter out=response.getWriter();	
		out.print("done!!!");
	}
	catch(Exception e)
	{}*/
	
	
	conn=DriverManager.getConnection(url, user, pass2);
	 String query="insert into Filter values(?,?,?,?,?,?)";

	 PreparedStatement ps=conn.prepareStatement(query);
	ps.setInt(1,id);
	ps.setString(2,who);
	ps.setString(3, name);
	ps.setLong(4,Long.parseLong(phone));
	ps.setString(5, username);
	ps.setString(6, pass);
	int i=ps.executeUpdate();
	
	

	if(i!=0) {
		PrintWriter out=response.getWriter();	
	out.print("data submitted succesfully");
	
				//HttpServletResponse httpresponse=(HttpServletResponse)response;
				//httpresponse.sendRedirect("login.html");
				chain.doFilter(request, response);
	}
	
		
	
	}
	catch (Exception e)
	{
		System.out.print(e + "helloooooooo  ");
	}
	
	
	
}
public void destroy() {
}
}


