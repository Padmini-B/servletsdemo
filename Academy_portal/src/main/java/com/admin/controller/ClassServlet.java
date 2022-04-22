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

import com.admin.model.Classes;
import com.admin.util.ClassDataUtil;


@WebServlet("/classServlet")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Classes> classes = ClassDataUtil.getClasses(); 
		
		request.setAttribute("classesList", classes);
		RequestDispatcher rd = request.getRequestDispatcher("/view_classes.jsp");
		
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String sub=request.getParameter("sub");
		int cls=Integer.parseInt(request.getParameter("cls"));
		String teacher=request.getParameter("teacher");
		String sec=request.getParameter("sec");
		String time=request.getParameter("time");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();){	
			//int res=statement.executeUpdate("update classes set Teacher='"+teacher+"' and Section='"+sec+"' where Subject='"+name+"'");
			int res=statement.executeUpdate("insert into classes values('"+cls+"','"+sec+"','"+teacher+"','"+sub+"','"+time+"')");
			if(res>0)
			{
				out.println("<b>Teacher assigned successfully</b>");
			}
			else
			{
				out.println("<b>Error occured during assigning</b>");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 	
		
	}
}
