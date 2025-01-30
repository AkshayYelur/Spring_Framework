package com.cj.ims.app.model;

public class Faculty {
private int fid;
private String facultName;
private Course c;

public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFacultName() {
	return facultName;
}
public void setFacultName(String facultName) {
	this.facultName = facultName;
}
public Course getC() {
	return c;
}
public void setC(Course c) {
	this.c = c;
}
}
