package myservlet11;
import  java.io.*;
import javax.servlet.*;
public class MyServlet implements Servlet {
 public void init (ServletConfig con) {}
 public void service ( ServletRequest req, ServletResponse res) throws IOException, ServletException
 { 
		PrintWriter out= res.getWriter();
		out.println("Hello Servlet");
 }
 public void destroy()
 {
 System.out.print("destroy"); 
 }
 public String getServletInfo()
 {
 return "CREATED ON 24/05/2018";
 }
 public ServletConfig getServletConfig()
 {
 return null;
 }
}