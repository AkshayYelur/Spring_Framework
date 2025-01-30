package com.cjc.byname;

public class Student {
private int rollno;
private String name;
Address add;
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
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
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
}

}
