package sbi.multi.example;

public class Demo {
public synchronized	void display()
	{
		for( int i=1;i<=10;i++)
		{
			System.out.println("value of i is: "+i);

		}

	}
}
