package com.demo.d;

public class Test {
 public static void main(String[] args)  {
	Demo d1=new Demo();
	Data d2=new Data();
	d1.start();
	d2.start();
	try {
		d1.join();
		System.out.println("Hellpo");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
}
