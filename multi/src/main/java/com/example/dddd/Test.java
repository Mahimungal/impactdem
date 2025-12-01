package com.example.dddd;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		//Data d3=new Data();
		//Data d4=new Data();
		//Data d5=new Data();
		//Data d6=new Data();
		ThreadGroup t1=new ThreadGroup("A");
		ThreadGroup t2=new ThreadGroup("B");

		Thread tt=new Thread(t1, d1);
		Thread tt1=new Thread(t1, d2);


		System.out.println(t1.getName());

	}

}

