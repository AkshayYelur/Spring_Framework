package com.cjc.practice;

import java.util.List;

public class Customer {

	private int cid;
	private String cname;
	private List<Long> Contact;
	private String address;
	private  Order or;
	
	public Order getOr() {
		return or;
	}
	public void setOr(Order or) {
		this.or = or;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Long> getContact() {
		return Contact;
	}
	public void setContact(List<Long> contact) {
		Contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", Contact=" + Contact + ", address=" + address + ", o="
				+ or + "]";
	}
	
}
