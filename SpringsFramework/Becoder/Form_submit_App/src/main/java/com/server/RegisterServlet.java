package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		String course=req.getParameter("course");
		
		//below code is used for dynamic response
		resp.setContentType("text/html");
	PrintWriter out=	resp.getWriter();
	out.println("<h1> name: "+name+" </h1>");
	out.println("<h1> email: "+email+" </h1>");
	out.println("<h1> password: "+password+" </h1>");
	out.println("<h1> course: "+course+" </h1>");
	}

}
