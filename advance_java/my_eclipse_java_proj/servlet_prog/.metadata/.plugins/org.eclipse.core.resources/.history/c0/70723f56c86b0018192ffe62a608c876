package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyReg
 */
@WebServlet("/MyReg")
public class MyReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile"); 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pass="system";
			Connection conn=DriverManager.getConnection(url,user,pass);
				
		PreparedStatement ps=conn.prepareStatement("insert into teacher values(?,?,?)");
		
		ps.setInt(1, Integer.parseInt(id));
		ps.setString(2,name);
		ps.setLong(3,Long.parseLong(mobile));
		
			int i=ps.executeUpdate();
			
			if(i!=0) {
				out.print("your data submited sucessfully ....");
			}
			else {
				out.print("went wrong !!! plz try leter ");
			}
			
			
		}
						
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	/*out.print("ID :" + "id");
	out.print("Name :" + "name");
	out.print("Phone No.:" + "mobile");
	*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
