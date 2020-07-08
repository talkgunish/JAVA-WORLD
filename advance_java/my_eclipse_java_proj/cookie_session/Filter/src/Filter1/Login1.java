package Filter1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Login1
 */
@WebFilter("/Login1")

public class Login1 implements Filter {
	
	FilterConfig con=null;
	public void init(FilterConfig con) throws ServletException
	{
	this.con=con;
	}

    /**
     * Default constructor. 
     */
    public Login1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		//PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String who=request.getParameter("who");
		String pass=request.getParameter("password");
		
		
		String driver=con.getInitParameter("driver");
		String url=con.getInitParameter("url");
		String user2=con.getInitParameter("user");
		String pass2=con.getInitParameter("pass");
		
		Connection conn=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user2,pass2);
			String query="select * from filter where username=? and who=? and password=?";
			PreparedStatement ps=conn.prepareStatement(query);
			
			ps.setString(1, user);
		ps.setString(2, who);
		ps.setString(3, pass);
		ResultSet rs=ps.executeQuery();
		
		
		while(rs.next())
		{System.out.print("this is working");
			if(who.equals("Admin")) {
			HttpServletRequest httprequest=(HttpServletRequest)request;
			HttpSession session=httprequest.getSession();
			session.setAttribute("user", user);
			chain.doFilter(request, response);		
//request.getRequestDispatcher("Welcome1").forward(request, response); 
		}
		else
		{
			HttpServletRequest httprequest=(HttpServletRequest)request;
			HttpSession session=httprequest.getSession();
			session.setAttribute("user", user);
			chain.doFilter(request, response);
			//request.getRequestDispatcher("Welcome1").forward(request,response);
		}
		}
		
		}
		catch(Exception e) {
			System.out.print(e);
		}
		}
		
		
		
	
	
	public void destroy() {
		// TODO Auto-generated method stub
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	

}
