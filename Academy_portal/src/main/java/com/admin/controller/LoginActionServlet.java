package com.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con= DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from user where Username='"+name+"' and Password='"+pass+"'");
			if(rs.next())
			{
				//response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.println("<style>");
				out.println("h2{");
				out.println("Color:red;");
				out.println("}");
				out.println("</style>");
				out.println("<h2>Login Failed,Invalid Credentials</h2>");

				RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
				rd.include(request, response);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}


