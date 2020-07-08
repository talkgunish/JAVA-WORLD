package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert_Data
 */
@WebServlet("/Insert_Data")
public class Insert_Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert_Data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn;
				PrintWriter out=response.getWriter();
				
				
				String id=request.getParameter("id");
				String name=request.getParameter("name");
				String mobile=request.getParameter("mobile"); 
		
		ServletContext ctx=getServletConfig().getServletContext();
		
		String driver=ctx.getInitParameter("driver");
		String url=ctx.getInitParameter("url");
		String user=ctx.getInitParameter("user");
		String pass=ctx.getInitParameter("pass");
		try {
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, pass);
		PreparedStatement ps=conn.prepareStatement("insert into teacher values(?,?,?)");
		
			ps.setInt(1,Integer.parseInt(id));
			ps.setString(2, name);
			ps.setLong(3, Long.parseLong(mobile));
			
			int i=ps.executeUpdate();
			
			if(i!=0) {
				out.println("data submited sucess.......  ");
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
