package com.cjc.constructor;

public class Student {
private int rollno;
private String name;
private Address add;
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
}
public Student(int rollno, String name, Address add) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.add = add;
}
}
