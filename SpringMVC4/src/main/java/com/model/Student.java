package com.model;

public class Student {

	private int rollno;
	private String name;
	private String username;
	private String password;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	
}
