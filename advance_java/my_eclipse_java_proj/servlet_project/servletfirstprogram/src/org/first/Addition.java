package org.first;

import java.io.IOException;
import javax.servlet.*;
import java.io.*;
/**
 * Servlet implementation class Addition
 */

public class Addition implements Servlet {
	private static final long serialVersionUID = 1L;

	public void  init(ServletConfig con)throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res )throws ServletException,IOException
	{PrintWriter out=res.getWriter();
	int a=10;
	int b=20;
	int c=a+b;
	out.println(c);
	}
	public void  destroy()
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
	}



