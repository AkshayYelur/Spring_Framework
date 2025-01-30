package com.cjc.product;

import java.util.List;
import java.util.Set;

public class Supplier {
String sname;
List<Long> contact;
Set<String> email;
@Override
public String toString() {
	return "Supplier [sname=" + sname + ", contact=" + contact + ", email=" + email + ", addr=" + addr + "]";
}
Address addr;

public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<Long> getContact() {
	return contact;
}
public void setContact(List<Long> contact) {
	this.contact = contact;
}
public Set<String> getEmail() {
	return email;
}
public void setEmail(Set<String> email) {
	this.email = email;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}


}
