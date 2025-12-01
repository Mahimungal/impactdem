package sbi.multi.example;

public class Data implements Runnable {

	Demo d1;
	
	public Data(Demo d1) {
		super();
		this.d1 = d1;
	}

	@Override
	public void run() {
		d1.display();

	}

}
