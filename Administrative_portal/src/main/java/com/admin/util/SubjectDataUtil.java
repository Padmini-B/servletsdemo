package com.admin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.model.Subject;

public class SubjectDataUtil {
	public static List<Subject> getSubjects() {
		List<Subject> subjects = new ArrayList<Subject>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from subjects");				
		) {

			while (rs.next()) {
				Subject sub = new Subject(rs.getInt(1), rs.getString(2), rs.getString(3));
				subjects.add(sub);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 		
		return subjects;
	}	
}
