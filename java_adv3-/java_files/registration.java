package myservlet3;
import  java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class registration extends HttpServlet {
 public void doPost ( ServletRequest req, ServletResponse res) throws IOException, ServletException
 { 
		PrintWriter out= res.getWriter();
		String name, pass;
		name="ducat";
		pass="faridabad";
		String name1=req.getParameter("name");
		String pass1=req.getParameter("pass");
		if(name1.equals("name") && pass1.equals("pass"))
		{
		out.println("valid user");
		}
		else
		{
		out.println("invalid user");
		}
		
 }
}
