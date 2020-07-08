package C1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyCookie
 */
@WebServlet("/MyCookie")
public class MyCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
PrintWriter out=response.getWriter();	
		
		String id=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		//by using cookie
		
	/*Cookie ck=new Cookie("id",id);
		
		response.addCookie(ck);*/
		
		//by using httpsession
		
		HttpSession session=request.getSession();
		session.setAttribute("id",id);

		out.println("name="+id);
		out.println("password="+pass);
	
	out.println("<html><body align='center'>");
	out.println("<form action='nextpage2' method='post'>");
	out.println("<table><tr><td><input type='submit' name='submit'</td></tr></table>");
	out.println("</form></body></html>");
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
