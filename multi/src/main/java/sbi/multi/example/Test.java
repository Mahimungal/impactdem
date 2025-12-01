package sbi.multi.example;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Runnable r1=new Data(d1);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
//		 t1.start();
//		 t2.start();
//		 t3.start();
		
//		t1.run();t2.run();t3.run();
	}
}
