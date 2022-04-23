package com.admin.model;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String classs;
	private String section;
	private String email;
	private int age;
	
	public Student(int id, String firstName, String lastName, String classs, String section, String email, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.classs = classs;
		this.section = section;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}