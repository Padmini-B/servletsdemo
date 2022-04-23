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

import com.admin.model.Subject;
import com.admin.util.SubjectDataUtil;

@WebServlet("/subjectServlet")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Subject> subjects = SubjectDataUtil.getSubjects(); 
		
		request.setAttribute("subjectsList", subjects);
		RequestDispatcher rd = request.getRequestDispatcher("/view_subjects.jsp");
		
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("sub");
		int cls=Integer.parseInt(request.getParameter("cls"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();){	
			int res=statement.executeUpdate("update subjects set Class='"+cls+"' where Name='"+name+"'");
			if(res>0)
			{
				out.println("<b>Class assigned successfully</b>");
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
