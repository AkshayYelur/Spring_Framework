package com.cjc.constructorbased.primitivetype;

public class Student {

	int rollno;
	String name;
	String addr;
	public Student(int rollno, String name, String addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
