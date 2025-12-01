package com.example.d;

public class Data extends Thread{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			 try {
				Thread.sleep(5000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
