package com.example.ddd;

public class Prodcut  extends Thread{
	Demo d1;
	
	public Prodcut(Demo d1) {
		super();
		this.d1 = d1;
	}

	public void run()
	{
		synchronized (d1) {
			System.out.println("We are in the product class");
			System.out.println("our execution done");
			d1.notify();
		}
	}
}
