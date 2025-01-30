package com.cjc.constructorbased.objecttype;

public class Address1 {
String ladd;
String padd;
public Address1(String ladd, String padd) {
	super();
	this.ladd = ladd;
	this.padd = padd;
}
@Override
public String toString() {
	return "Address1 [ladd=" + ladd + ", padd=" + padd + "]";
}

}
