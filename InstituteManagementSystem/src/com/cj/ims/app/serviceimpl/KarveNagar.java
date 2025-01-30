package com.cj.ims.app.serviceimpl;

import java.util.Scanner;
import java.util.*;

import com.cj.ims.app.model.Batch;
import com.cj.ims.app.model.Course;
import com.cj.ims.app.model.Faculty;
import com.cj.ims.app.model.Student;
import com.cj.ims.app.servicesi.CJC;

public class KarveNagar implements CJC {
	List<Course> cList = new ArrayList<Course>();
	List<Faculty> fList = new ArrayList<Faculty>();
	List<Batch> bList = new ArrayList<>();
	List<Student> sList = new ArrayList<>();
	
	//Course c = new Course();
	Faculty f = new Faculty();
	Student st = new Student();
	Batch b = new Batch();

	Scanner s = new Scanner(System.in);
	
	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.println("Enter a Course Id:");
		c.setCid(s.nextInt());
		
		System.out.println("Enter a Course Name:");
		c.setCourseName(s.next());
		cList.add(c);
		
	}

	@Override
	public void viewCourse() {
		System.out.println("CID   | Course");
		for(Course c : cList) {
			System.out.println("    "+c.getCid()+"   "+c.getCourseName());
		
		}

	}

	@Override
	public void addFaculty() {
		
		System.out.println("Enter a Fid");
		f.setFid(s.nextInt());
		System.out.println("Enter a Name:");
		f.setFacultName(s.next());
		//f.setC(c);
		System.out.println("Assign any one course to faculty");
		viewCourse();
		
		int cid = s.nextInt();
		for(Course c : cList) {
			if(c.getCid()==cid) {
				f.setC(c);
			}
		}
		fList.add(f);
		

	}

	@Override
	public void viewFaculty() {
		// TODO Auto-generated method stub
		System.out.println("FID    |FNAME     |COURSE");
		for(Faculty f : fList) {
			System.out.println(""+f.getFid()+"    "+f.getFacultName()+"    "+f.getC().getCourseName());
		}

	}

	@Override
	public void addBatch() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a BatchId:");
		b.setBid(s.nextInt());
		
		System.out.println("Enter a Batch Name:");
		b.setName(s.next());
		
		viewFaculty();
		System.out.println("Enter Faculty ID:");
		int fid = s.nextInt();
		for(Faculty f : fList) {
			if(f.getFid()==fid) {
				b.setF(f);
			
		}
		bList.add(b);

		
	}
	}

	@Override
	public void viewBatch() {
		// TODO Auto-generated method stub
		System.out.println("Bid   | BatchName   |   FacultyName");
		for(Batch b : bList) {
			System.out.println(""+b.getBid()+"    "+b.getName()+"    "+ b.getF().getFacultName()+"   ");
		}
		
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter Student ID:");
		st.setSid(s.nextInt());
		
		System.out.println("Enter Student Name:");
		st.setSname(s.next());
		
		viewBatch();
		
		System.out.println("Enter a Batch ID:");
		int bid = s.nextInt();
		
		for(Batch b : bList) {
			if(b.getBid()==bid) {
				st.setB(b);
			}
			else {
				System.out.println("wrong input");
			}
		}
		
	sList.add(st);
		
		
		
		
	}

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("  SID   |    SNAME    |    BATCH    |  FacultyId   |  Faculty Name  |  Course Id   | Course Name   ");
		

		
		for(Student st : sList) {
			System.out.println("abc");
			System.out.println(st.getSid()+"    |    "+st.getSname()+"    |    "+st.getB().getName()+"    |    "+st.getB().getF().getFid()+"    |    "
					+st.getB().getF().getFacultName()+"    |    "+" "
					+st.getB().getF().getC().getCid()+"    |    "+" "
					+st.getB().getF().getC().getCourseName());
					
			
		}
	
		
	}

}
