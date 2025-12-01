package com.demo.example;

public class Emp {

	public synchronized static void demo()
	{
		for( int i=1;i<=20;i++)
		{
			System.out.println(i);
			
		}
		
	}
}
