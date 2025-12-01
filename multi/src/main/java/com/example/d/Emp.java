package com.example.d;

public class Emp  extends Thread{

	public void run()
	{
		for( int i=50;i<=60;i++)
		{
			System.out.println(i);
		}
	}
	 void demo() throws InterruptedException
	 {
		 Thread.sleep(54545);
	 }
}
