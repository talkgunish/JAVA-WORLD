=package lll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kkkkk
 */
@WebServlet("/Kkkkk")
public class Kkkkk extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Kkkkk() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out=response.getWriter();
	String name, roll, id, add, number, male;
	String name1=request.getParameter("name");
	String roll1=request.getParameter("roll");
	String id1=request.getParameter("id");
	String add1=request.getParameter("add");
	String num1=request.getParameter("number");
	String gender=request.getParameter("male");
	out.println("Name of user is " + name1);
	out.println("Roll No. of user is " + roll1);
	out.println("Email id of user is " + id1);
	out.println("Address of user is " + add1);
	out.println("phn No. of user is " + num1);
	out.println(" The user is " + gender);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
