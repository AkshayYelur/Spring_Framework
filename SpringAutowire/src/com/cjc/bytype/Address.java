package com.cjc.bytype;

public class Address {
private String padd;
private String ladd;
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
@Override
public String toString() {
	return "Address [padd=" + padd + ", ladd=" + ladd + "]";
}
}
