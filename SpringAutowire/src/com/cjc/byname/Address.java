package com.cjc.byname;

public class Address {

private String padd;
private String ladd;
@Override
public String toString() {
	return "Address [padd=" + padd + ", ladd=" + ladd + "]";
}
public String getPadd() {
	return padd;
}
public void setPadd(String padd) {
	this.padd = padd;
}
public String getLadd() {
	return ladd;
}
public void setLadd(String ladd) {
	this.ladd = ladd;
}
	
	
	
}
