package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SuccessPage
 */
@WebServlet("/success")
public class SuccessPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(session==null) {
			out.print("<center><span style='color:red;'>COMMON LOGIN FIRST</span></center>");
		}else {
		
		//out.print("<h2>User with username - "+request.getParameter("username")+" logged in successfully</h2> ");
			User user=(User) session.getAttribute("user");
			out.print("<h2>User with username - "+user.getUsername()+" logged in successfully at "+new Date(session.getCreationTime())+"</h2> ");
		out.print("<a href='logoff'>Click here to Logout</a>");
		}
	}

}
