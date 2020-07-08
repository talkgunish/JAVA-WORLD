package login_logout_bysession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_data
 */
@WebServlet("/Login_data")
public class Login_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();

		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		ServletContext ctx=getServletConfig().getServletContext();
						String driver=ctx.getInitParameter("driver");
						String url=ctx.getInitParameter("url");
						String user=ctx.getInitParameter("user");
						String pass=ctx.getInitParameter("pass");
						
						Connection conn=null;
						
						try {
							Class.forName(driver);
							conn=DriverManager.getConnection(url, user, pass);
							String query="select * from regpage where username=? and password=?";
					PreparedStatement ps=conn.prepareStatement(query);
										ps.setString(1, id);
										ps.setString(2, pw);
								ResultSet rs=ps.executeQuery();
								
											
										
										while(rs.next()) {
											
											HttpSession session=request.getSession();
											session.setAttribute("id", id);
								request.getRequestDispatcher("welcomes").forward(request, response);
								
									
								}
										System.out.println("inside login to welcome............  "+ request);
										out.println("user is invalid.... ");
										conn.close();
										ps.close();
										rs.close();
										
						
						}
						catch(Exception e) {
							out.print(e);
							
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
