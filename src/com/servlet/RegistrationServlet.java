package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.service.UserService;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	//Servlet used to register a user
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		UserService us = new UserService();

		com.model.Registration reg = new com.model.Registration(request.getParameter("username"),request.getParameter("email"), request.getParameter("password"));
		
		boolean validReg = us.registration(reg);
		if(validReg) 
		{
			HttpSession ses = request.getSession();
			ses.setAttribute("sesname", request.getParameter("username"));
			response.sendRedirect("validRegistration.jsp");
		}
	}

}
