package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() 
    {
        super();
    }

    //Servlet used to log users in if the login fails the page reloads, otherwise it goes to the validLogin.jsp
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
		com.service.UserService us = new com.service.UserService();

		com.model.Login login = new com.model.Login(request.getParameter("username"), request.getParameter("password"));

		boolean loginValid = us.login(login);
		
		if (loginValid) 
		{
			HttpSession sess = request.getSession();
			sess.setAttribute("sessname", request.getParameter("username"));
			response.sendRedirect("validLogin.jsp");
		}
		else 
			response.sendRedirect("login.html");
	}
}
