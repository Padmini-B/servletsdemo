package com.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.model.Teacher;
import com.admin.util.TeacherDataUtil;


@WebServlet("/teacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Teacher> teachers = TeacherDataUtil.getTeachers();
		
		request.setAttribute("teachersList", teachers);
		RequestDispatcher rd = request.getRequestDispatcher("/view_teachers.jsp");
		
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int age=Integer.parseInt(request.getParameter("age"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();)
		{	
			int res=statement.executeUpdate("insert into teachers values('"+id+"','"+fname+"','"+lname+"','"+age+"')");
			if(res>0)
			{
				out.println("<h1>Teacher Entry done successfully</h1>");
				//RequestDispatcher rd = request.getRequestDispatcher("middle.jsp");
				//rd.forward(request, response);
				
			}
			else
			{
				out.println("<h1>Error occured during entry</h1>");
				//RequestDispatcher rd = request.getRequestDispatcher("middle.jsp");
				//rd.include(request, response);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 	
		
	}

}
