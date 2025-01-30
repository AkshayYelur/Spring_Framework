package com.cjc.product;

public class Address {
int pincode;
String area;
String city;

@Override
public String toString() {
	return "Address [pincode=" + pincode + ", area=" + area + ", city=" + city + "]";
}

public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
