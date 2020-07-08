package p1;
import java.io.IOException;
import javax.servlet.*;
import java.io.*;
public class Address implements Servlet {
	private static final long serialVersionUID = 1L;
    public void init(ServletConfig con)throws ServletException 
    {
        // TODO Auto-generated constructor stub
    }
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
    {
    	PrintWriter out=res.getWriter();
    	out.print("<html><body bgcolor='cyan'>");
    	out.println("MY NAME IS   = VINAY");
    	out.print("<br>");
    	out.println("MY ADDRESS IS   =  C-105 HARSHVIHAR ");
    	out.print("<br>");
    	out.println("MAIL IS  = KHGADLHI1553@GMAIL.COM ");
    	out.print("</body></html>");
    }
    public void distroy()
    {
    	
    }
    public String getServletInfo()
    {
    	return null;
    }
    public ServletConfig getServletConfig()
    {
    	return null;
    }
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
    
	}
