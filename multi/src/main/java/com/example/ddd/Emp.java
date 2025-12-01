package com.example.ddd;

public class Emp  extends Thread{
	Demo d1;
	public Emp(Demo d1) {
		super();
		this.d1 = d1;
	}
	public void run()
	{
		synchronized (d1) {
			System.out.println("Welcome to Emp class");
			try {
				d1.wait();
				System.out.println("We are in the try block");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("Wehave done from Emp class");
		}
	}

}
