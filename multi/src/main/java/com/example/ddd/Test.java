package com.example.ddd;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Emp e1=new Emp(d1);
		Prodcut p1=new Prodcut(d1);
//		Emp e2=new Emp(d1);
//		Emp e3=new Emp(d1);
		e1.start();
		p1.start();
//		e2.start();
//		e3.start(); 
	}
}
