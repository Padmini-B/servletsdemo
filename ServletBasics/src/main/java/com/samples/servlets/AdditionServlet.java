package com.samples.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String number1=req.getParameter("Number1");
		String number2=req.getParameter("Number2");
		PrintWriter out=res.getWriter();
		if(number1!=null && number2!=null && number1.trim().length()>0 && number2.trim().length()>0)
		{
		    int n1 = Integer.parseInt(number1);
			int n2=Integer.parseInt(number2);
			out.println("<p>"+"Result: "+ (n1+n2)+"</p>");
		}
		else
		{
			out.println("<p>Invalid Input</p>");
		}
	}
	
}
