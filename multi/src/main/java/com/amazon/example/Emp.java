package com.amazon.example;

public class Emp extends Thread{
	public void run()
	{
		for( int i=1;i<=10;i++)
		{ 

			System.out.println(i);
			Thread.yield();
		}
	}

}
