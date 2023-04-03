package com.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int fn=Integer.parseInt(req.getParameter("fn"));
		int sn=Integer.parseInt(req.getParameter("sn"));
		
		int sum =(int) req.getAttribute("su");
		int mul=fn*sn;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>sum="+sum+" "+mul+"</h1>");
		
	}

}