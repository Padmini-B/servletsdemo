package com.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.model.Student;
import com.admin.model.Subject;
import com.admin.model.Teacher;

@WebServlet("/reportServlet")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		List<Student> students = new ArrayList<Student>();
		List<Subject> subjects = new ArrayList<Subject>();
		List<Teacher> teachers = new ArrayList<Teacher>();
		int cls=Integer.parseInt(request.getParameter("cls"));
		String sec=request.getParameter("sec");
		String sub=request.getParameter("sub");
		String teacher=request.getParameter("teacher");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();)
		{	
			ResultSet rs1=statement.executeQuery("select * from students where Class='"+cls+"' and Section='"+sec+"'");
			while (rs1.next()) {
				Student student = new Student(rs1.getInt(1), rs1.getString(2), rs1.getString(3),rs1.getString(4), rs1.getString(5), rs1.getString(6),rs1.getInt(7));
				students.add(student);
			}
			
			ResultSet rs2 = statement.executeQuery("select * from subjects s,classes c where s.Name=c.Subject and c.Id='"+cls+"' and c.Section='"+sec+"'");
			while (rs2.next()) {
				Subject subject = new Subject(rs2.getInt(1), rs2.getString(2), rs2.getString(3));
				subjects.add(subject);
			}
			
			ResultSet rs3 = statement.executeQuery("select * from teachers t,classes c where c.Teacher=t.Firstname and c.Id='"+cls+"' and c.Section='"+sec+"'");				
			while (rs3.next()) {
				Teacher tea = new Teacher(rs3.getInt(1), rs3.getString(2), rs3.getString(3),rs3.getInt(4));
				teachers.add(tea);
			}
			request.setAttribute("st_List", students);
			request.setAttribute("sub_List", subjects);
			request.setAttribute("tea_List", teachers);
			request.setAttribute("Class",cls);
			request.setAttribute("Section",sec);
			RequestDispatcher rd = request.getRequestDispatcher("view_reports.jsp");
			rd.forward(request, response);
		}catch (SQLException e) {
			e.printStackTrace();
		} 	
		
	}
}
