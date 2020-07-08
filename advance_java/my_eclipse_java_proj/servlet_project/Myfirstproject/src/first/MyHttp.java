package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class MyHttp
 */
@WebServlet("/MyHttp")
public class MyHttp extends GenericServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyHttp() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	PrintWriter out=response.getWriter();
		 out.println("this is my first Generic program");
	}

}
