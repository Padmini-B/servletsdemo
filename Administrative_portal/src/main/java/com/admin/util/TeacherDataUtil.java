package com.admin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.model.Teacher;

public class TeacherDataUtil {
	public static List<Teacher> getTeachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from teachers");				
		) {

			while (rs.next()) {
				Teacher student = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4));
				teachers.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return teachers;
	}	
	
}
