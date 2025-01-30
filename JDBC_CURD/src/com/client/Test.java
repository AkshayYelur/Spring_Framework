package com.client;

import java.util.Scanner;

import com.service.Requirements;
import com.serviceimplements.Data;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Requirements r = new Data();
		System.out.println("Enter a Operation:");
		System.out.println("1.Create Table");

		System.out.println("2.Insert Data");

		System.out.println("3.View Single Data");

		System.out.println("4.View All Data");

		System.out.println("5.Update Data");

		System.out.println("6.Delete Single Data");

		System.out.println("7.Delete All Data ");

		System.out.println("8.Delete Table");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1: {
			r.createTable();
			System.out.println("Table is  Created....");
			break;
		}
		case 2: {
			r.insertData();
			System.out.println("Data Inserted Successfully...");
			break;
		}
		case 3: {
			r.viewSingleData();
			System.out.println("Signle Data Displayed....");
			break;
		}
		case 4: {
			r.viewAllData();
			System.out.println("Displayed All Data Sucessfully....");
			break;
		}
		case 5: {

			r.updateData();
			System.out.println("Data Updated Successfully...");
			break;
		}
		case 6: {
			r.deleteSingleData();

			System.out.println("Single Data Deleted Successfully.....");
			break;
		}
		case 7: {
			r.deleteAllData();
			System.out.println("All Data Deleted Successfully...");
			break;
		}
		case 8: {
			r.deleteTable();
			System.out.println("Table Deleted Successfully..");
			break;
		}
		default:
			System.out.println("Enter the number betwwen 1 to 8 ");

		}

	}

}
