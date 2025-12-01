package com.demo.d;

public class Data  extends Thread{
	public void run()
	{
		for (int i=50;i<=60;i++)
		{
			System.out.println(i);
		}
	}
}
