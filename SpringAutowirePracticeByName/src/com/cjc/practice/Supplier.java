package com.cjc.practice;

import java.util.List;
import java.util.Set;

public class Supplier {

	private int sid;
	private String name;
	private List<Long> contact;
	private Set<String> email;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
	
	
}
