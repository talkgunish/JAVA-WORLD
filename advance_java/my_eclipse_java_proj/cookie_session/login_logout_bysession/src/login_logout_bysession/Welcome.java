package login_logout_bysession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
						response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate"); //for http1.1
		response.setHeader("Pragma", "no-cache");// for http1.0
		response.setHeader("Expires", "0");//for proxy enabled http
						if(session!=null) {
							String name=(String)session.getAttribute("id");
								out.print("Hello !!!  "+name);
								
								out.print("<html> <meta charset='UTF-8'>");
								out.print("<body bgcolor='#808080'>");
								out.println("<form action='logout' method='post'>");
								out.println("<h1>HEY THERE WELCOME HERE...</h1><h2>OKAY BYEEE....</h2>");
								out.print("<a href='logout'>");
									out.println("<input type='button' value='logout'></a>");
								//out.print("<input type='submit' value='logout'>");
								out.println("</body>");
								out.print("</html>");
								//request.getRequestDispatcher("Logout").forward(request, response);
								
								
								//response.setDateHeader("Expires", 0);
								return;
						}
		
					
						else {
							
								out.print("babri pooch login karle......");
							
								
								
						}
						session.invalidate();
							
	
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
