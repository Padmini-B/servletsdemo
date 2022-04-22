package com.admin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.model.Classes;

public class ClassDataUtil {
	public static List<Classes> getClasses() {
		List<Classes> classes = new ArrayList<Classes>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admin", "root", "*Paddu@18");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from classes");				
		) {

			while (rs.next()) {
				Classes clas = new Classes(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5));
				classes.add(clas);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 		
		return classes;
	}	
}
