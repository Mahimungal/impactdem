package com.amazon.example;

public class Test {
	public static void main(String[] args) {
		Emp e1=new Emp();
		Demo d1=new Demo();
		Data d2=new Data();
		Thread t1=new Thread(d1);
//		e1.setPriority(10);
//		d2.setPriority(1);
		e1.start();
		
		d2.start();
		t1.start();
	}
}
