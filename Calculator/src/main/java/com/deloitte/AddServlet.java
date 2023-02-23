package com.deloitte;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int c=a+b;
		//RequestDispatcher interface or sendRedirect to send data from one servlet to other
		req.setAttribute("c", c);//key value pair
		RequestDispatcher rd=req.getRequestDispatcher("SquareServlet");
		rd.forward(req, res);
		//we are now passing the servlet data to the other servlet so not printing
		//PrintWriter out=res.getWriter();
		//out.println("Result="+c);
}
}