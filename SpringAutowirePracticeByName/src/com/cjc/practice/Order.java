package com.cjc.practice;

public class Order {

	private int oid;
	private String oname;
	private String odate;
	private Product p;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", odate=" + odate + ", p=" + p + "]";
	}
	
	
}
