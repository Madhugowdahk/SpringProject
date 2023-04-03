package requestdispatch.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {

	
	
	//i am changing dopost to doget bcz senddirect by default it will call doget method
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
		PrintWriter	out=resp.getWriter();
		out.print("<h1>welcome to home page</h1>");
	}

}
