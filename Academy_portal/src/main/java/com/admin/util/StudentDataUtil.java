package com.admin.util;

import java.util.ArrayList;
import java.util.List;

import com.admin.model.Student;

import java.sql.*;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from students");				
		) {

			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7));
				students.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return students;
	}	
}