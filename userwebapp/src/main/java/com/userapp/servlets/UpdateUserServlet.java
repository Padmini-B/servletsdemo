package com.userapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/updateServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	public void init() {
		System.out.println("initializing addservlet...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "*Paddu@18");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside post method...");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Statement statement = con.createStatement();
			// update user set password = 'newpassword' where email = 'jwil@example.com'
			int result = statement.executeUpdate("update user set password = '" + password + "' where email='" + email + "'");
			PrintWriter out = response.getWriter();
			if (result > 0) {
				out.println("<h1>Password updated</h1>");
			} else {
				out.println("<h1>Error updating the password</h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			if (con != null) {
				con.close();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	

}
