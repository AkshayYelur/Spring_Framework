package com;

public class Student {
	
	
	private String name;
	private int id;
	private String course;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Student() {
		
		System.out.println("This is a student class....");
	}

}
