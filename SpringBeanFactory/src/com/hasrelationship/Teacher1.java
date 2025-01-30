package com.hasrelationship;

import com.Student;

public class Teacher1 {

	private int tid;
	private String tname;
	Student stu;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Teacher1(int tid, String tname, Student stu) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "Teacher1 [tid=" + tid + ", tname=" + tname + ", stu=" + stu + "]";
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
}
