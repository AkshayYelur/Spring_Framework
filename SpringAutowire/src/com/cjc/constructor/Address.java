package com.cjc.constructor;

public class Address {
private String padd;
private String ladd;
public Address(String padd, String ladd) {
	super();
	this.padd = padd;
	this.ladd = ladd;
}
@Override
public String toString() {
	return "Address [padd=" + padd + ", ladd=" + ladd + "]";
}

}
