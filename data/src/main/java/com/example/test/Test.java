package com.example.test;

import java.util.Scanner;

import com.example.repository.Create;
import com.example.repository.Delete;
import com.example.repository.Fetch;
import com.example.repository.Update;
import com.example.service.CreateService;
import com.example.service.DeleteService;
import com.example.service.FetchService;
import com.example.service.UpdateService;



public class Test {
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("*******College Mgnt System********");
			System.out.println("1.Add Principle");
			System.out.println("2.Update Principle");
			System.out.println("3.Delete Principle");
			System.out.println("4.Fetch Principle");
			System.out.println("Enter Your Choice");
			Scanner s1=new Scanner(System.in);
			int ch=s1.nextInt();
			switch (ch) {
			case 1:
				Create c1=new CreateService();
				c1.addData();
				break;
			case 2:
				Update u1=new UpdateService();
				u1.updateData();
				break;
			case 3:
				Delete d1=new DeleteService();
				d1.deleteData();
				break;
			case 4:
				Fetch f1=new FetchService();
				f1.readData();
				break;
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
}
