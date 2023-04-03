package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method call");
	}

	

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method call");// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method call");
		System.out.println("service method call");// TODO Auto-generated method stub
		//we can show some msgs to user like this
		res.setContentType("text/html");
		PrintWriter	out=res.getWriter();
		out.println("welcome to IT");
		//out.println can also be used
		System.out.println("today"+new Date().toString());
		System.out.println(getServletInfo());
		System.out.println(getServletConfig());
	}// TODO Auto-generated method stub
		
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
