package com.hasrelationship;

public class Student1 {

	private int rollno;
	private String sname;
	private String course;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student1(int rollno, String sname, String course) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", sname=" + sname + ", course=" + course + "]";
	}
}
