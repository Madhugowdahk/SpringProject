package requestdispatch.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String em=req.getParameter("em");
		String pas=req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter	out=resp.getWriter();
		RequestDispatcher rd;
		if("madhugowdahk70@gmail.com".equals(em)&&"demo".equals(pas))
		{
			//rd=req.getRequestDispatcher("/Secondservlet");
			//home page redirect
			//rd.forward(req, resp);
			resp.sendRedirect("Secondservlet");
					
		}
		else
		{
		//redirect login page
			out.println("<h1>invalid email or password</h1>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			
		}
	}

}
