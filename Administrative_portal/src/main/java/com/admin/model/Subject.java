package com.admin.model;

public class Subject {
	private int id;
	private String name;
	private String shortcut;
	public int getId() {
		return id;
	}
	public Subject(int id, String name, String shortcut) {
		this.id = id;
		this.name = name;
		this.shortcut = shortcut;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
}
