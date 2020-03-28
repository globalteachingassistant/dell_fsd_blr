package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bo.LoginBO;
import com.bo.impl.LoginBoImpl;
import com.exception.BusinessException;
import com.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		User user=new User(request.getParameter("username"), request.getParameter("password"));
		LoginBO loginBO=new LoginBoImpl();
		RequestDispatcher rd=null;
		try {
			if(loginBO.isValidUser(user)) {
	//			rd=request.getRequestDispatcher("success");
	//			rd.forward(request, response);
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("success");
			}
		} catch (BusinessException e) {
		//	rd=request.getRequestDispatcher("index.html");
			rd=request.getRequestDispatcher("index.jsp");
			//rd.include(request, response);
			request.setAttribute("error", e.getMessage());
			rd.forward(request, response);
			//out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

}
