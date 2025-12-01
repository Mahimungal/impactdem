package sbi.multi.demo;

public class Test {
	public static void main(String[] args) {
		Product p1=new Product();
		Runnable r1=new Data(p1);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
	}
}
