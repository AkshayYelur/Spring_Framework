package com.cjc.product;

public class Product {
String pname;
double price;
String color;
int qty;
Supplier sup;

@Override
public String toString() {
	return "Product [pname=" + pname + ", price=" + price + ", color=" + color + ", qty=" + qty + ", sup=" + sup + "]";
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Supplier getSup() {
	return sup;
}
public void setSup(Supplier sup) {
	this.sup = sup;
}

}
