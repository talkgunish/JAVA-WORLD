package login_logout_bysession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("username");
		String pw=request.getParameter("password");
		Connection conn=null;
		ServletContext ctx=getServletConfig().getServletContext();
		
		String driver=ctx.getInitParameter("driver");
		String url=ctx.getInitParameter("url");
		String user=ctx.getInitParameter("user");
		String pass=ctx.getInitParameter("pass");
		
		try {
		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pass);
		//out.print("hello signup");
		String query="insert into regpage values(?,?)";
		
		PreparedStatement ps=conn.prepareStatement(query);
		
		
		ps.setString(1, id );
		ps.setString(2, pw);
		
		int i=ps.executeUpdate();
		
		if(i!=0) {
		out.print("data submitted succesfully");
		//response.sendRedirect("https://www.google.com/#q="+id);
		response.sendRedirect("login.html");
			
			
		}
	
	}
	catch(ClassNotFoundException | SQLException e) {
		System.out.println(e);
	}
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
