package com.cjc.constructorbased.collectiontype;
import java.util.*;
public class Student2 {

List mylist;
Set myset;
Map mymap;
public Student2(List mylist, Set myset, Map mymap) {
	super();
	this.mylist = mylist;
	this.myset = myset;
	this.mymap = mymap;
}
@Override
public String toString() {
	return "Student2 [mylist=" + mylist + ", myset=" + myset + ", mymap=" + mymap + "]";
}


	
	
}
