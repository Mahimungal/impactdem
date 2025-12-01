package sbi.multi.demo;

public class Data implements Runnable{
	Product p1;


	public Data(Product p1) {
		super();
		this.p1 = p1;
	}


	@Override
	public void run() {
		synchronized (p1) {
			p1.demo();
		}

	}

}
