package com.cjc.constructorbased.objecttype;

public class Student1 {

	int rollno;
	String name;
	Address1 add;
	
	
	public Student1(int rollno,String name,Address1 add) {
		super();
		this.rollno=rollno;
		this.name=name;
		this.add=add;
	}


	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
	}


	
	
	
}
